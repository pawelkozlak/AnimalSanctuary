package com.sanctuary.kozlak.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface AnimalDAOInterface {

	void addAnimal(String imie, String rodzaj, String gatunek, String plec, String wielkosc, String infoDodatkowe);
	void addCircumstances(String miejsce, String dodatkoweInfo);
	void addMessage(String mess);
	void addPersonalData(String imieNazwisko, long telefon);
	List<Animal> findAnimal(String imie, String gatunek, String plec, String wielkosc, String miejsceZaginiecia) throws SQLException;
}
