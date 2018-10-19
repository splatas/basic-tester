package com.tester.java8.interfaces.defaultmethod;

public class MyDataImpl implements MyData {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");
	}
	
}
