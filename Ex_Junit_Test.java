package org.frameworks.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Ex_Junit_Test {

	/**
	 * @BeforeClass – Run once before any of the test methods in the class, public
	 *              static void
	 * @AfterClass – Run once after all the tests in the class have been run, public
	 *             static void
	 * @Before – Run before @Test, public void
	 * @After – Run after @Test, public void
	 * @Test – This is the test method to run, public void
	 **/
	@BeforeClass
	public static void beforeClass() {
		System.out.println("1 -- @BeforeClass");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("5 -- @AfterClass");
	}

	@Before
	public void before() {
		System.out.println("2 -- @Before");
	}

	@After
	public void after() {
		System.out.println("4 -- @After");
	}

	@Test
	public void test1() {
		System.out.println("3 -- @Test");
	}

}
