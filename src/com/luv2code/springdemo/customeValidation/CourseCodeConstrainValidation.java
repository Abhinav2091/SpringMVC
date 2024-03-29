package com.luv2code.springdemo.customeValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstrainValidation implements ConstraintValidator<CourseCode, String> {
	
	private String coursePrifix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrifix=theCourseCode.value();
		
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		if(theCode !=null)
		result=theCode.startsWith(coursePrifix);
		else
		result=true;
		
		
		return result;
	}


	
}

