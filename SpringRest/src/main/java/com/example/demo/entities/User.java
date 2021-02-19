package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User  {
	/**
	 * 
	 */
	
	// Variable declaration

	@Id
	@Column(name = "Name")
	private String nameField;
	@Column(name = "email")
	private String emailField;
	@Column(name = "password")
	private String passwordField;
	@Column(name = "mobile")
	private String mobileField;
	@Column(name = "gender")
	private String radioButton;
	@Column(name = "date")
	private String date;
	@Column(name = "month")
	private String month;
	@Column(name = "year")
	private String year;
	@Column(name = "addressarea")
	private String addressArea;

	// Non-Parameterized Constructor
	public User() {
		super();
	}

	// Getters and Setters
	public String getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(String passwordField) {
		this.passwordField = passwordField;
	}

	public String getNameField() {
		return nameField;
	}

	public void setNameField(String nameField) {
		this.nameField = nameField;
	}

	public String getEmailField() {
		return emailField;
	}

	public void setEmailField(String emailField) {
		this.emailField = emailField;
	}

	public String getMobileField() {
		return mobileField;
	}

	public void setMobileField(String mobileField) {
		this.mobileField = mobileField;
	}

	public String getradioButton() {
		return radioButton;
	}

	public void setradioButton(String radioButton) {
		this.radioButton = radioButton;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAddressArea() {
		return addressArea;
	}

	public void setAddressArea(String addressArea) {
		this.addressArea = addressArea;
	}

	// Parameterized Constructor
	/**
	 * @param nameField
	 * @param emailField
	 * @param passwordField
	 * @param mobileField
	 * @param radioButton
	 * @param date
	 * @param month
	 * @param year
	 * @param addressArea
	 */
	public User(String nameField, String emailField, String passwordField, String mobileField, String radioButton,
			String date, String month, String year, String addressArea) {
		super();
		this.nameField = nameField;
		this.emailField = emailField;
		this.passwordField = passwordField;
		this.mobileField = mobileField;
		this.radioButton = radioButton;
		this.date = date;
		this.month = month;
		this.year = year;
		this.addressArea = addressArea;
	}

	// Equals Method
	@Override
	public String toString() {
		return "User [nameField=" + nameField + ", emailField=" + emailField + ", passwordField=" + passwordField
				+ ", mobileField=" + mobileField + ", radioButton=" + radioButton + ", date=" + date + ", month="
				+ month + ", year=" + year + ", addressArea=" + addressArea + "]";
	}

}
