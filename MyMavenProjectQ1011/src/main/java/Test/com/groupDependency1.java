package Test.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupDependency1 {
	
	@Test (groups = {"login"})
	public void testCaseOne() { 
		System.out.println("testcase one executed");
		//Assert.assertEquals(false, true);
	}
	
	@Test (groups = {"login"})
	public void testCaseTwo() {
		System.out.println("testcase two executed");
		Assert.assertEquals(false, true);
	}
	
	@Test (dependsOnGroups = {"login"}, groups = {"logout"})
	public void testCaseThree() {
		System.out.println("testcase three executed");
		// Assert.assertEquals(false, true);
 
}
} 