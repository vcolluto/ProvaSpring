package com.corsojava.ProvaSpring.model;

import java.util.ArrayList;
import java.util.Collections;

public class Corso {
	private ArrayList<Studente> elencoStudenti;
	
	public Corso() {
		elencoStudenti=new ArrayList<>();
		
		elencoStudenti.add(new Studente(1, "Dario", "Rossi"));
		elencoStudenti.add(new Studente(2, "Barbara", "Verdi"));
		elencoStudenti.add(new Studente(3, "Francesca", "Gialli"));
	}
	
	public Studente getStudente(int id) {
		return elencoStudenti.get(id-1);
	}
	
	public ArrayList<Studente> getElencoStudenti() {
		
		return elencoStudenti;
	}
	

}
