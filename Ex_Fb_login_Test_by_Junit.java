package org.frameworks.com;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_Fb_login_Test_by_Junit {
	static WebDriver driver;

	@BeforeClass
	public static void chrLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\FrameWork\\driver\\chromedriver2.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void userName() {
		WebElement userName = driver.findElement(By.id("email"));
		String name = "rameshbncdrc@gmail.com";
		userName.sendKeys("rameshbncdrc@gmail.com");
		String actual = userName.getAttribute("value");
		Assert.assertEquals("rameshbncdrc@gmail.com", actual);
	}

	@Test
	public void passCode() {
		WebElement passCode = driver.findElement(By.id("pass"));
		String pass = "Noway@123";
		passCode.sendKeys("Noway@123");
		String actualp = passCode.getAttribute("value");
		Assert.assertEquals(pass, actualp);
	}

	@Test
	public void comparewithTitle() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Face"));
	}
	@Test
	public void comparewithLogo() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Face"));
	}


	
	@AfterClass
	public static void brCls() {
		driver.quit();
	}

}
