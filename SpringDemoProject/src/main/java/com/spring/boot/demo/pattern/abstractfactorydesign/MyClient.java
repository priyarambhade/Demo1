package com.spring.boot.demo.pattern.abstractfactorydesign;

public class MyClient {
	
	public static void main(String[] args) {
		Employee e1 = EmployeeFactory.createEmployee(new BackendDeveloperfactory());
		e1.name();
		Employee e2 = EmployeeFactory.createEmployee(new FrontendDeveloperFactory());
		e2.name();
	}

}
