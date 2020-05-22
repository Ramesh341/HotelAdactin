package org.frameworks.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ex_TestNG_Set_a_Suite {
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;

	@BeforeSuite
	public void openWindow1() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\FrameWork\\driver\\chromedriver2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void openTap1() {
		driver.get("https://www.google.co.in/");
	}

	@Test
	public void openTap2() {
		driver.get("https://www.bing.com/");
	}

	@Test
	public void openTap3() {
		driver.get("https://in.yahoo.com/?p=us");
	}

	@AfterSuite
	public void closeWindow1() {
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println(totalTime);

	}

}
