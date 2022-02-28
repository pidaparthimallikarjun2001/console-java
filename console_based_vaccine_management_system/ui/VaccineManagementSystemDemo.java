package com.epam.console_based_vaccine_management_system.ui;

import java.util.*;

import com.epam.console_based_vaccine_management_system.processing.Appointment;
import com.epam.console_based_vaccine_management_system.processing.ModifyAppointmentPage;
import com.epam.console_based_vaccine_management_system.processing.NewAppointmentPage;
import com.epam.console_based_vaccine_management_system.processing.User;

public class VaccineManagementSystemDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {


			Scanner sc = new Scanner(System.in);

			List<User> listOfAllUsers = new ArrayList<>();
			Map<String, String> usernameAndPasswordMap = new HashMap<>(); 

			/* 

		1. Welcome screen(done)

		2. Authentication(done)
			a. New user? Register. (Map<username, password>)
			b. Already existing user? Log in.

		3. Schedule an appointment(done)

		4. Modify the scheduled appointment(done)

		5. First dose and second dose and gap between them(done)

		6. Display all vaccination information (done)


			 */

			//1. Welcome screen(done)
			WelcomeScreen welcomeScreenObject = null;
			welcomeScreenObject = new WelcomeScreen();
			welcomeScreenObject.displayWelcomeMessage();

			//2. Authentication(done)
			//Map to store the username and password 

			User applicant = null;
			List<Appointment> listOfAllAppointments = new ArrayList<>();

			while(true) {
				System.out.println("Do you want to make another login or registration?");
				String anotherLogin = sc.nextLine();
				if(anotherLogin.equalsIgnoreCase("no")) {
					break;
				}
				else {
					System.out.println("Do you already have an account with us? Please answer(yes/no).");
					String userResponseIfHeHasAnAccount = sc.nextLine();

					LoginPage loginPageObject = null;
					RegistrationPage registrationPageObject = null;

					if(userResponseIfHeHasAnAccount.equalsIgnoreCase("yes")) {
						//Display the login page
						loginPageObject = new LoginPage();
						loginPageObject.displayLoginPage(usernameAndPasswordMap);
					}

					else if(userResponseIfHeHasAnAccount.equalsIgnoreCase("no")){
						//Display the registration page
						registrationPageObject = new RegistrationPage();
						applicant = registrationPageObject.displayRegistrationPage(registrationPageObject, usernameAndPasswordMap, listOfAllUsers);
						loginPageObject = new LoginPage();
						loginPageObject.displayLoginPage(usernameAndPasswordMap);
					}
					else {
						System.out.println("Please choose a valid operation");
					}
					if(!listOfAllUsers.contains(applicant)) {
						listOfAllUsers.add(applicant);
					}
					//3. Making a new appointment
					Appointment appointment = null;
					appointment = new NewAppointmentPage().makeAppointmentPage(applicant, listOfAllAppointments);
					if(appointment != null) {
						System.out.println("Your appointment was successful with the following information: ");
						System.out.println(appointment);
					}

				}
			}


			//4. Modify scheduled appointment
			
			new ModifyAppointmentPage().modifyAppointment(listOfAllAppointments, usernameAndPasswordMap);

			
			//6. Displaying all vaccination information and appointments

			System.out.println("*******\nList of all appointments: ");
			for(Appointment everyAppointment: listOfAllAppointments) {
				System.out.println(everyAppointment);
			}
			
			System.out.println("\n\nThanks you for using our services!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
