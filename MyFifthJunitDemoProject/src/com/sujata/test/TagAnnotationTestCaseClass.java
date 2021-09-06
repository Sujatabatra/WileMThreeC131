package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TagAnnotationTestCaseClass {

	@Test
	@Tag("verx")
	void testCase1() {
		System.out.println("Hi I am test Case 1");
	}
	
	@Test
	@Tag("verx")
	void testCase2() {
		System.out.println("Hi I am test Case 2");
	}
	
	@Test
	@Tag("very")
	void testCase3() {
		System.out.println("Hi I am test Case 3");
	}
	
	@Test
	@Tag("verx")
	void testCase4() {
		System.out.println("Hi I am test Case 4");
	}
	
	@Test
	@Tag("very")
	void testCase5() {
		System.out.println("Hi I am test Case 5");
	}
	
	@Test
	@Tag("verz")
	void testCase6() {
		System.out.println("Hi I am test Case 6");
	}
	

}
