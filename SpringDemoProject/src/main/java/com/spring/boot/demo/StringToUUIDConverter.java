package com.spring.boot.demo;

import java.util.Calendar;
import java.util.UUID;

public class StringToUUIDConverter {
	
	public static void main(String[] args) {
		 // Get the string 
        String UUID_name 
            = "1718977106376"; 
  
        // Displaying the UUID 
        System.out.println("The specified String is: "
                           + UUID_name); 
  
        // Creating the UUID 
        UUID UUID_1 = UUID.nameUUIDFromBytes(UUID_name.getBytes());
  
        // Displaying the UUID 
        System.out.println("The UUID from"
                           + " specified String: "
                           + UUID_1);
        System.out.println((Calendar.getInstance().get(Calendar.MONTH)+1)+"");
	}

}
