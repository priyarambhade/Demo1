package com.spring.boot.demo.pattern.abstractfactorydesign;

public class FrontendDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new FrontEndDeveloper();
	}

}
