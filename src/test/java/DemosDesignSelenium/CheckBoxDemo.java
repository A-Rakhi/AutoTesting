package DemosDesignSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BrowserHandler;

public class CheckBoxDemo extends BrowserHandler {
	
	@BeforeMethod
	
	void setURL() {
		this.driver.get("https://jqueryui.com/checkboxradio/");
	}
	
	@Test
	void dragNDrop () throws InterruptedException {
		
		WebElement frame = this.driver.findElement(By.xpath("//iframe"));
		this.driver.switchTo().frame(frame);
		
		WebElement checkBoxSelected = this.driver.findElement(By.id("checkbox-1"));
		checkBoxSelected.click();
		Thread.sleep(4000);
		}

}
