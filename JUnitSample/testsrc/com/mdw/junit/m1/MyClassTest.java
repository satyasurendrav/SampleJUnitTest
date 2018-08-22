package com.mdw.junit.m1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {
	
	private static MyClass objMyClass;

	@BeforeClass
	public static void setup(){
		objMyClass=new MyClass();
		System.out.println("Object initialised");
	}

	@Test
	public void testAdd() {
		
		int c=2+3;
		//assertEquals(c, objMyClass.add(2, 3));
		//assertTrue(c==objMyClass.add(2, 3));
		//fail("Not yet implemented");
		
		assertEquals(5, objMyClass.add(2, 3));
	}

	@Test(timeout=1)
	public void testMultiply() {
		int c=2*3;
		//assertEquals(c, objMyClass.add(2, 3));
		assertTrue(c==objMyClass.multiply(2, 3));
		//fail("Not yet implemented");
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDev(){
		int c=2/3;
		assertTrue(c==objMyClass.div(2, 0));
	}

}
