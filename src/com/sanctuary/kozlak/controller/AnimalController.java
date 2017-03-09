package com.sanctuary.kozlak.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanctuary.kozlak.model.Animal;
import com.sanctuary.kozlak.model.AnimalBean;
import com.sanctuary.kozlak.model.AnimalDAOImpl;

/**
 * Servlet implementation class AnimalController
 */
@WebServlet("/AnimalController")
public class AnimalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnimalDAOImpl animalDAO = new AnimalDAOImpl();
		
		List<Animal> animals = animalDAO.findAll();
		request.setAttribute("animals", animals);
		request.getRequestDispatcher("zwierzeta.jsp").forward(request, response);
	
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
