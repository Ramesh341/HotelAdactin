package org.frameworks.com;

import org.testng.annotations.Test;

public class Ex_TestNG_Run_a_Case_NoofTimes {

	
	@Test(priority=1)
	public void starttheCar() {
		System.out.println("Starts the Car");
	}
	@Test(priority=2, invocationCount=3)
	public void puttheFirstGrear() {
		System.out.println("First Gear");
	}
	@Test(priority=5)
	public void puttheFourthGrear() {
		System.out.println("Fourth Gear");
	}
	@Test(priority=3)
	public void puttheSecondGrear() {
		System.out.println("Second Gear");
	}
	@Test(priority=4)
	public void puttheThirdGrear() {
		System.out.println("Third Gear");
	}
}
