package org.frameworks.com;

import org.testng.annotations.Test;

public class Ex_TestNG_Assertion_Test {

	@Test
	public void checkString() {

		String name = "India";
		if(name.equals("India"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
	}

}
