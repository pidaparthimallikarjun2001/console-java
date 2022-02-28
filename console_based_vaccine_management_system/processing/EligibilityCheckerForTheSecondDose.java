package com.epam.console_based_vaccine_management_system.processing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.temporal.ChronoUnit;;
public class EligibilityCheckerForTheSecondDose {
	public boolean isEligibleForSecondDose(String date1, String date2) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
			LocalDate d1 = LocalDate.parse(date1, formatter);
			LocalDate d2 = LocalDate.parse(date2, formatter);
			long daysBetween = ChronoUnit.DAYS.between(d1, d2);
			if(daysBetween < 54) {
				return false;
			}
		}
		catch(Exception e) {
			System.out.println("Invalid date format");
		}
		return true;
	}
}
