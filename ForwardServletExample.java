package com.mailelec.home;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServletExample extends HttpServlet { 
	

	 
	private static final long serialVersionUID = 1L;

	//end method
	 
	protected void doGet (HttpServletRequest request , HttpServletResponse  response ) throws ServletException , IOException {
		 
		// First, get a RequestDispatcher object for the target servlet
		RequestDispatcher rd = request.getRequestDispatcher("ControllerServlet");

		// Then, use the include() method to include the output of the target servlet in the response
		rd.include(request, response);

		
	/*	response.setContentType("Html/text");
		String site = new String ("/servlet/ContactServlet");
		
		response.setStatus(response.SC_ACCEPTED);
		response.setHeader("ControlleServlet", site);
		response.sendRedirect(site); */ 
		
		System.out.println("Redirect Servlet Is Executed : ");
		System.out.println("Response From Forward Servlet :");
		return;
	}
	
}
/**	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    
	        // Set an attribute on the request object
	        request.setAttribute("message", "Hello from ForwardServlet!");
	        
	        
	        // Forward the request to another servlet
	        getServletContext().getRequestDispatcher("/ControllerServlet").forward(request, response);
	    }
	    **/
	
	

	


