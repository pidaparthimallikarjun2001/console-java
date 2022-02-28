package com.epam.console_based_vaccine_management_system.processing;

import java.util.*;

public class Appointment {
	String preferredDateForFirstDose;
	String preferredDateForSecondDose;
	User applicant;

	
	public Appointment(User applicant, String preferredDateForFirstDose, String preferredDateForSecondDose) {
		this.applicant = applicant;
		this.preferredDateForFirstDose = preferredDateForFirstDose;
		this.preferredDateForSecondDose = preferredDateForSecondDose;
		
	}
	
	public void setName(String name) {
		this.applicant.setName(name);
	}
	public void setAadharNumber(long aadharNumber) {
		this.applicant.setAadharNumber(aadharNumber);
	}
	public void setLocation(String location) {
		this.applicant.setLocation(location);
	}
	
	

	public String getName() {
		return this.applicant.name;
	}
	public String getUsername() {
		return this.applicant.getUsername();
	}
	public long getAadharNumber() {
		return this.applicant.getAadharNumber();
	}
	public String getLocation(String location) {
		return this.applicant.getLocation();
	}
	
	public String toString() {
		return "\nName: " + this.applicant.getName() + "\nUsername " + this.applicant.getUsername() + "\nAadhar Number: " + this.applicant.getAadharNumber() + "\nPreferred date for the first dose: " + this.getPreferredDateForFirstDose() + "\nPreferred date for the second dose: " + this.getPreferredDateForSecondDose() + "\nLocation: " + this.applicant.getLocation();
	}

	public String getPreferredDateForFirstDose() {
		return this.preferredDateForFirstDose;
	}

	public void setPreferredDateForFirstDose(String preferredDateForFirstDose) {
		this.preferredDateForFirstDose = preferredDateForFirstDose;
	}

	public String getPreferredDateForSecondDose() {
		return this.preferredDateForSecondDose;
	}

	public void setPreferredDateForSecondDose(String preferredDateForSecondDose) {
		this.preferredDateForSecondDose = preferredDateForSecondDose;
	}	
}
