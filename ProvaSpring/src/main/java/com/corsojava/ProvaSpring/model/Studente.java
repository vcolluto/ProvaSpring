package com.corsojava.ProvaSpring.model;

public class Studente {
	private String nome, cognome;
	private int id;
	
	public Studente(int id, String nome, String cognome ) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getId() {
		return id;
	}
	
	

}
