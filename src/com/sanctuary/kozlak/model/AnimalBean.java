package com.sanctuary.kozlak.model;

import java.util.List;

public class AnimalBean {

	AnimalDAOImpl ao;
	private List<Animal> animals;
	
	
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
}
