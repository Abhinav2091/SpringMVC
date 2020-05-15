package com.luv2code.springdemo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.customeValidation.CourseCode;

public class Customer {

	@NotBlank(message = "cant be blank")
	private String fName;
	@NotNull(message = "cannont be null")
	@Size(min = 3, message = "Size must be greater than 3")
	private String lName;

	@NotNull
	@Min(value = 0, message = "value cannot be less than Zero")
	@Max(value = 10, message = "value cannot be more than Ten")
	private Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "cannot be more or less than 5 char")
	private String postalCode;

	// custome validation
	@CourseCode(value = "LUV", message = "must start with LUV")
	private String courseCode;

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", freePasses=" + freePasses + ", postalCode="
				+ postalCode + ", courseCode=" + courseCode + "]";
	}

}
