package com.luv2code.springdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add initbinder to convert trim input string
	//remove leading  and traiiling whitespace
	//resolve our validation issue
	//this will trim ever extra space in over request
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor =new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("show-form")
	public String customerForm(Model model)
	{
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}

	@RequestMapping("process-form")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingresult)
	{
		System.out.println("|"+customer.toString()+"|");
		if(bindingresult.hasErrors())
		{
			return "customer-form";
		}
		
		return "customer-confirmation";
	}
}
