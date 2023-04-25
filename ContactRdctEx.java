package com.mailelec.home;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactRdctEx extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public ContactRdctEx () {
		super();
				} // end method
	 
	protected void doGet (HttpServletRequest request , HttpServletResponse  response ) throws ServletException , IOException {
		 
		response.setContentType("Html/text");
		String site = new String ("/MaiElec/html/contact.html");
		
		response.setStatus(response.SC_ACCEPTED);
		response.setHeader("contact.html", site);
		response.sendRedirect(site);  
		
		//RequestDispatcher rd = request.getRequestDispatcher("/targetServlet");

		// Then, use the forward() method to forward the request to the target servlet
	//	rd.forward(request, response);
		
		System.out.println("Redirect Servlet Is Executed : ");
		return;
		}

}
