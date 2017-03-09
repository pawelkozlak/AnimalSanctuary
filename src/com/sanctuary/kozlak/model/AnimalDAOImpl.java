package com.sanctuary.kozlak.model;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.sun.org.apache.bcel.internal.generic.NEW;



public class AnimalDAOImpl implements AnimalDAOInterface{

	MysqlConnection mysqlConnect = new MysqlConnection();
	PreparedStatement statement;
	List<Animal> animalList = new ArrayList<Animal>();
 	
	@Override
	public List<Animal> findAll() {
		try {
			statement = mysqlConnect.connect().prepareStatement("SELECT * FROM `animal`");
			ResultSet rs = statement.executeQuery();
			while(rs.next()){
				Animal animal = new Animal(rs.getString(2), rs.getString(3), rs.getInt(4));
				animalList.add(animal);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
		}
		return animalList;
	}
	
	@Override
	public List<Animal> findByName(String name) throws SQLException{
		statement = mysqlConnect.connect().prepareStatement("SELECT * FROM `animal` WHERE `imie`='"+name+"'");
		ResultSet rs = statement.executeQuery();
			while(rs.next()){
				Animal animal = new Animal(rs.getString(2), rs.getString(3), rs.getInt(4));
				animalList.add(animal);
			}
		return animalList;
	}

	@Override
	public List<Animal> findByRace(String rasa) throws SQLException{
		statement = mysqlConnect.connect().prepareStatement("SELECT * FROM `animal` WHERE `rasa`='"+rasa+"'");
		ResultSet rs = statement.executeQuery();
			while(rs.next()){
				Animal animal = new Animal(rs.getString(2), rs.getString(3), rs.getInt(4));
				animalList.add(animal);
			}
		return animalList;
	}
	
	@Override
	public void addAnimal(String imie, String rasa, int wiek) {
		try {
			statement = mysqlConnect.connect().prepareStatement("INSERT INTO `animal`(`imie`,`rasa`,`wiek`) VALUES (?,?,?)");
			statement.setString(1, imie);
			statement.setString(2, rasa);
			statement.setInt(3, wiek);
			int i = statement.executeUpdate();
			System.out.println(i+ "records inserted");
			
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			mysqlConnect.disconnect();
		}
		
	}
	
	@Override
	public void removeAnimal(int id){
		try{
			statement = mysqlConnect.connect().prepareStatement("DELETE FROM `animal` WHERE `animal`.`id`="+id);
			int i = statement.executeUpdate();
			System.out.println(i+ "records deleted");
		}catch(SQLException e){
			e.printStackTrace();
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

	

	
}
