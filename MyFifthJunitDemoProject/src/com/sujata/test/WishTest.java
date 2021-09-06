package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;
import org.junit.jupiter.params.provider.ValueSource;

import com.sujata.demo.Wish;

class WishTest {

	private Wish wish;
	
	@BeforeEach
	public void setUp() {
		wish=new Wish();
	}
	
	@AfterEach
	public void tearDown() {
		wish=null;
	}
	
	@ParameterizedTest(name="Test Case {index} - Run test with args={0}")
	@ValueSource(strings = {"Sujata","Vasu","Ganesh"})
	void testGreet(String arg) {
		assertEquals("Hello "+arg, wish.greet(arg));
	}
	
	enum Dishes{
		PANEER,CHICKEN,DAAL,FISH;
	}
	
	@ParameterizedTest
	@EnumSource(value=Dishes.class,mode = Mode.EXCLUDE,names = {"DAAL","FISH"})
	void testDishes(Dishes dish) {
		assertNotNull(dish);
	}
	
//	@Test
//	void testGreet1() {
//		assertEquals("Hello Sujata", wish.greet("Sujata"));
//	}
//
//	@Test
//	void testGreet2() {
//		assertEquals("Hello Vasu", wish.greet("Vasu"));
//	}
//	
//	@Test
//	void testGreet3() {
//		assertEquals("Hello Ganesh", wish.greet("Ganesh"));
//	}
}
