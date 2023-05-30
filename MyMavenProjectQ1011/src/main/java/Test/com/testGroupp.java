package Test.com;

import org.testng.annotations.Test;

public class testGroupp {
// group names can be: log in, portfolio, log out, widget
	
	@Test (groups = {"login"} )
	public void testcase1() {
		System.out.println("Test case1 is passed");
	}
	
	@Test (groups = {"login"} )
	public void testcase2() {
		System.out.println("Test case2 is passed");
	}
	
	@Test (groups = {"logout"} )
	public void testcase3() {
		System.out.println("Test case3 is passed");
	}
	
	@Test (groups = {"logout"} )
	public void testcase4() {
		System.out.println("Test case4 is passed");
	}
	
	@Test (groups = {"portfolio"} )
	public void testcase5() {
		System.out.println("Test case5 is passed");
	}
}
