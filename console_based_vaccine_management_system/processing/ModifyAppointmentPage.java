package com.epam.console_based_vaccine_management_system.processing;
import java.util.*;

public class ModifyAppointmentPage {
	public void modifyAppointment(List<Appointment> listOfAllAppointments, Map<String, String> usernameAndPasswordMap) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("In order to modify your appointment, please enter your username");
			String userEnteredUsername = sc.nextLine();
			System.out.println("Please enter your password");
			String userEnteredPassword = sc.nextLine();
			if(new UserCredentialValidator().validateUserCredentials(usernameAndPasswordMap, userEnteredUsername, userEnteredPassword)) {
				System.out.println("Credentials matched! Now you can madify your details");
				for(Appointment eachAppointment: listOfAllAppointments) {
					if(eachAppointment.getUsername().equals(userEnteredUsername)) {
						System.out.println("Found your appointment successfully");
						while(true) {
							System.out.println("What do you want to modify? \nNOTE: You can only modify your name, aadhar number, preferred date and your location");
							System.out.println("Please enter the field name that you wish to modify:");
							System.out.println("If you don't want to modify, then press key X");
							String fieldName = sc.nextLine();
							if(fieldName.equals("x")) {
								break;
							}
							System.out.println("Please enter the modified value for " + fieldName);
							String newFieldValue = sc.nextLine(); 

							if(fieldName.equals("name")) {
								eachAppointment.setName(newFieldValue);
							}
							else if(fieldName.equals("aadharNumber")) {
								eachAppointment.setAadharNumber(Long.parseLong(newFieldValue));
							}
							else if(fieldName.equals("location")) {
								eachAppointment.setLocation(newFieldValue);
							}
							else if(fieldName.equals("preferredDateForFirstDose")) {
								eachAppointment.setPreferredDateForFirstDose(newFieldValue);
							}
							else if(fieldName.equals("preferredDateForSecondDose")) {
								eachAppointment.setPreferredDateForSecondDose(newFieldValue);
							}
							else {
								System.out.println("Invalid field");
								break;
							}
						}
						System.out.println("Your new and modified appointment details: " + eachAppointment);
						break;
					}

				}
			}
			else {
				System.out.println("Incorrect credentials");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
