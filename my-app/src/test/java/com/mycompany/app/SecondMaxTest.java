package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static com.mycompany.app.SecondMax.getSecondMax;

public class SecondMaxTest {
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyArray() {
		int[] emptyArr = {};
		getSecondMax(emptyArr);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOneElementArray() {
		int[] oneElementArr = { 1 };
		getSecondMax(oneElementArr);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEqualElementsArray() {
		int[] equalElementsArr = { 1, 1, 1 };
		getSecondMax(equalElementsArr);
	}

	@Test
	public void testSmallArray() {
		int[] smallArr = { 1, 2 };
		assertEquals(getSecondMax(smallArr), 1);
	}

	@Test
	public void testTwoSecondMaxElementsArray() {
		int[] testArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10 };
		assertEquals(getSecondMax(testArr), 9);
	}

	@Test
	public void testTwoMaxElementArray() {
		int[] testArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10 };
		assertEquals(getSecondMax(testArr), 9);
	}

	@Test
	public void testMinIntegerContainedArray() {
		int[] testArr = { Integer.MIN_VALUE, Integer.MIN_VALUE + 1 };
		assertEquals(getSecondMax(testArr), Integer.MIN_VALUE);
	}

	@Test
	public void testMaxIntegerContainedArray() {
		int[] testArr = { Integer.MAX_VALUE - 1, Integer.MAX_VALUE };
		assertEquals(getSecondMax(testArr), Integer.MAX_VALUE - 1);
	}
}