package Test.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTesting {
	
	@Test ()
	@Parameters({"user","pass"})
	public void testcase1(String us, String pss) {
		System.out.println(us);
		System.out.println(pss);
	}
	
	@Test ()
	public void testcase2() {
		System.out.println("Test case2 is passed");
	}

	


}
