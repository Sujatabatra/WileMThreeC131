package com.sujata.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTestCaseDemo {

	@Test
	@EnabledOnOs({OS.LINUX})
	void testCase1() {
		System.out.println("Hi I am Test Case 1");
	}
	@Test
	@EnabledOnOs({OS.WINDOWS,OS.MAC})
	@EnabledOnJre({JRE.JAVA_11})
	void testCase2() {
		System.out.println("Hi I am Test Case 2");
	}
	
	@Test
	@EnabledOnOs({OS.MAC})
	void testCase3() {
		System.out.println("Hi I am Test Case 3");
	}
	@Test
	@DisabledOnOs({OS.LINUX})
	void testCase4() {
		System.out.println("Hi I am Test Case 4");
	}
	
	@Test
	@EnabledIfSystemProperty(named = "java.vm.name",matches = ".*OpenJDK.*")
	void testForOpenJDK() {
		System.out.println("Run on Open JDK");
	}
	
	
	@Test
	@EnabledIfEnvironmentVariable(named="NUMBER_OF_PROCESSORS",matches = "8")
	void testCaseForProcesses() {
		System.out.println("Run if system has 8 processes");
	}
}
