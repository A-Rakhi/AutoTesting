package screenshotselenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo {
	WebDriver driver;
	
	@BeforeMethod
	void setup() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://google.com");
	}
	
	@AfterMethod
	void close() {
		this.driver.quit();
	}
	
	@Test
	void screenShot() {
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		String screenShotFileName = currentDate.toString().replace(":", "-").replace(" ", "-") ;
		System.out.println(screenShotFileName);

		
//		taking-screenshot --
		
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShotFile, new File("./screenshots/"+screenShotFileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
//	
//	@Test
//	void screenShotSingle() {
//			
////		taking-screenshot --
//		
//		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(screenShotFile, new File("./screenshots/file.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	 }
//	
	}


