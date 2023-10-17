package selenium.scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollingDemo {

	private WebDriver driver;
	private JavascriptExecutor jsExec;

	@BeforeMethod
	void setup() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();

		this.driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		this.jsExec = (JavascriptExecutor) this.driver;
	}

	@AfterMethod
	void close() throws InterruptedException {
		Thread.sleep(2000);
		this.driver.quit();
	}

	@Test
	void scrollTestByPixel() throws InterruptedException {
		Thread.sleep(2000);

		this.jsExec.executeScript("window.scrollBy(0, 1500)", "");
		Thread.sleep(4000);

	}
	
	@Test
	void scrollbyVisibleElement() throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement bangladesh = this.driver.findElement(By.xpath("//a[@href='/wiki/Bangladesh']"));
		
		this.jsExec.executeScript("arguments[0].scrollIntoView()", bangladesh);
		Thread.sleep(4000);

	}
	
	@Test
	void scrollToButtomOfThePage() throws InterruptedException {
		Thread.sleep(2000);

		this.jsExec.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		this.jsExec.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		Thread.sleep(4000);

	}

}