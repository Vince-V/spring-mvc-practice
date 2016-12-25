package com.code.springpractice.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping("/displayForm")
	public String showForm(){
		return "";
	}

}
