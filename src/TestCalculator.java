package com.src.classes;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAddition() {
		Assert.assertEquals(30, Calculator.addition(20, 10));
	}

	@Test
	public void testSubtract() {
		Assert.assertEquals(10, Calculator.subtract(20, 10));
	}

}
