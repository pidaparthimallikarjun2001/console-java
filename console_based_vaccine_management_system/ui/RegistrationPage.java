package com.epam.console_based_vaccine_management_system.ui;
import java.util.*;

import com.epam.console_based_vaccine_management_system.processing.User;
import com.epam.console_based_vaccine_management_system.processing.UsernameValidator;

public class RegistrationPage {

	public User displayRegistrationPage(RegistrationPage registrationPageObject, Map<String, String> usernameAndPasswordMap, List<User> listOfAllUsers) {
		User applicant = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("*******REGISTRATION PAGE*******");

			System.out.println("Please enter the following details to register");

			System.out.println("Please enter your name: \n");
			String name = sc.nextLine();
			System.out.println("Please enter your age: \n");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Please enter your username: \n");
			String username = sc.nextLine();
			System.out.println("Please enter your password: \n");
			String password = sc.nextLine();
			System.out.println("please enter your aadhar number");
			long aadharNumber = sc.nextLong();
			sc.nextLine();
			System.out.println("Please enter your location: from Eluru/Vijayawada/Hyderabad/Delhi ");
			String location = sc.nextLine();
			System.out.println("Please enter your role");
			String role = sc.nextLine();

			applicant = new User(name, age, username, password, aadharNumber, location, role);

			listOfAllUsers.add(applicant);

			if(new UsernameValidator().validateUsername(usernameAndPasswordMap, applicant.getUsername(), applicant.getPassword())) {	//Just to make sure that there are no duplicate usernames
				System.out.println("You registered successfully and here are the details that you have entered: " + applicant);
			}
			else {
				System.out.println("The username already exists. Please choose another username");
				registrationPageObject.displayRegistrationPage(registrationPageObject, usernameAndPasswordMap, listOfAllUsers);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return applicant;
	}
}
