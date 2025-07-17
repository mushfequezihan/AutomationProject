package collectionreferences;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime_03 {

	public static void main(String[] args) {

		/*
		 * sequence of date time:
		 * LocalDate
		 * LocalTime
		 * LocalDateTime
		 * ZonedDateTime
		 */
		
		//time stamp conversion 
		String timeStamp1 = "16-Jan-2020 23:45:32";
		
		LocalDateTime dt1 = LocalDateTime.parse(timeStamp1, DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss"));
		System.out.println("timestamp1: " + dt1);
		
		LocalDate d1 = dt1.toLocalDate();
		LocalTime t1 = dt1.toLocalTime();
		System.out.println("timestamp1 local date: " + d1 + " and local time: " + t1);
		System.out.println("");
		
		
		//local time conversion
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println("local date and time: " + cdt);
		System.out.println("local date: " + cdt.toLocalDate());
		System.out.println("local time: " + cdt.toLocalTime());
		System.out.println("local day of week: " + cdt.getDayOfWeek());
		System.out.println("local day of week: " + cdt.toLocalDate().getDayOfWeek());
		System.out.println("");
		
		
		/*
		 * print the java time stamp with user defined format
		 * print the time stamp in the format "JUN 21,2024 14:30-45"
		 * print the time stamp in the format "21-February-2024 14::30"
		 */
		System.out.println("Current Time Stamp: " + cdt);
		
		DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("MMM dd,yyyy HH:mm-ss");
		DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH::ss");
		
		System.out.println("TimeStamp in Pattern 1: " + pattern1.format(cdt));
		System.out.println("TimeStamp in Pattern 2: " + pattern2.format(cdt));
		
	}

}
