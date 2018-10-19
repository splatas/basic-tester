package com.tester.java8.interfaces.defaultmethod;

public class MyClass implements Interface1, Interface2 {


	@Override
	public void method1(String str) {
	}

	@Override
	public void method2(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		Interface1.super.log("abc");
		Interface2.super.log("abc");
	}

}