package org.frameworks.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Ex_ExtentReports {
	WebDriver driver;
	ExtentReports exr;
	ExtentHtmlReporter hr;
	ExtentTest textcase;

	@Test
	public void openTap1() throws IOException {
		textcase = exr.createTest("Verify Google Title");
		textcase.log(Status.INFO, "Navigating to google.com");
		driver.get("https://www.google.co.in/");
		String title1 = driver.getTitle();
		textcase.log(Status.INFO, "Actual title is :" + title1);
		if (title1.equals("Google")) {
			textcase.log(Status.PASS, "Actual title and Expected Title are Report");
		} else {
			textcase.log(Status.FAIL, "Actual title and Expected Title are Report");
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("g.png");
			FileUtils.copyFile(SrcFile, DestFile);
			textcase.addScreenCaptureFromPath("g.png");
		}

	}

	@Test
	public void openTap2() throws IOException {
		textcase = exr.createTest("Verify Bing Title");
		textcase.log(Status.INFO, "Navigating to bing.com");
		driver.get("https://www.bing.com/");
		String title2 = driver.getTitle();
		textcase.log(Status.INFO, "Actual title is :" + title2);
		if (title2.equals("ola")) {
			textcase.log(Status.PASS, "Actual title and Expected Title are Report");
		} else {
			textcase.log(Status.FAIL, "Actual title and Expected Title are Report");
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("b.png");
			FileUtils.copyFile(SrcFile, DestFile);
			textcase.addScreenCaptureFromPath("b.png");

		}

	}

	@Test
	public void openTap3() throws IOException {
		textcase = exr.createTest("Verify Yahoo Title");
		textcase.log(Status.INFO, "Navigating to yahoo.com");
		driver.get("https://in.yahoo.com/?p=us");
		String title3 = driver.getTitle();
		textcase.log(Status.INFO, "Actual title is :" + title3);
		if (title3.equals("Yahoo")) {
			textcase.log(Status.PASS, "Actual title and Expected Title are Report");
		} else {
			textcase.log(Status.FAIL, "Actual title and Expected Title are Report");
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("y.png");
			FileUtils.copyFile(SrcFile, DestFile);
			textcase.addScreenCaptureFromPath("y.png");

		}
	}

	@BeforeSuite
	public void lanuchBrowser() {
		exr = new ExtentReports();
		hr = new ExtentHtmlReporter("ExtentReport.html");
		exr.attachReporter(hr);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\FrameWork\\driver\\chromedriver02.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		exr.flush();
	}

}
