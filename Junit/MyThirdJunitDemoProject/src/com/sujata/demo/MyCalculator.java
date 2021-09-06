package com.sujata.demo;

public class MyCalculator {

	/*
	 * to add two integer nos
	 */
	public int add(int number1,int number2) {
		return number1+number2;
	}
	/*
	 * divide two positive integers
	 * if denominator is 0 throw ArithmeticException
	 * if denominator or numerator is negative throw NegativeNumberException 
	 */
	public int divide(int number1,int number2) {
		if(number1<0 || number2<0)
			throw new NegativeNumberException("Negative No not allowed");
		
		return number1/number2;
	}
}
