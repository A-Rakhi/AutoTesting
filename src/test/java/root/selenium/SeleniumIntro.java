package root.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumIntro {
    
	@Test
	public static void Test1 (String[] agrs) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("Ostad!!");
//		driver.findElement(By.xpath("")).click();
//		driver.quit();
	}
}
