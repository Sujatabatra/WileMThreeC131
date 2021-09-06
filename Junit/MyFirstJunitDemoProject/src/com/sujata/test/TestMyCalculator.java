package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sujata.demo.MyCalculator;
import com.sujata.demo.NegativeNumberException;

class TestMyCalculator {

	@Test
	void testAdd1() {
		MyCalculator myCalculator=new MyCalculator();
		int expected=30;
		int actual=myCalculator.add(10, 20);
		assertEquals(expected, actual);
		
	}
	@Test
	void testAdd2() {
		MyCalculator myCalculator=new MyCalculator();
		int expected=-12;
		int actual=myCalculator.add(-10, -2);
		assertEquals(expected, actual);
		
	}
	@Test
	void testAdd3() {
		MyCalculator myCalculator=new MyCalculator();
		int expected=-8;
		int actual=myCalculator.add(-10, 2);
		assertEquals(expected, actual);
		
	}
	@Test
	void testAdd4() {
		MyCalculator myCalculator=new MyCalculator();
		int expected=8;
		int actual=myCalculator.add(10, -2);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testDivide1() {
		MyCalculator myCalculator=new MyCalculator();
		assertEquals(5, myCalculator.divide(10, 2));
	}
	
	@Test
	void testDivide2() {
		MyCalculator myCalculator=new MyCalculator();
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(-10, 2));
	}
	
	@Test
	void testDivide3() {
		MyCalculator myCalculator=new MyCalculator();
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(10, -2));
	}
	
	@Test
	void testDivide4() {
		MyCalculator myCalculator=new MyCalculator();
		assertThrows(ArithmeticException.class, ()->myCalculator.divide(10, 0));
	}
	
	@Test
	void testDivide5() {
		MyCalculator myCalculator=new MyCalculator();
		assertEquals(0, myCalculator.divide(0, 2));
	}
	
	@Test
	void testDivide6() {
		MyCalculator myCalculator=new MyCalculator();
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(-10, 0));
	}
	

}
