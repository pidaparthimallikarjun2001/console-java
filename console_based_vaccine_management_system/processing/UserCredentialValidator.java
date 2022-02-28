package com.epam.console_based_vaccine_management_system.processing;

import java.util.Map;

public class UserCredentialValidator {	//Just to check if the corresponding values of username and password are present and match with the actual values
	public boolean validateUserCredentials(Map<String, String> usernameAndPasswordMap, String username, String password) {
		return (usernameAndPasswordMap.containsKey(username) && usernameAndPasswordMap.get(username).equals(password));
	}
}
