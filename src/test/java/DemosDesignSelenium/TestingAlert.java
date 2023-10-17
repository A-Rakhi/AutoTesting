package DemosDesignSelenium;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestingAlert {
		
		WebDriver driver;
		
		@BeforeMethod
		void setup() {
			WebDriverManager.edgedriver().setup();
			this.driver = new EdgeDriver();
			this.driver.manage().window().maximize();
			this.driver.get("https://demo.automationtesting.in/Alerts.html");
		}
		
		@AfterMethod
		void end() throws InterruptedException {
			Thread.sleep(2000);
			this.driver.quit();
		}

		@Test
		void alertTest() throws InterruptedException {
			WebElement alertBtn = this.driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			alertBtn.click();
			
			Alert alert = this.driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.accept();
			Thread.sleep(2000);
		}
	}

