package org.frameworks.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex_TestNG_Parameterization_Test {

	@Test
	@Parameters("Name")
	public void tech1(String s1) {
		System.out.println("User Name is "+s1);
	}
	@Test
	@Parameters("Pass")
	public void tech2(String s2) {
		System.out.println("User Password is "+s2);
	}
	
}
