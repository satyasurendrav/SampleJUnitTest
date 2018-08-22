package com.mdw.junit.m1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Result res=JUnitCore.runClasses(TSuite.class);
		
		for(Failure fail:res.getFailures()){
			System.out.println(fail.toString());
		}
		
		 System.out.println("Test Result is "+res.wasSuccessful());
		
	}

}
