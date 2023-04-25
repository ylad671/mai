package com.mailelec.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServletEx extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public RedirectServletEx() {
		super();
				}  // end method
	 
	protected void doGet (HttpServletRequest request , HttpServletResponse  response ) throws ServletException , IOException {
		 
		response.setContentType("Html/text");
		String site = new String ("/MaiElec/html/index.html");
		
		response.setStatus(response.SC_ACCEPTED);
		response.setHeader("index.html", site);
	//	response.sendRedirect(site);  
		
		  System.out.println("Redirect Servlet Is Executed : ");
		
	   	  System.out.println("Welcome Message : Redirect Servlet");
		 
		    String linkValue = request.getParameter("link");
		    System.out.println(linkValue); 
		      
		    if (linkValue==null) {
		    	response.sendRedirect("/MaiElec/html/index.html"); 
		    	 
		    }
		    else if (linkValue.equals("abt")){ 
		    	response.sendRedirect("/MaiElec/html/about.html"); 		
		    } 
		    
		    else if (linkValue.equals("cntct")) {
		    	response.sendRedirect("/MaiElec/html/contact.html"); 
		    }
		    
		    else if (linkValue.equals("acct")) {
		    	response.sendRedirect("/MaiElec/html/account.html"); 
		    }  	    
		   
	    } 
		    	  	
	}
	


	
