package Test.com;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MethodDependency {
	
	@Test
	public void A() { 
		System.out.println("A executed");
		//Assert.assertEquals(false, true);
	}
	
	@Test (dependsOnMethods = {"A"})
	public void B() {
		System.out.println("B executed");
		//Assert.assertEquals(false, true);
	}
	
	@Test (dependsOnMethods = {"B"})
	public void C() {
		System.out.println("C executed");
		// Assert.assertEquals(false, true);
	}
	
//	@Test (dependsOnMethods = {"C"})
//	public void D() {
//		System.out.println("D executed");
//	}
	
	@Test (dependsOnMethods = {"C","B"})
	public void E() {
		System.out.println("E executed");
	}
	
	

}
