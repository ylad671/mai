package com.mailelec.home;

import java.io.IOException;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

public class OtherServlet extends HttpServlet{ 
	
	
	@WebServlet("/ForwardServletExample")  
	    
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        
	        // Get the "message" attribute from the request object
	        String message = (String) request.getAttribute("message"); 
	        
	        // Write the message to the response object
	        response.getWriter().println(message);
	    }
	    
	}


