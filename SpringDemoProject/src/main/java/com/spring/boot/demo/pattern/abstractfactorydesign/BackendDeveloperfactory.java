package com.spring.boot.demo.pattern.abstractfactorydesign;

public class BackendDeveloperfactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new BackendDeveloper();
	}

}
