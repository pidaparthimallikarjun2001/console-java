package com.epam.console_based_vaccine_management_system.processing;

import java.util.*;

public class NewAppointmentPage {
	public Appointment makeAppointmentPage(User applicant, List<Appointment> listOfAllAppointments) {
		Appointment appointment = null;
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("*******APPOINTMENT DETAILS*******");

			System.out.println("Please enter your preferred date for the first dose");
			String preferredDateforFirstDose = sc.nextLine();

			System.out.println("Please enter your preferred date for the second dose");
			String preferredDateforSecondDose = sc.nextLine();

			boolean flag = false;
			if(new EligibilityCheckerForTheSecondDose().isEligibleForSecondDose(preferredDateforFirstDose, preferredDateforSecondDose)) {
				System.out.println("You are eligible for the second dose");
				flag = true;
			}

			if(flag == true) {
				appointment = new Appointment(applicant, preferredDateforFirstDose, preferredDateforSecondDose);
				listOfAllAppointments.add(appointment);
			}
			else {
				System.out.println("Sorry you are not eligible for the second dose at that date. You need a time period of 54 days in between the doses");
			}
		}


		catch(Exception e) {
			System.out.println(e);
		}
		return appointment;
	}
}
