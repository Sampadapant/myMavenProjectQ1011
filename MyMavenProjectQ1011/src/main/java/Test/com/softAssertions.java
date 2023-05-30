package Test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertions {
	ChromeDriver driver = new ChromeDriver();
	@Test
	public void TestOutLook() throws InterruptedException {
		driver.get("https://outlook.live.com/owa/");
		driver.findElement(By.cssSelector("a[data-m$='{\"cN\":\"SIGNIN\",\"sN\":\"P6\",\"pV\":\"1\"}']")).click();
		driver.findElement(By.cssSelector("#i0116")).sendKeys("Sampadafhh");
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		Thread.sleep(3000);
		SoftAssert softAssert = new SoftAssert();
		//Title Assertion
		String actualTitle = driver.getTitle();
		String expectedTitle  = "Signn in to your Microsoft account";
		softAssert.assertEquals(actualTitle, expectedTitle);
		
	
	    // currentUrl Assertion
	    String actualURL = driver.getCurrentUrl();
	    String expectedURL = "https://outlook.live.com/owa/";
	    softAssert.assertNotEquals(actualURL,expectedURL);
	    
	    //text Assertion
	    String actualText = driver.findElement(By.cssSelector("#i0116")).getAttribute(expectedURL);
	    String expectedText = "";
	    softAssert.assertEquals(actualText, expectedText);
	    
	    //errorMessage Assertion
	    String actualErrorMessage = driver.findElement(By.cssSelector("#usernameError")).getText();
	    String expectedErrorMessage = "Thattt Microsoft account doesn't exist. Enter a different account or get a new one.";
	    softAssert.assertEquals(actualErrorMessage, expectedErrorMessage);
	    
	    driver.quit();
	    softAssert.assertAll();
	
	}	

} 
