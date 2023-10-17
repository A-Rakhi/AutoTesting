package listenTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;
import screenshotselenium.TakeScreenShot;

public class CustomListener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart : " + result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess : " + result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure : " + result.getName());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/css/");
        TakeScreenShot.takeScreenShot(driver);
        driver.quit();
	
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped : " + result.getName());
	}
	public void onStart(ITestContext context) {
		System.out.println("onStart : " + context.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("onFinish : " + context.getName());
	}
	

}
