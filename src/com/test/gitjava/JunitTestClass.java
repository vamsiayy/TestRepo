package com.test.gitjava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestClass {

	
	@Test
	void test() {
		
		com.test.gitjava.TestClass test1 = new com.test.gitjava.TestClass();
		assert(test1.methodToTest1());
	}

}
