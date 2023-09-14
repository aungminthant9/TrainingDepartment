package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 String inputEmail = req.getParameter("inputEmail");
		 String inputPass = req.getParameter("inputPassword");
		 String email = "amt123@outlook.com";
		 String password = "12345678";
		  if (inputEmail.equals(email) && inputPass.equals(password)) {
			  RequestDispatcher RequetsDispatcherObj =req.getRequestDispatcher("/courseList.jsp");
			  RequetsDispatcherObj.forward(req, res);
		  }
		  else {
			  RequestDispatcher RequetsDispatcherObj =req.getRequestDispatcher("/login.jsp");
			  RequetsDispatcherObj.forward(req, res);
		  }
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
