package org.frameworks.com;

import org.testng.annotations.Test;

public class Ex_TestNG_test {


	@Test
	public static void beforeClass() {
		System.out.println("1 -- @BeforeClass");
	}

	@Test
	public static void afterClass() {
		System.out.println("5 -- @AfterClass");
	}

	@Test
	public void before() {
		System.out.println("2 -- @Before");
	}

	@Test
	public void after() {
		System.out.println("4 -- @After");
	}

	@Test
	public static void test1() {
		System.out.println("3 -- @Test");
	}
	
}
