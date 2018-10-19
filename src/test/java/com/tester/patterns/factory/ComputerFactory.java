package com.tester.patterns.factory;

public class ComputerFactory {

	/** ESTE ES EL FactoryMethod */
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);

		return null;
	}
}
