package com.epam.console_based_vaccine_management_system.processing;

public class User {
	String name;
	int age;
	String username;
	String password;
	long aadharNumber;
	String location;
	String role;
	public User(String name, int age, String username, String password, long aadharNumber, String location, String role) {
		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
		this.aadharNumber = aadharNumber;
		this.location = location;
		this.role = role;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void  setPassword(String password) {
		this.password = password;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public long getAadharNumber() {
		return this.aadharNumber;
	}
	public String getLocation() {
		return this.location;
	}
	public String getRole() {
		return this.role;
	}
	
	public String toString() {
		return "Name " + this.getName() + " age " + this.getAge() + " username " + this.getUsername() +  " Aadhar number " + this.getAadharNumber() +  " location " + this.getLocation() + " role " + this.getRole();
	}
}
