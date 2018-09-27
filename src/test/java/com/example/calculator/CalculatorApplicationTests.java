package com.example.calculator;

import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class CalculatorApplicationTests {
	private CalculatorApplication calculatorApplication = new CalculatorApplication();

	@Test
	public void testSum() {
		assertEquals((long)11, (long)calculatorApplication.sum(8,3));
	}

}
