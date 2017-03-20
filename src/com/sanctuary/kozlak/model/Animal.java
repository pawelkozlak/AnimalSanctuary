package com.sanctuary.kozlak.model;

public class Animal {
	String name;
	String rasa;
	String plec;
	String wielkosc;
	String miejsceZaginiecia;
	

	public Animal(String name, String rasa, String plec, String wielkosc, String miejsceZaginiecia) {
		this.name = name;
		this.rasa = rasa;
		this.plec = plec;
		this.wielkosc = wielkosc;
		this.miejsceZaginiecia = miejsceZaginiecia;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}
	
	public void setWiek(String plec) {
		this.plec = plec;
	}
	public String getWielkosc() {
		return wielkosc;
	}

	public void setWielkosc(String wielkosc) {
		this.wielkosc = wielkosc;
	}

	public String getMiejsceZaginiecia() {
		return miejsceZaginiecia;
	}

	public void setMiejsceZaginiecia(String miejsceZaginiecia) {
		this.miejsceZaginiecia = miejsceZaginiecia;
	}
	
}
