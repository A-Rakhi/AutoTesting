package DemosDesignSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BrowserHandler;

public class DragNDropDemo extends BrowserHandler {
	
	@BeforeMethod
	void setURL() {
		this.driver.get("https://jqueryui.com/droppable/");
	}
	
	@Test
	void dragNDrop () throws InterruptedException {
		WebElement frame = this.driver.findElement(By.xpath("//iframe"));
		this.driver.switchTo().frame(frame);
		
		Actions act = new Actions(this.driver);
		
// using sourceElementAndTargetElement --->
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		act.dragAndDrop(sourceElement, targetElement).build().perform();
		
// using findElement --->

//		WebElement drag = this.driver.findElement(By.id("draggable"));
//		WebElement drop = this.driver.findElement(By.id("droppable"));
//		
//		act.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(4000);
		
	}

}
