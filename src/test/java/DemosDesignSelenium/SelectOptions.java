package DemosDesignSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BrowserHandler;


public class SelectOptions extends BrowserHandler {
 
	@BeforeMethod
	void setURL() {
		this.driver.get("https://trytestingthis.netlify.app/");
	}
	
	@Test
	void dropDown () throws InterruptedException {
		WebElement dropdown = this.driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown) ;
		selectObject.selectByIndex(2);
		
		Thread.sleep(4000);
		
		selectObject.selectByValue("option 3");
		Thread.sleep(4000);
		selectObject.selectByVisibleText("option 1");
		Thread.sleep(4000);

	}
	
	//selectMulti_OPTIONS
	
	@Test
	void selectMulti () throws InterruptedException {
		WebElement selectMulti = this.driver.findElement(By.id("owc"));
		Select selectObject = new Select(selectMulti) ;
        selectObject.selectByIndex(2);
		
		Thread.sleep(4000);
		
		selectObject.selectByValue("option 3");
		Thread.sleep(4000);
		selectObject.selectByVisibleText("option 1");
		Thread.sleep(4000);
		selectObject.deselectByIndex(2);
		Thread.sleep(4000);
	}
	
}
