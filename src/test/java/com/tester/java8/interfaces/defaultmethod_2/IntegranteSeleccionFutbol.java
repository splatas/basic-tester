package com.tester.java8.interfaces.defaultmethod_2;

/**
 * Interfaces en Java 8: se parecen mas a clases Abstracts, ya que permiten
 * definir un metodos con implementacion, usando 'default'. 
 * 
 * https://jarroba.com/interface-en-java8-metodo-default-con-ejemplos/
 * 
 * @author sergio.platas
 *
 */
public interface IntegranteSeleccionFutbol {

	void concentrarse();
	void viajar();

	default void videoPublicitario(String name) {
		System.out.println("Este es el video publicitario de " + name + " (desde IntegranteSeleccionFutbol).");
	}
	
	default void jugarPartido(String where) {
		System.out.println("Estoy jugando el partido en " + where + " (desde IntegranteSeleccionFutbol).");
	}
}
