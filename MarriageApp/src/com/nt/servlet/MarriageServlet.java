//MarriageServlet.java
package com.nt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

public class MarriageServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String name=null, gender=null; 
		int age=0;
		boolean status=false;
		
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//get request parameter values(form data)
		name=req.getParameter("pname");
		
		age=Integer.parseInt(req.getParameter("page"));
		gender=req.getParameter("gen");
		
		//write business logic for request processing logic
		if(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")){
		if(age>=21)
			status=age>=21?true:false;
			else
			status=age>=18?true:false;
			
		if(status)
			pw.println("<h1 style='color:green;text-align:center'>Mr/Miss..." +name+ "U r eligible to marry but think twice </h1>");
		else
			pw.println("<h1 style='color:green;text-align:center'>Mr/Miss..." +name+ "U r not eligible to marry ...Enjoy life </h1>");
		
		//add graphical hyperlink
		pw.println("<br><a href='input.html'>Home</a>");
		//close stream
		pw.close();
	}//doPost(-,-)
}//class
	
	
	

}
