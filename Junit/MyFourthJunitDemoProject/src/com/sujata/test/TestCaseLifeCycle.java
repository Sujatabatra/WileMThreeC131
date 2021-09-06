package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(Lifecycle.PER_CLASS)
@TestInstance(Lifecycle.PER_METHOD)
class TestCaseLifeCycle {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hi I am setup before class method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Hi I am setup after class method");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Hi I am setup method"+hashCode());
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Hi I am tearDown method"+hashCode());
		System.out.println("=====================================");
	}

	@Test
	void test1() {
		System.out.println("Test Case 1"+hashCode());
	}
	
	@Test
	void test2() {
		System.out.println("Test Case 2"+hashCode());
	}

}
