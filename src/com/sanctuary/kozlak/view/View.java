package com.sanctuary.kozlak.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{

	JPanel myPanel;
	JButton addAnimal;
	JLabel name;
	JLabel age;
	JLabel race;
	JTextField nameField;
	JTextField ageField;
	JTextField raceField;
	
	public View() {
		myPanel = new JPanel();
		this.add(myPanel);	
		name = new JLabel("Imie");
		myPanel.add(name);
		nameField = new JTextField("wpisz imie",12);
		myPanel.add(nameField);
		age = new JLabel("wiek");
		myPanel.add(age);
		ageField = new JTextField("Wiek",5);
		myPanel.add(ageField);
		race = new JLabel("Rasa");
		myPanel.add(race);
		raceField = new JTextField("Rasa",8);
		myPanel.add(raceField);
		addAnimal = new JButton();
		myPanel.add(addAnimal);
	}
	

		
		
		public static void main(String[] args) {
			
			View v = new View();
			v.setVisible(true);
			v.pack();
			
		}
	
}
