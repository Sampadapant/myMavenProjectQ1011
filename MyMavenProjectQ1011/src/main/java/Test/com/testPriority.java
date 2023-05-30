package Test.com;

import org.testng.annotations.Test;

public class testPriority {

	@Test(priority =2)
	public void alpha() {
		System.out.println("alpha is called");
	}
	
	@Test(priority = -1 )
	public void beta (){
		System.out.println("beta is called");
	}
	
	
	@Test()
	public void ceta (){
		System.out.println("ceta is called");
	}
	
	@Test(priority = 0 )
	public void delta (){
		System.out.println("delta is called");
	}

}

  
