package com.tester.java8.interfaces.defaultmethod;

/**
 * Interfaces en Java 8: se parecen mas a clases Abstracts, ya que permiten
 * definir un metodos con implementacion, usando 'default'. Notice that
 * log(String str) is the default method in the Interface1. Now when a class
 * will implement Interface1, it is not mandatory to provide implementation for
 * default methods of interface.
 * 
 * 
 * https://www.journaldev.com/2752/java-8-interface-changes-static-method-default-method
 * 
 * @author sergio.platas
 *
 */
public interface Interface1 {

	void method1(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}
}
