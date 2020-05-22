package org.frameworks.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_TestNG_Parallel_Execution_Test {
	WebDriver driver;

	@Test
	public void openTap1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\FrameWork\\driver\\chromedriver02.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String title1 = driver.getTitle();
		System.out.println("Tab1 is "+title1);
	}

	@Test
	public void openTap2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\FrameWork\\driver\\chromedriver02.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		String title2 = driver.getTitle();
		System.out.println("Tab2 is "+title2);
	}

	@Test
	public void openTap3() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\FrameWork\\driver\\chromedriver02.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/?p=us");
		String title3 = driver.getTitle();
		System.out.println("Tab3 is "+title3);
	}
}