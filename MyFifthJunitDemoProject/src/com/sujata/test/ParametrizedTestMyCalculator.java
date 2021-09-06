package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.sujata.demo.MyCalculator;

class ParametrizedTestMyCalculator {

	MyCalculator myCalculator;
	
	@BeforeEach
	void setUp() throws Exception {
		myCalculator=new MyCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		myCalculator=null;
	}

	@ParameterizedTest
	@MethodSource("threeInts")
	void testDifference(int number1,int number2,int expected) {
		assertEquals(expected, myCalculator.difference(number1, number2));
	}
	
	static Stream<Arguments> threeInts(){
		return Stream.of(
				Arguments.arguments(20,10,10),
				Arguments.arguments(20,-10,30),
				Arguments.arguments(-20,10,-30));
				
	}
	
//	@Test
//	void testDifference1() {
//		assertEquals(10, myCalculator.difference(20, 10));
//	}
//	@Test
//	void testDifference2() {
//		assertEquals(30, myCalculator.difference(20, -10));
//	}
//	@Test
//	void testDifference3() {
//		assertEquals(-30, myCalculator.difference(-20, 10));
//	}

}
