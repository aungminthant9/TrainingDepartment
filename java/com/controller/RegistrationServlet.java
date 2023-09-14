package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import com.model.*;
import com.db.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ReadSheet rs = new ReadSheet();
		List<String> courseList = rs.getCourses();
		req.setAttribute("cl", courseList);
		RequestDispatcher RequetsDispatcherObj =req.getRequestDispatcher("/registration.jsp");
		RequetsDispatcherObj.forward(req, res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String userName = req.getParameter("username");
		String email = req.getParameter("email");
		String course = req.getParameter("course");
		String dofBirth = req.getParameter("dofb");
		Register r = new Register(userName,email,course,dofBirth);
		RegisterCRUD rcrud = new RegisterCRUD();
		try {
			rcrud.insertRegistrationData(r);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String session = "Default";
		String schedule = "Default";
		if (course.toLowerCase().contains("morning")) {
			session = "morning";
			schedule = "7:00 am to 9:00 am";
		}
		else if(course.toLowerCase().contains("evening")) {
			session= "evening";
			schedule = "4:00pm to 6:00pm";
		}
		else {
			session="afternoon";
			schedule="1:00pm to 3:00pm";
		}
		String sub = "Training Department";
		String message = "Hi There! This is from Training Department. Thank you for registering to attend the course."
				+ "Your selected course is "+ course+"."+" Since you choose to attend "+session+" session, "+
				"your schedule is from "+ schedule + " in the "+session+".";
		SendEmail sm = new SendEmail();
		sm.send("johnsonherryson222@gmail.com","qbypocfpuombwemr",email,sub,message);
		req.setAttribute("message",message);
		RequestDispatcher RequetsDispatcherObj =req.getRequestDispatcher("/thankyou.jsp");
		RequetsDispatcherObj.forward(req, res);
	}

}
