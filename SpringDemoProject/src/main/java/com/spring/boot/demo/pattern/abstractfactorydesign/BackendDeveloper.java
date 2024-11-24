package com.spring.boot.demo.pattern.abstractfactorydesign;

public class BackendDeveloper implements Employee {

	@Override
	public double salary() {
		return 60000;
	}

	@Override
	public String name() {
		System.out.println("I am backend developer");
		return "Priya Rambhade";
	}

}
