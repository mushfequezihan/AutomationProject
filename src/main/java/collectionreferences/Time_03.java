package collectionreferences;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Time_03 {

	public static void main(String[] args) {
		
		String time1 = "13-24-21";
		String time2 = "02:30 PM";
		
		//convert string to java time format
		LocalTime t1 = LocalTime.parse(time1, DateTimeFormatter.ofPattern("HH-mm-ss"));
		System.out.println("time1: " + t1);
		
		LocalTime t2 = LocalTime.parse(time2, DateTimeFormatter.ofPattern("hh:mm a"));
		System.out.println("time2: " + t2);
		System.out.println("");
		
		
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time: " + currentTime);
		System.out.println("");
		
		
		//predict time
		System.out.println("Predict from time1:");
		System.out.println(t1.plusMinutes(300));
		System.out.println(t1.minusHours(50));
		System.out.println("");
		
		
		//compare
		if (t1.isBefore(t2)) {
			System.out.println("time1 is Before time2: " );
		} else {
			System.out.println("time1 is After time2: " );
		}
		System.out.println("");
		
		
		//create time from parts
		int hr = 07;
		int min = 15;
		int sec = 45;
		
		LocalTime t3 = LocalTime.of(hr, min, sec);
		System.out.println("time3: " + t3);
		System.out.println("");
		
		
		//extract parts of time 
		System.out.println("get HR from current time: " + currentTime.getHour());
		System.out.println("");
		
		
		
		// Date + time + TimeZone
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("My current timezone: " + zdt);
		System.out.println("");
		
		//display all the available Zone IDs
		Set<String> zIDs = ZoneId.getAvailableZoneIds();
		
		for (String string : zIDs) {
			System.out.println(string);
		}
		System.out.println("");
		
		
		//display for specific time zone details
		ZonedDateTime zdt_monaco = ZonedDateTime.now(ZoneId.of("Europe/Monaco"));
		System.out.println("Monaco current Time Zone: " + zdt_monaco);
		System.out.println("Monaco current time: " + zdt_monaco.toLocalTime());
		System.out.println("Monaco current hour: " + zdt_monaco.toLocalTime().getHour());
		
		
		
		
	}

}
