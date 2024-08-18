package com.spring.boot.demo;

//Eager singleton design patter
public class EagerSingletonDemo {

	static EagerSingletonDemo demo = new EagerSingletonDemo();

	private EagerSingletonDemo() {

	}

	public static EagerSingletonDemo getInstance() {
		return demo;
	}

}
