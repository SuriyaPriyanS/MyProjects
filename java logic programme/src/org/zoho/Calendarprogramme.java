package org.zoho;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendarprogramme {
	public static void main(String[] args) {
		
		Calendar cal =   Calendar.getInstance();
		
		 cal.set(2023, 01, 14);
		 
		 Date d1 = cal.getTime();
		 
		 SimpleDateFormat s1 = new  SimpleDateFormat("dd/mm/yyyy");
		  System.out.println("Date in d/m/yyyy format:"+s1.format(14));
		  s1.applyPattern("14/01/2023");
		  System.out.println("Date in mm d,yyyy format:"+s1.format(14));
		
		
	}

}
