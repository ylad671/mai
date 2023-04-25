package com.mailelec.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet  {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
	/**	PrintWriter out = response.getWriter();
		System.out.println("Executing ControllerServlet doGet");
		RequestDispatcher reqd = request.getRequestDispatcher("/servlets/servlet/AboutRdctEx");
        reqd.forward(request, response);
		*/  
		
        String linkValue = request.getParameter("link");
	    System.out.println(linkValue); 
	      
	    if (linkValue==null) {
	    	//getServletContext().getRequestDispatcher("/MaiElec/html/index.html").forward(request, response);
	    	 RequestDispatcher dispatcher = request.getRequestDispatcher("/html/index.html");
	    	    dispatcher.forward(request, response);
	    	 
	    }
	    else if (linkValue.equals("abt")){ 
	    	
	    //	getServletContext().getRequestDispatcher("/MaiElec/html/about.html").forward(request, response);
	    	 RequestDispatcher dispatcher = request.getRequestDispatcher("AboutRdctEx");
	    	    dispatcher.forward(request, response);

	    } 
	    
	    else if (linkValue.equals("cntct")) { 
	    	
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("ContactRdctEx");
    	    dispatcher.forward(request, response);
	    	//private static final long serialVersionUID = 1L;

	    
	    				 // end method
	    	 
	    //	protected void doGet (HttpServletRequest request , HttpServletResponse  response ) throws ServletException , IOException {
	    		 
	    /*		response.setContentType("Html/text");
	     *		String site = new String ("/MaiElec/html/contact.html");
	    		
	    		response.setStatus(response.SC_ACCEPTED);
	    		response.setHeader("contact.html", site);
	    		response.sendRedirect(site);  
	    		
	    		System.out.println("Response from Forward Servlet Is Executed : ");
	    		return;
	    	//getServletContext().getRequestDispatcher("/MaiElec/html/contact.html").forward(request, response);
	    	 RequestDispatcher dispatcher = request.getRequestDispatcher("ContactRdctEx");
	    	    dispatcher.forward(request, response);
           */
	    }
	    
	    else if (linkValue.equals("acct")) {
	    	//getServletContext().getRequestDispatcher("/MaiElec/html/account.html").forward(request, response);
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("AccountRdctEx");
    	    dispatcher.forward(request, response);

	    	
	    }  	  
        
	    
		System.out.println("Forward Servlet Executed Successfully : ");

	}

}
