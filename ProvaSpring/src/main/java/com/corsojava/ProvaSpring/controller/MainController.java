package com.corsojava.ProvaSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping()	
	public String home() {			//homepage
		return "index";				//nome del template html (view)
	}

}
