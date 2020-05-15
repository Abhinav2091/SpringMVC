package com.luv2code.springdemo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private HashMap<String, String> countryOptions;
	@RequestMapping("/show-form")
	public String showForm(Model model)
	{
		//create a student object
		Student student=new Student();
		//add student object to model
		model.addAttribute("student",student);
		model.addAttribute("PcountryOption",countryOptions);
		
		return "student-form";
		
	}
	
	@RequestMapping("/process-form")
	public String processForm(@ModelAttribute("student") Student student)
	{
		System.out.println(student.toString());
		return "student-confirmation";
		
	}

}
