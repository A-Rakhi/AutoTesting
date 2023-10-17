package dataDrivenDesign.testing;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {

	private WebDriver driver;

//Excel-testing
	public static void main(String[] args) {
		String file = "D:\\Program Files\\Rakhi\\eclipse-workspace\\AutoTesting\\data\\data.xlsx";
		String sheetName = "dataSheet";

		ExcelHandler ex = new ExcelHandler(file, sheetName);
		System.out.println(ex.getRowCount());
		System.out.println(ex.getColCount());
		System.out.println(ex.getCellDataString(1, 0));
		System.out.println(ex.getCellDataString(1, 1)); // forPasswordShow
	}

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

	@Test(dataProviderClass = ExcelDataProvider.class, dataProvider = "ExternalDataSet")
	void loginTest(String username, String password, String expectedResult) throws InterruptedException {
		WebElement user = this.driver.findElement(By.id("user-name"));
		WebElement pwd = this.driver.findElement(By.id("password"));
		WebElement loginBtn = this.driver.findElement(By.id("login-button"));
//	   System.out.println("Test");

		user.sendKeys(username);
		pwd.sendKeys(password);
		Thread.sleep(2000);
		
		loginBtn.click();
		Thread.sleep(2000);
		
        String logoutLink = ".";
		try {
		this.driver.findElement(By.id("react-burger-menu-btn")).click();
		logoutLink = this.driver.findElement(By.id("logout_sidebar_link")).getText();
//		System.out.println("Logout: " + logoutLink);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		String actualResult = (logoutLink.compareTo("Logout") == 0) ? "Y" : "N" ;
		
		Assert.assertEquals(actualResult, expectedResult);

	}

	@DataProvider(name = "dataSet")
	Object[][] getDataSet() {
//	   Student [] [] studentList = new Student [3][3];
		Object[][] data = { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "perfomance_glitch_user", "secret_sauce" } };
		return data;
	}

}
