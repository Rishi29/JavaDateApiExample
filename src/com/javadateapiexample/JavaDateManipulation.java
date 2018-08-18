package com.javadateapiexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaDateManipulation {
	
	public static void main(String[]ags) {
		
		ConvertDateToString();
		CovertStringToDate();
		getCurrentDateTime();
		convertCalendarToDate();
	}

	private static void ConvertDateToString() {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 String date = sdf.format(new Date());
		 System.out.println("Java Date to String Conversion "+ date);
		
	}
	
	private static void CovertStringToDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateString = "18-08-2018 10:20:30";
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Parse exception occurred "+ e);
		}
		System.out.println("Converted String to date "+ date);
	}
	
	private static void getCurrentDateTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Current Date "+ dateFormat.format(date));
	}
	
	private static void convertCalendarToDate() {
		//Calendar calendar = Calendar().getInstance();
	  Calendar calendar = Calendar.getInstance();
	  Date date = calendar.getTime();
	  System.out.println(" Date from Calendar "+ date);
	  
	  // Now format the date using simpleDateFormat
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	  System.out.println("Fromatted date using simple date format "+ sdf.format(date));
	} 

}
