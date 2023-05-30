package Test.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenShot {
	@Test
	public void captureScreen () throws IOException {
		ChromeDriver driver = new ChromeDriver();  
		driver.get("https://www.saucedemo.com/");
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(".//screenshot/page.png");
		FileUtils.copyFile(scr, dest);
		
	}

}
 