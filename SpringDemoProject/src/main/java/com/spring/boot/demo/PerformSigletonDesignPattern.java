package com.spring.boot.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PerformSigletonDesignPattern {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		DemoSigletonDesignPattern designPattern = DemoSigletonDesignPattern.getInstance();
		System.out.println("Obje 1-->"+designPattern.hashCode());
		DemoSigletonDesignPattern designPattern1 = DemoSigletonDesignPattern.getInstance();
		System.out.println("Obje 2-->"+designPattern1.hashCode());
		
		Constructor<DemoSigletonDesignPattern> p = DemoSigletonDesignPattern.class.getDeclaredConstructor();
		p.setAccessible(true);
		DemoSigletonDesignPattern designPattern3 = p.newInstance();
		System.out.println("Object->"+designPattern3.hashCode());
		
//		Constructor
	}
}
