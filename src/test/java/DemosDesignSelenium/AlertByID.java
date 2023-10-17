package DemosDesignSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BrowserHandler;

public class AlertByID extends BrowserHandler {

	@BeforeMethod
	void setURL() {
		this.driver.get("http://eg.com/alerts");
	}
	
	@Test
	void alertTest ()  throws InterruptedException {
 
		WebElement submitBtn = this.driver.findElement(By.id("submitButton"));
		submitBtn.click();

        // Switching to the alert
        Alert alert = driver.switchTo().alert();

        // Getting the text of the alert
        String alertText = alert.getText();
        System.out.println( "Alert text: " + alertText);

        // Clicking the OK button
        alert.accept();

        // Clicking the Cancel button
        alert.dismiss();

        // Sending a text to the alert
        alert.sendKeys("Example text to the alert");

        // Close the browser
        driver.quit();
    }
}
