package com.sanctuary.kozlak.model;

import java.util.List;

public class ta  {
	
	
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		AnimalDAOImpl ao = new AnimalDAOImpl();
		ao.addMessage("sdfsdfsdf");
		
		List<Animal> la = ao.findAll();
		
		for(Animal a : la){
			System.out.println(a.rasa);
			
		}
		
		
		
		
		}
}