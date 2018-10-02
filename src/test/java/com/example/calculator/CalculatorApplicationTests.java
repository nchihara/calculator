package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorApplicationTests {
	private CalculatorApplication calculatorApplication = new CalculatorApplication();

	@Test
	public void testSum() {
		assertEquals((long)11, (long)calculatorApplication.sum(8,3));
	}
	@Test
	public void testMul() {
		assertEquals((long)4049, (long)calculatorApplication.mul(8,256));
	}
}
