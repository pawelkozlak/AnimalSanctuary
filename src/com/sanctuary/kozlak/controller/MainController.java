package com.sanctuary.kozlak.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanctuary.kozlak.model.AnimalDAOImpl;
import com.sanctuary.kozlak.model.AnimalDAOInterface;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/MainController")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
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
		String rodzaj = request.getParameter("rodzaj");
		String gatunek = request.getParameter("gatunek");
		String plec = request.getParameter("plec");
		String wielkosc = request.getParameter("wielkosc");
		String infoDodatkowe = request.getParameter("infoDodatkowe");
		
		String miejsce = request.getParameter("miejsce");
		String infoDodatkoweZaginiecie = request.getParameter("dodatkoweInformacje");
		
		String imieNazwisko = request.getParameter("imieNazwisko");
		long telefon = Long.parseLong(request.getParameter("telefon"));
		
		ao.addAnimal(imie, rodzaj, gatunek, plec, wielkosc, infoDodatkowe);
		ao.addCircumstances(miejsce, infoDodatkoweZaginiecie);
		ao.addPersonalData(imieNazwisko, telefon);
		
		request.setAttribute("message", "Dziękujemy! Zwierzę zostało dodane do bazy.");
		request.getRequestDispatcher("dodaj.jsp").forward(request, response);
		
	}

}
