package Test.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemo {
    ChromeDriver driver;

    @Test
    public void testLogin() {
    	driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();

        List<WebElement> inventoryItems = driver.findElements(By.className("inventory_item"));
        int numberOfItems = inventoryItems.size();

        Assert.assertEquals(numberOfItems, 6, "The number of items displayed is not equal to 6.");

        driver.quit();
    }
}