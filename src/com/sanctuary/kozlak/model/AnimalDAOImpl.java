package com.sanctuary.kozlak.model;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.sun.org.apache.bcel.internal.generic.NEW;



public class AnimalDAOImpl implements AnimalDAOInterface{

	MysqlConnection mysqlConnect = new MysqlConnection();
	PreparedStatement statement;
	List<Animal> animalList = new ArrayList<Animal>();


	
	@Override
	public void addAnimal(String imie, String rodzaj, String gatunek, String plec, String wielkosc, String infoDodatkowe) {
		try {
			statement = mysqlConnect.connect().prepareStatement("INSERT INTO `animal`(`imie`,`typ`,`gatunek`,`plec`,`wielkosc`,`informacjeDodatkowe`) VALUES (?,?,?,?,?,?)");
			statement.setString(1, imie);
			statement.setString(2, rodzaj);
			statement.setString(3, gatunek);
			statement.setString(4, plec);
			statement.setString(5, wielkosc);
			statement.setString(6, infoDodatkowe);
			int i = statement.executeUpdate();
			System.out.println(i+ "records inserted");
			
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			mysqlConnect.disconnect();
		}
		
	}
	
	@Override
	public void addCircumstances(String miejsce, String dodatkoweInfo)
	{
		try{
			statement = mysqlConnect.connect().prepareStatement("INSERT INTO `okolicznoscizaginiecia`(`miejsce`,`dodatkoweInfo`) VALUES (?,?)");
			statement.setString(1, miejsce);
			statement.setString(2, dodatkoweInfo);
			int i = statement.executeUpdate();
			System.out.println(i+ "records inserted");
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			mysqlConnect.disconnect();
		}
	}
	
	@Override
	public void addPersonalData(String imieNazwisko, long telefon)
	{
		try{
			statement = mysqlConnect.connect().prepareStatement("INSERT INTO `zglaszajacy`(`imieNazwisko`,`telefon`) VALUES (?,?)");
			statement.setString(1, imieNazwisko);
			statement.setLong(2, telefon);
			int i = statement.executeUpdate();
			System.out.println(i+ "records inserted");		
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			mysqlConnect.disconnect();
		}
	}
	

	@Override
	public void addMessage(String message) {
		try {
			statement = mysqlConnect.connect().prepareStatement("INSERT INTO `messages`(`message`) VALUES (?)");
			statement.setString(1, message);
			int i = statement.executeUpdate();
			System.out.println(i+ "messages added");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
		}
		
	}
	
	
	@Override
	public List<Animal> findAnimal(String imie, String gatunek, String plec, String wielkosc, String miejsceZaginiecia) throws SQLException
	{
		statement = mysqlConnect.connect().prepareStatement("SELECT * FROM `animal` LEFT JOIN `okolicznoscizaginiecia` ON animal.id = okolicznoscizaginiecia.id WHERE animal.gatunek LIKE '"+gatunek+
				"' AND animal.plec LIKE '"+plec+"' AND animal.wielkosc LIKE '"+wielkosc+"' AND okolicznoscizaginiecia.miejsce LIKE '"+miejsceZaginiecia+"'");	
		ResultSet rs = statement.executeQuery();
		while(rs.next()){
			Animal animal = new Animal(rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			animalList.add(animal);
		}
	return animalList;
	}
	
}
