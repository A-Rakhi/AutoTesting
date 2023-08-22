package dataDesign.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {

 private WebDriver driver;
  
 @BeforeMethod
   void setup() {
	 WebDriverManager.chromedriver().setup();
	 this.driver = new ChromeDriver();
	 this.driver.get("https://www.saucedemo.com/");
 }
   
   @AfterMethod
   void close() throws InterruptedException {
	   Thread.sleep(2000);
	   this.driver.quit();
   }
	
   @Test(dataProvider = "dataSet")
   void loginTest(String username , String password) throws InterruptedException {
	   WebElement user = this.driver.findElement(By.id("user-name"));
	   WebElement pwd = this.driver.findElement(By.id("password"));
	   WebElement loginBtn = this.driver.findElement(By.id("login-button"));
//	   System.out.println("Test");
	   
	   user.sendKeys(username);
	   pwd.sendKeys(password);
	   Thread.sleep(2000);
	   loginBtn.click();
   } 
   
   @DataProvider(name="dataSet")
   Object[][] getDataSet(){
//	   Student [] [] studentList = new Student [3][3];
	   Object[][] data = {
			   {"standard_user", "secret_sauce"},
			   {"locked_out_user", "secret_sauce"},
			   {"problem_user", "secret_sauce"},
			   {"perfomance_glitch_user", "secret_sauce"}
	   };
	return data;
   }
   
   public static void main(String[] args) {
		String file = "D:\\Program Files\\Rakhi\\eclipse-workspace\\AutoTesting\\data\\dataExcel.xlsx";
		String sheetName = "dataSheet";
		ExcelHandler ex = new ExcelHandler(file, sheetName);
		System.out.println(ex.getRowNum());
	}
   
}
