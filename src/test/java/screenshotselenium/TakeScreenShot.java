package screenshotselenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	
	public static void takeScreenShot(WebDriver driver) {
		
	Date currentDate = new Date();
	
	String screenShotFileName = currentDate.toString().replace(":", "-").replace(" ", "-") ;
	
//	taking-screenshot --
	
	File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(screenShotFile, new File("./screenshots/"+screenShotFileName+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }

}
