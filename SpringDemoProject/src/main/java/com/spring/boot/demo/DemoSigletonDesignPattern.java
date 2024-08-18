package com.spring.boot.demo;
//Lazy Singleton implementation
public class DemoSigletonDesignPattern {

	static DemoSigletonDesignPattern designPattern;

	private DemoSigletonDesignPattern() {
		if (designPattern != null) {
//			throw new RuntimeException("You are trying create a new instance of DemoSigletonDesignPattern");
		}

	}

	public static DemoSigletonDesignPattern getInstance() {

//		Synchronized block=> at a time only one threat can execute this block and other threads needs to wait
		synchronized (DemoSigletonDesignPattern.class) {
			if (designPattern == null) {
				designPattern = new DemoSigletonDesignPattern();
			}
		}
		return designPattern;
	}
}
