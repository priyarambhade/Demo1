package com.spring.boot.demo;

import java.util.UUID;

public class CheckUUIDVersion {

	public static void main(String arg[]) throws   
	UnsupportedOperationException   
	{   
	//returns a UUID with specified value  
	UUID uuid=UUID.fromString("542f952c-ac15-3b92-8610-acdef920992b");       
    UUID uuid1=UUID.fromString("09055a43-562c-4b15-abed-a79c5c2cf01d");   
	System.out.println("UUID version is: "+uuid.version());     //invoking version method  
	System.out.println("UUID version is: "+uuid1.version());   
	} 
}
