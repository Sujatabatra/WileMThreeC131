package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.sujata.demo.MyCalculator;
import com.sujata.demo.NegativeNumberException;

@DisplayName("Test case class to check MyCalculator functionality")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TestMyCalculator {

	@Nested
	@DisplayName("Test Cases for add method of MyCalculatorClass")
	class AddTestCase {
		@Test
		@DisplayName("test case for two positive nos")
		void testAdd1() {
			MyCalculator myCalculator = new MyCalculator();
			assertEquals(30, myCalculator.add(10, 20));
		}

		@Test
		@DisplayName("test case for two negative nos")
		void testAdd2() {
			MyCalculator myCalculator = new MyCalculator();
			assertEquals(-12, myCalculator.add(-10, -2));

		}

		@Test
		void test_case_for_positive_negative_nos() {
			MyCalculator myCalculator = new MyCalculator();
			assertEquals(-8, myCalculator.add(-10, 2));
		}

		@Test
		void test_case_for_negative_and_positive_nos() {
			MyCalculator myCalculator = new MyCalculator();
			assertEquals(8, myCalculator.add(10, -2));

		}
	}

	@Test
	void test_Divide1() {
		MyCalculator myCalculator = new MyCalculator();
		assertEquals(5, myCalculator.divide(10, 2));
	}

	@Test
	void test_Divide2() {
		MyCalculator myCalculator = new MyCalculator();
		assertThrows(NegativeNumberException.class, () -> myCalculator.divide(-10, 2));
	}

	@Test
	void testDivide3() {
		MyCalculator myCalculator = new MyCalculator();
		assertThrows(NegativeNumberException.class, () -> myCalculator.divide(10, -2));
	}

	@Test
	void testDivide4() {
		MyCalculator myCalculator = new MyCalculator();
		assertThrows(ArithmeticException.class, () -> myCalculator.divide(10, 0));
	}

	@Test
	void testDivide5() {
		MyCalculator myCalculator = new MyCalculator();
		assertEquals(0, myCalculator.divide(0, 2));
	}

	@Test
	void testDivide6() {
		MyCalculator myCalculator = new MyCalculator();
		assertThrows(NegativeNumberException.class, () -> myCalculator.divide(-10, 0));
	}

}
