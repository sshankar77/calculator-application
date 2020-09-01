package com.soprasteria.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String showHomePage(ModelMap model) {
		
		model.put("message", "Prins");
		
		return "home";
	}

}
