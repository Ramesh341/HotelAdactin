package org.frameworks.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex_TestNG_All_Annotation {

	@Test
	public void test2() {
		System.out.println("I am test2");
		System.out.println("");
	}
	
	@Test
	public void test1() {
		System.out.println("I am test1");
		System.out.println("");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am BeforeSuite");
		System.out.println("");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am AfterSuite");
		System.out.println("");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am BeforeClass");
		System.out.println("");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am AfterClass");
		System.out.println("");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am BeforeMethod");
		System.out.println("");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am AfterMethod");
		System.out.println("");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am beforeTest");
		System.out.println("");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am AfterTest");
		System.out.println("");
	}
}
