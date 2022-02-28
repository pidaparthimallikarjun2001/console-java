package com.epam.console_based_vaccine_management_system.ui;
import java.util.*;

import com.epam.console_based_vaccine_management_system.processing.UserCredentialValidator;

public class LoginPage {
	public void displayLoginPage(Map<String, String> usernameAndPasswordMap) {

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("*******LOG IN PAGE*******");

			System.out.println("Please enter your username: \n");
			String username = sc.nextLine();
			System.out.println("Please enter your password: \n");
			String password = sc.nextLine();		

			if(new UserCredentialValidator().validateUserCredentials(usernameAndPasswordMap, username, password)) {
				System.out.println("You logged in to your account successfully.");
			}
			else {
				System.out.println("Invalid/wrong username or password please try again with correct credentials");
				new LoginPage().displayLoginPage(usernameAndPasswordMap);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
