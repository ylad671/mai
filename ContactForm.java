package com.mailelec.home;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

public class ContactForm extends HttpServlet
 {

	    protected void doPost(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	         
	        
	        String fname = request.getParameter("firstname");
	        String lname = request.getParameter("lastname");
	        String city = request.getParameter("City");
	        String state = request.getParameter("State");
	        String Subject = request.getParameter("subject");
	        
	         
	        System.out.println("First Name: " + fname);
	        System.out.println("Last Name: " + lname);
	        System.out.println("City : " + city);
	        System.out.println("State : " + state );
	        System.out.println("Subject : " + Subject);
	        
	        PrintWriter writer = response.getWriter();
	         
	        // build HTML code
	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your FirstName is: " + fname + "<br/>";      
	        htmlRespone += "Your LastName is: " + lname + "</h2>";    
	        htmlRespone += "Your City is: " + city + "</h2> <br> " ;    
	        htmlRespone += "Your State is: " + state + "</h2> <br>";    
	        htmlRespone += "Your comment is: " + Subject + "</h2> <br>";    
	        htmlRespone += "</html>";
	         
	        // return response
	        writer.println(htmlRespone);
	         
	    }
	 
	}
 

