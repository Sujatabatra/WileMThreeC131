package com.sujata.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.sujata.demo.MyCalculator;

public class TimeBoundTestCase {

	@Test
	void testMultiply1() {
		MyCalculator myCalculator=new MyCalculator();
		assertEquals(20, myCalculator.multiply(10, 2));
	}
	
	@Test
	@Timeout(5)
	void testMultiply2() {
		MyCalculator myCalculator=new MyCalculator();
		assertEquals(-20, myCalculator.multiply(10, -2));
	}
}
