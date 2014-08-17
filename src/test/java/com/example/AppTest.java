package com.example;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	@Test
	public void testApp() {
		System.out.println("testApp");
		assertTrue(true);
	}

	@Test
	@Category(SlowTests.class)
	public void testSlow() {
		System.out.println("testSlow");
		assertTrue(true);
	}

	@Test
	@Category(com.example.SlowerTests.class)
	public void testSlower() {
		System.out.println("testSlower");
		assertTrue(true);
	}

	// @Test
	// @Category(com.example.FastTests.class)
	// public void testSlow() {
	// System.out.println("fast");
	// }

}
