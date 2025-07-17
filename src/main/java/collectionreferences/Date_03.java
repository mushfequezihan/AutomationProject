package collectionreferences;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date_03 {

	public static void main(String[] args) {

		String date1 = "Apr/08/2023";
		String date2 = "March 21, 2020";
		String date3 = "2021-09-12"; // year-day-month

		// convert the string to java date format
		LocalDate d1 = LocalDate.parse(date1, DateTimeFormatter.ofPattern("MMM/dd/yyyy"));
		System.out.println("date1: " + d1);

		LocalDate d2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
		System.out.println("date2: " + d2);

		LocalDate d3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-dd-MM"));
		System.out.println("date3: " + d3);
		System.out.println("");
		
		

		int m = 11;
		int y = 2012;
		int d = 25;

		// create date from integer parts
		LocalDate d4 = LocalDate.of(y, m, d);
		System.out.println("date4: " + d4);
		System.out.println("");

		// print todays date
		LocalDate today = LocalDate.now();
		System.out.println("todays date: " + today);
		System.out.println("");

		// to check Leap Year
		if (d2.isLeapYear()) {
			System.out.println("date2 is Leap year: " + d2);
		} else {
			System.out.println("date2 is NOT Leap year: " + d2);
		}
		System.out.println("");
		
		
		
		// parts of date 
		System.out.println("This month is: " + today.getMonth());
		System.out.println("This month value is: " + today.getMonthValue());
		System.out.println("day of year is: " + today.getDayOfYear());
		System.out.println("This year is: " + today.getYear());
		System.out.println("today is: " + today.getDayOfWeek());
		System.out.println("");
		
		
		
		//predict the future date, identify the past date	
		System.out.println("50 days from today: " + today.plusDays(50));
		System.out.println("50 days from today is: " + today.plusDays(50).getDayOfWeek());
		System.out.println("50 weeks from today: " + today.plusWeeks(50).getYear());
		System.out.println("50 years from today: " + today.plusYears(50));
		System.out.println("50 days BEFORE date2: " + d2.minusDays(50));
		System.out.println("date2: " + d2);
		System.out.println("");
		
		
		
		/*
		 * date comparison
		 * if the dates are same, output will be 0
		 * if the dates differs more than a year, output will be the year difference
		 * if the dates differs less than a year, but more than a month then output will be month differ
		 * if the dates differs less than a month, then output will be Day difference 
		 */
		System.out.println(today.compareTo(today));
		System.out.println(today.compareTo(d2));
		System.out.println(d2.compareTo(today));
		
		if (today.compareTo(d1) == 0) {
			System.out.println("Dates are same - today and d1: " + today + " and " + d1);
		} else {
			System.out.println("Dates are NOT same - today and d1: " + today + " and " + d1);
		}
		System.out.println("");
		
		
		/*
		 * Period class -> to find AGE
		 * "march 21, 2020" - date2
		 * 5 years 3 months 26 Days
		 */
		int year = Period.between(d2, today).getYears();
		int month = Period.between(d2, today).getMonths();
		int days = Period.between(d2, today).getDays();
		System.out.println(Period.between(d2, today));
		System.out.println("Age of the kid born on date2 is: " + year + " years " + month + " months " + days + " days ");
	
	
	
	}

}
