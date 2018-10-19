package com.tester.patterns.singleton;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;
	private String atributo;
    
    private LazyInitializedSingleton(){
    	this.atributo = "valor del atributo";
    }
    
    public String getAtributo() {
		return atributo;
	}

	@Override
	public String toString() {
		return "LazyInitializedSingleton [atributo=" + atributo + "]";
	}

	public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}