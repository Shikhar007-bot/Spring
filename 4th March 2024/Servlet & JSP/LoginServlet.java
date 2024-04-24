package com.cdac.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Retrive usernane & password from the form
		String s1 = request.getParameter("username");
		String s2 = request.getParameter("password");
		
		//add Authentication logic
		
		if ("admin".equalsIgnoreCase(s1) && "admin".equalsIgnoreCase(s2))
		{
			
			response.sendRedirect("SuccessServlet?s1=" +s1);
		}
		
		else {
			//if authentication fails, fwd to login page
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
			dispatcher.forward(request, response);
			 
		}

	}

}
