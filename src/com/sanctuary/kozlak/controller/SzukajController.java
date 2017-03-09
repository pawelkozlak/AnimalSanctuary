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
		AnimalDAOImpl ao = new AnimalDAOImpl();
		String imie = request.getParameter("imie");
		String rasa = request.getParameter("rasa");
		
		if(!imie.equals("")){
					
			try {
				List<Animal> listAnimalsByName = ao.findByName(imie);
				request.setAttribute("listAnimalsByName", listAnimalsByName);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("szukaj.jsp").forward(request, response);
			}
		
		else if(!rasa.equals("")){
			try {
				List<Animal> listAnimalsByRace = ao.findByRace(rasa);
				request.setAttribute("listAnimalsByRace", listAnimalsByRace);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("szukaj.jsp").forward(request, response);
			}
	   }
	}


