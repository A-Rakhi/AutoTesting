package DemosDesignSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BrowserHandler;

public class AlertTesting extends BrowserHandler {

	@BeforeMethod
	void setURL() {
		this.driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

	@Test
	void alertTest() throws InterruptedException {
		WebElement alertBtn = this.driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alertBtn.click();

		Alert alert = this.driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(4000);
		alert.accept();
		Thread.sleep(4000);

	}

//	@Test
//	void alertPromTest() throws InterruptedException {
//		this.driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//
//		WebElement alertBtn = this.driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
//		alertBtn.click();
//
//		Alert alert = this.driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(4000);
//		alert.sendKeys("submitted");
//		Thread.sleep(4000);
//		alert.accept();
//		Thread.sleep(4000);
//
//	}

}
