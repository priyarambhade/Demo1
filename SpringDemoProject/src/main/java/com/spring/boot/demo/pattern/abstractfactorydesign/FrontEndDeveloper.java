package com.spring.boot.demo.pattern.abstractfactorydesign;

public class FrontEndDeveloper implements Employee {

	@Override
	public double salary() {
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("I am frontend developer");
		return "Priya";
	}

}
