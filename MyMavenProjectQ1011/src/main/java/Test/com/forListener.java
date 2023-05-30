package Test.com;

import org.testng.annotations.Test;

import org.testng.Assert;  

public class forListener {
	@Test
	public void sum() {
		int sum  = 0;
		int a = 5;
		int b = 7;
		sum = a+b;
		System.out.println(sum);
	}
	@Test
	public void testFail() {
		System.out.println("test has been failed");
		Assert.assertTrue(false);
	}
	

}
