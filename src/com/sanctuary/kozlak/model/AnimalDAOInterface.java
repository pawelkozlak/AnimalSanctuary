package com.sanctuary.kozlak.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface AnimalDAOInterface {

	List<Animal> findAll();
	List<Animal> findByName(String name) throws SQLException;
	List<Animal> findByRace(String rasa) throws SQLException;
	void addAnimal(String imie, String rasa, int wiek);
	void removeAnimal(int id);
	void addMessage(String mess);
}
