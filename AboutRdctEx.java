package com.mailelec.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutRdctEx extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public AboutRdctEx () {
		super();
				} // end method
	 
	protected void doGet (HttpServletRequest request , HttpServletResponse  response ) throws ServletException , IOException {
		 
		response.setContentType("Html/text");
		String site = new String ("/MaiElec/html/about.html");
		
		response.setStatus(response.SC_ACCEPTED);
		response.setHeader("about.html", site);
		response.sendRedirect(site);  
		
		System.out.println("Redirect Servlet Is Executed : ");
		return;
		}

}
