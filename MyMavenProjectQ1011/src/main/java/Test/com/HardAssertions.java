package Test.com;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertions {
	@Test
	
	public void testExample(){
		int expectedValue = 5;
		int actualValue = 10;
		
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("This line will not execute as the hard assertion failed");
	}
	
	@Test
	
	public void test2Example() {
		int firstValue = 78;
		int finalValue = 60;
		
		Assert.assertEquals(finalValue, firstValue);
		System.out.println("This line will not execute as the hard assertion failed");
	}

}
