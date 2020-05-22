package org.frameworks.com;

import org.testng.annotations.Test;

public class Ex_TestNG_How_to_group_Test {

	
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple OS Testing on Iphone");
	}
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple OS Testing on Iphone 11");
	}
	@Test(groups= {"Apple"})
	public void apple3() {
		System.out.println("Apple OS Testing on Iphone 11 pro");
	}
	@Test(groups= {"Apple"})
	public void apple4() {
		System.out.println("Apple OS Testing on Iphone XR");
	}
	@Test(groups= {"Apple"})
	public void apple5() {
		System.out.println("Apple OS Testing on Iphone X");
	}
	@Test(groups= {"Apple"})
	public void apple6() {
		System.out.println("Apple OS Testing on Ipod");
	}	

	
	@Test(groups="Vivo")
	public void vivo1() {
		System.out.println("Android OS Testing on Vivo S1 pro");
	}
	@Test(groups="Vivo")
	public void vivo2() {
		System.out.println("Android OS Testing on Vivo V17");
	}
	
	
	@Test(groups={"Moto"})
	public void moto1() {
		System.out.println("Android OS Testing on Moto G3");
	}
	@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("Android OS Testing on Moto G4");
	}

	@Test(groups= {"Samsung"})
	public void samsung1() {
		System.out.println("Android OS Testing on Samsung M30");
	}
	@Test(groups= {"Samsung"})
	public void samsung2() {
		System.out.println("Android OS Testing on Samsung M30s");
	}
	@Test(groups= {"Samsung"})
	public void samsung3() {
		System.out.println("Android OS Testing on Samsung M31");
	}

	@Test(groups= {"Realme"})
	public void realMe1() {
		System.out.println("Android OS Testing on Realme X");
	}
	@Test(groups= {"Realme"})
	public void realMe2() {
		System.out.println("Android OS Testing on Realme XT");
	}

	
	

}
