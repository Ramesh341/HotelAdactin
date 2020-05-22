package org.frameworks.com;

import org.testng.annotations.Test;

public class Ex_TestNG_Ignore_a_Case {

	@Test(priority = 1)
	public void starttheCar() {
		System.out.println("Starts the Car");
	}

	@Test(priority = 2)
	public void puttheFirstGrear() {
		System.out.println("First Gear");
	}

	@Test(priority = 5)
	public void puttheFourthGrear() {
		System.out.println("Fourth Gear");
	}

	@Test(priority = 3)
	public void puttheSecondGrear() {
		System.out.println("Second Gear");
	}

	@Test(priority = 4)
	public void puttheThirdGrear() {
		System.out.println("Third Gear");
	}
	@Test(priority = 6, enabled=false)
	public void playMusic() {
		System.out.println("Play Music");
	}

}
