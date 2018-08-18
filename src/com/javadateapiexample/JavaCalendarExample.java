package com.javadateapiexample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaCalendarExample {
	
	public static void main(String[]args) {
		formatTheDate();
	}

	private static void formatTheDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2018,1,18);
		System.out.println("Formatted date "+ sdf.format(calendar.getTime()));
	}

}
