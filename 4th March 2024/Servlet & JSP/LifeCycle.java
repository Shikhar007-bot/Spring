package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int count =0;
	
	
	public void init(ServletConfig config) {
		System.out.println("Servlet Initialized "+ count);
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;
		
		PrintWriter pw = response.getWriter();
		pw.println(count);
		
		System.out.println("Request Count received "+ count);
		
		
		
	}
	
	public void destroy() {
		System.out.println("Servlet Destroyed");
	}

}
