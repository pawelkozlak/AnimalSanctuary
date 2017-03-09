package com.sanctuary.kozlak.model;

public class Animal {
	String name;
	String rasa;
	int wiek;
	
	public Animal(String name, String rasa, int wiek) {
		this.name = name;
		this.rasa = rasa;
		this.wiek = wiek;

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

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	
	
}
