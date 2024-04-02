package com.spring.boot.demo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class TimeStampToDateConverter {

	public static void main(String[] args)
	{
		//taking current time from system
		long time = Long.valueOf("1703052708");//1703139108
//		long time = Long.valueOf("1703139108");
		Timestamp tms = new Timestamp(time);
		//System.err.println("TimeStamp-->"+time);

		// Passing the value in the Date class constructor
		Date date = new Date(tms.getTime());

		// Printing the date value
		//System.out.println("Date-->"+date);
	//	System.out.println("Time-->"+date.getTime());
		
		//System.out.println("Date-->"+new Date("2023-12-08T17:01:13.39"));
		convertUnixEpochToDate();
		getUTCdate(new Date());
	}
	
	public static void convertUnixEpochToDate() {
//		long epoch = 1703057895;
		long epoch = 1703144295;
		String date = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date (epoch*1000));
		System.out.println("Stripe Date-->"+date+" new Date (epoch*1000)-->"+new Date (epoch*1000));
	}
	
	
	public static String getUTCdate(Date d) {

		ZoneId zone = ZoneId.of("UTC");
		ZonedDateTime javaZone = d.toInstant().atZone(zone);
		String date = javaZone.toLocalDateTime().toString();
		System.out.println(date);
		return date;
	}
	
	public static void c1() {
		Date in = new Date();
		LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(),ZoneId.of("UTC"));
		Date out = Date.from(ldt.atZone(ZoneId.of("UTC")).toInstant());
		System.out.println(out);
	}
}
