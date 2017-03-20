package com.sanctuary.kozlak.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanctuary.kozlak.model.Animal;
import com.sanctuary.kozlak.model.AnimalDAOImpl;
import com.sanctuary.kozlak.model.AnimalDAOInterface;

/**
 * Servlet implementation class SzukajController
 */
@WebServlet("/SzukajController")
public class SzukajController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SzukajController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnimalDAOInterface ao = new AnimalDAOImpl();
		
		String imie = request.getParameter("imie");
		String rasa = request.getParameter("gatunek");
		String plec = request.getParameter("plec");
		String wielkosc = request.getParameter("wielkosc");
		String miejsceZaginiecia = request.getParameter("miejsceZaginiecia");
		
		if(rasa.equals("")){
			rasa = "%";
		}
		
		if(plec.equals("wybierz")){
			plec = "%";
		}
		
		if(wielkosc.equals("wybierz")){
			wielkosc = "%";
		}
		
		if(miejsceZaginiecia.equals("")){
			miejsceZaginiecia = "%";
		}
		
		try {
			List<Animal> listOfAnimals = ao.findAnimal(imie, rasa, plec, wielkosc, miejsceZaginiecia);
			if(listOfAnimals.isEmpty()){
			request.setAttribute("message", "Nie znaleziono zwierząt o podanych parametrach");
			}else{
			request.setAttribute("listOfAnimals", listOfAnimals);
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("szukaj.jsp").forward(request, response);
		
	
		
		
	
	   }
	}


