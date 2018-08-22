package com.mdw.junit.m1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest2 {
	
	private MyClass objMyClass;

	@Before
	public void setup(){
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

	@Test
	public void testMultiply() {
		int c=2*3;
		//assertEquals(c, objMyClass.add(2, 3));
		assertTrue(c==objMyClass.multiply(2, 3));
		//fail("Not yet implemented");
	}

}
