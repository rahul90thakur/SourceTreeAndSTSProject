package com.wellsfargo.group5.springbootdata.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class ContactDetailsModel {

	@NotNull(message="Mobile number is mandate")
	@NotBlank(message="Mobile number is mandate")
	@Pattern(regexp = "[1-9][0-9]{9}",message="Mobile number should be 10 digit")
	private String mobileNumber;
	
	@NotNull(message="Email ID is mandate")
	@NotBlank(message="Email is mandate")
	@Email(message="Email ID is not valid")
	private String emailId;
	
	@NotNull(message="Add line 1 is mandate")
	@NotBlank(message="Add line 1 is mandate")
	private String addressLine1;
	
	
	private String addressLine2;
	
	@NotNull(message="city is mandate")
	@NotBlank(message="City is mandate")
	private String city;
	
	@NotNull(message="state is mandate")
	@NotBlank(message="State is mandate")
	private String state;
	
	public ContactDetailsModel() {
		
	}
	public ContactDetailsModel(String mobileNumber, String emailId, String addressLine1, String addressLine2, String city,
			String state) {
		super();
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "ContactDetails [mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + "]";
	}
	
	
}