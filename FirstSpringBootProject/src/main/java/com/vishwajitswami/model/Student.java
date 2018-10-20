package com.vishwajitswami.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Master")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long rollnumber;
	public Long getRoll_number() {
		return rollnumber;
	}
	public void setRoll_number(Long rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return String.format("Student [roll_number=" + rollnumber + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", address=" + address + ", mobile=" + mobile + ", adhaar_number="
				+ adhaar_number + "]");
	}
	public Long getAdhaar_number() {
		return adhaar_number;
	}
	public void setAdhaar_number(Long adhaar_number) {
		this.adhaar_number = adhaar_number;
	}
	private String first_name;
	private String last_name;
	private String email;
	private String address;
	private Long mobile;
	private Long adhaar_number;
	
	

}
