package com.spring.boot.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {

	public static Date convertStringToDate(String strDate) {
		Date date = null;
		SimpleDateFormat formatter= null;
		try {
			if(strDate != null && !strDate.isEmpty()) {
				 formatter=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
//				formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//				formatter = new SimpleDateFormat("yyyy-mm-dd'T'HH:mm:ss+SS:SS");
//				formatter = new SimpleDateFormat("yyyyMMddHHmmss");
//				formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				date = formatter.parse(strDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static void main(String[] args) {
		String ewayTransactionDate = "2023-12-20 20:10:08";//2023-12-10 11:49:59
		
		System.out.println(convertStringToDate(TimeStampToDateConverter.getUTCdate(new Date())));
	}
}
