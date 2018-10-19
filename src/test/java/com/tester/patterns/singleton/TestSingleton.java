package com.tester.patterns.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		LazyInitializedSingleton mySingleton = LazyInitializedSingleton.getInstance();
		System.out.println("mySingleton: " + mySingleton.toString());
	
	}

}
