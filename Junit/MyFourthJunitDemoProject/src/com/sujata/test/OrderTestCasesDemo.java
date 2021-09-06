package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderTestCasesDemo {

	@Test
	@Order(4)
	void testA() {
		System.out.println("Hi from Test Case TestA");
	}

	@Test
	@Order(1)
	void testC() {
		System.out.println("Hi from Test Case TestC");
	}

	@Test
	@Order(3)
	void testB() {
		System.out.println("Hi from Test Case TestB");
	}

	@Test
	@Order(2)
	void testE() {
		System.out.println("Hi from Test Case TestE");
	}

	@Test
	void testD() {
		System.out.println("Hi from Test Case TestD");
	}
	
	@Test
	void testF() {
		System.out.println("Hi from Test Case TestF");
	}
}
