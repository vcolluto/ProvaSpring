package com.corsojava.ProvaSpring.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/studenti")				//gestisce tutte le richieste (GET, POST, PUT, DELETE) del tipo /studenti/*
public class StudentiController {
	
	@GetMapping("/benvenuto") 		//gestisce le richieste di tipo GET del tipo /studenti/benvenuto	
	public String benvenuto(Model model) {
		model.addAttribute("ora_corrente", LocalTime.now());
		return "benvenuto";
	}
	
	@GetMapping("/arrivederci") 		//gestisce le richieste di tipo GET del tipo /studenti/arrivederci
	@ResponseBody
	public String arrivederci() {
		
		return "<html><body>"
				+ "<h1>Alla prossima!</h1>"
				
				+ "</body></html>";
	}

	
	@GetMapping() 		//gestisce le richieste di tipo GET del tipo /studenti
	@ResponseBody
	public String index() {
		
		return "<html><body>"
				+ "<h1>Benvenuto nella gestione studenti</h1>"
				
				+ "</body></html>";
	}

}
