package com.mailelec.home;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		String name = req.getParameter("user_name");
		String email = req.getParameter("user_password");
		String password = req.getParameter("user_email");
		String cond = req.getParameter("reg_cond");

		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
		System.out.println("cond : " + cond);

		//res.sendRedirect("/MaiElec/servlets/servlet/RedirectServletEx");
		
		RequestDispatcher reqdis = req.getRequestDispatcher("ForwardServletEx");
        reqdis.forward(req, res);
        
		/*
		 * res.setContentType("text/html"); PrintWriter out = res.getWriter();
		 * out.println ("<h3> Welcome to Register Servlet</h3> "); String name =
		 * req.getParameter("user_name"); String email =
		 * req.getParameter("user_password"); String Password =
		 * req.getParameter("user_email"); String cond =
		 * req.getParameter("reg_cond");
		 * 
		 * if (cond != null ){ if (cond.equals("checked")){ out.println
		 * ("<h2> Name : " + name + "</h2>"); out.println("<h2> Password : " +
		 * Password + "</h2>" ); out.println("<h2> Email : " + email + "</h2>"
		 * ); } else {
		 * out.println("<h2> You have not accepted terms and Conditions </h2>");
		 * } } else {
		 * out.println("<h2> You have not accepted terms and Conditions </h2>");
		 * 
		 * }
		 */

	}

}
