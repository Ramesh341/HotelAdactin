package org.frameworks.com;

import org.testng.annotations.Test;

public class Ex_TestNG_Dependencies_Test {
	
	@Test
	public void primarySchool() {
		System.out.println("LKG to Fifth");
	}
	@Test(dependsOnMethods="primarySchool")
	public void highSchool() {
		System.out.println("Sixth to Tenth");
	}
	@Test(dependsOnMethods="highSchool")
	public void secondarySchool() {
		System.out.println("11th to 12th");
	}
	@Test(dependsOnMethods="secondarySchool")
	public void engineering() {
		System.out.println("B.E.");
	}
	@Test(dependsOnMethods="engineering")
	public void masterGraduate() {
		System.out.println("Msc");
	}

}
