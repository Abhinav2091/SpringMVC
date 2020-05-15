package com.luv2code.springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	//welcome mapping
	@RequestMapping("/")
	public String showPage()
	{
		return "main-menu";
	}
	
	@RequestMapping("/show-form")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/process-form")
	public String processForm()
	{
		return "hello-processed-form";
	}

	
	@RequestMapping("/process-form-version2")
	public String letsDoSomething(HttpServletRequest request,Model model)
	{
		//read the request param from HTML form
		String name=request.getParameter("studentName");
		
		//convert it to Upper Case
		name=name.toUpperCase();
		
		//add it too model
		model.addAttribute("message", name);
		
		return "hello-processed-form";
		
	}
	
	@RequestMapping("/process-form-version3")
	public String letsDoSomethingagain(@RequestParam("studentName") String name,Model model)
	{
		
		//convert it to Upper Case
		name=name.toUpperCase();
		
		//add it too model
		model.addAttribute("message", name);
		
		return "hello-processed-form";
		
	}
	
	
	
	
}
