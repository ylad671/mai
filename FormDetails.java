package com.mailelec.home;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

public class FormDetails  extends HttpServlet
 {

	    protected void doPost(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	         
	        
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	         
	        System.out.println("username: " + username);
	        System.out.println("password: " + password);
	 
	        PrintWriter writer = response.getWriter();
	         
	        // build HTML code
	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your username is: " + username + "<br/>";      
	        htmlRespone += "Your password is: " + password + "</h2>";    
	        htmlRespone += "</html>";
	         
	        // return response
	        writer.println(htmlRespone);
	         
	    }
	 
	}
 
