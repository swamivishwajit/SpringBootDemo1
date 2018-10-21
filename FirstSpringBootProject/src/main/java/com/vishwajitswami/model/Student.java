package com.vishwajitswami.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.vishwajitswami.constraints.CreateStudent;
import com.vishwajitswami.constraints.UpdateStudent;

@Entity
@Table(name="Student_Master")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long rollnumber;
	
	@NotNull(message = "RollNumber cannot be null", groups = { UpdateStudent.class })
	public Long getRoll_number() {
		return rollnumber;
	}
	public void setRoll_number(Long rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	@NotBlank(message = " FirstName cannot be blank", groups = {CreateStudent.class,UpdateStudent.class })
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	@NotBlank(message = "LastName cannot be blank", groups = {CreateStudent.class,UpdateStudent.class })
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@NotBlank(message="Email Id cannot be Blank",groups={CreateStudent.class,UpdateStudent.class})
	@Pattern(regexp="^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$",message="Please enter correct email id",groups={CreateStudent.class,UpdateStudent.class})
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@NotBlank(message = "Address cannot be blank", groups = {CreateStudent.class,UpdateStudent.class })
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@NotNull(message = "Mobile No cannot be Null",groups={CreateStudent.class,UpdateStudent.class})
	//@Size(min=10,max=10,message="Please enter 10 digit mobile number",groups={CreateStudent.class,UpdateStudent.class})
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
	
	@NotNull(message = "Aadhaar number cannot be blank", groups = {CreateStudent.class,UpdateStudent.class })
	//@Size(min=12,max=12,message="Please enter 12 digit Aadhar number",groups={CreateStudent.class,UpdateStudent.class})
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
