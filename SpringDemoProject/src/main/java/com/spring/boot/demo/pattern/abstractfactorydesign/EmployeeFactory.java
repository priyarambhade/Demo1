package com.spring.boot.demo.pattern.abstractfactorydesign;

public class EmployeeFactory {

	public static Employee createEmployee(EmployeeAbstractFactory abstractFactory) {
		return abstractFactory.createEmployee();
	}

}
