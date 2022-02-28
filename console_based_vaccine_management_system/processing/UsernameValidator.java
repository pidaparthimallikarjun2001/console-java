package com.epam.console_based_vaccine_management_system.processing;

import java.util.Map;

public class UsernameValidator {	//Just to make sure that there are no duplicate usernames
	public boolean validateUsername(Map<String, String> usernameAndPasswordMap, String username, String password) {
		if(usernameAndPasswordMap.containsKey(username)) {	//If the username already exists, then the current username is invalid
			return false;
		}
		else {
			usernameAndPasswordMap.put(username, password);	//storing the username and password values
			return true;
		}
	}
}
