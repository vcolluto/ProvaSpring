package com.corsojava.ProvaSpring.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.corsojava.ProvaSpring.model.Corso;

@Controller
@RequestMapping("/studenti")				//gestisce tutte le richieste (GET, POST, PUT, DELETE) del tipo /studenti/*
public class StudentiController {
	private Corso corso=new Corso();
	
	
	@GetMapping("/benvenuto") 		//gestisce le richieste di tipo GET del tipo /studenti/benvenuto?nome=xxx&cognome=yyy	
	public String benvenuto(Model model,
			@RequestParam(name="nome") String nome,
			@RequestParam(name="cognome") String cognome) {
		model.addAttribute("ora_corrente", LocalTime.now());
		model.addAttribute("nome_utente", nome+ ' '+ cognome);
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
	public String index(Model model) {
		model.addAttribute("studenti", corso.getElencoStudenti());
	
		return "studenti";
	}
	
	@GetMapping("/{id}") 	//gestisce le richieste GET del tipo /studenti/id
	public String dettaglioStudente(Model model, @PathVariable("id") String id ) {
		model.addAttribute("studente", corso.getStudente(Integer.parseInt(id)));
		return "studente";
	}

}
