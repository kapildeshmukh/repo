package com.practice.dpattren.singleton;

import java.io.Serializable;

public class SingletonDemo implements Serializable, Cloneable {

	private SingletonDemo(){
	}
	
	
	private static SingletonDemo instance = null;
	
	
	public SingletonDemo getInstance() {
		
		if(instance == null){
			synchronized (instance) {
				if(instance == null){
					instance = new SingletonDemo();
				}
			}
		}
			return  instance;
	}


	
	
	protected Object readResolve() {
		return instance;
	}
	
	
}
