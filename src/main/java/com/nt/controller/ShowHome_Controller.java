package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHome_Controller {
	
	/*	@RequestMapping("/home")
		public String getHomePage() {
			
			return "welcome";
		}*/
	@RequestMapping("/")
	public String getHomePage() {
		
		return "welcome";
	}

}
