package ua.lviv.lgs;

import java.time.*;
import java.util.Date;

public class AppTask2 {

	public static void main(String[] args) {
	
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(dataToLocalDate(date));
		System.out.println(dataToLocalDateTime(date));
		System.out.println(dataToLocalTime(date));
	}
	
	public static LocalDateTime dataToLocalDateTime(Date date) {
		
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		
		return zdt.toLocalDateTime();
	}
	
	public static LocalDate dataToLocalDate(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		
		return zdt.toLocalDate();
	}
	
	public static LocalTime dataToLocalTime (Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		
		return zdt.toLocalTime();
	}
	
}
