package com.code.springpractice.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicHWController {

	// controller method to show HTML form
	
	@RequestMapping("/processForm")
	public String displayForm(){
		return "basicHW-form";
	}
	
	
	
	// controller method to process HTML form 
}
