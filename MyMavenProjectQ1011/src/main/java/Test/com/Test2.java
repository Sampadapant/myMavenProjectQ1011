package Test.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority =2)
	public static void login() {
		 System.out.println("Login Successful");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this will run before every method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("this will run after every method");
	}
	@Test(priority =1)
	public static void login1() {
		 System.out.println("Login1 is Successful");
	}
	
}
