package com.mailelec.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchBar extends HttpServlet{ 
	
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        
        String search = request.getParameter("search");
        
        System.out.println("username : " + search); 
        Connection con = null;
        PreparedStatement Stmt = null;
        ResultSet rs = null;
        try{
   	     Class.forName("com.mysql.cj.jdbc.Driver");	 
   	     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maielec","maielec","maielec");
   	     
   	     Stmt = con.prepareStatement("SELECT * FROM register_table Where user_name = ?");
   	     Stmt.setString(1, search);
	     rs = Stmt.executeQuery();
	     boolean UserExists = false;
	     while(rs.next()){
	    	 System.out.println(rs.getString(1));
	    	 System.out.println(rs.getString(2));
	    	 System.out.println(rs.getString(3));
	    	 System.out.println("User is Already registered Pls try Another UserName ");
	    		
	    		PrintWriter writer = response.getWriter();
	            
	            String htmlRespone = "<html>";
	            htmlRespone += "<h2> User Name is Already Registered <br/> ";
	            htmlRespone += "User Name:" + rs.getString(1);
	            htmlRespone += "User Email:" + rs.getString(2);
	            htmlRespone += "User Password:" + rs.getString(3);
	            htmlRespone += "</h2></html>";
	            writer.println(htmlRespone);
	            UserExists = true;
	     } 
	     
	     if (!UserExists) {
	    	 PrintWriter writer = response.getWriter();
	            
	            String htmlRespone = "<html>";
	            htmlRespone += "<h2> User Name " + search + " is not Registered <br/> " + 
	            "<form id='RegForm' action = '/MaiElec/servlet/RegisterServlet' method = 'POST'>" +
				"<input type='text' name = 'username' placeholder='Username'>" +
				"<input type='email' name = 'email' placeholder='Email'>" +
				"<input type='password' name = 'password' placeholder='password'>" +
				"<button type='submit' class='btn'>Register</button> " +
				"</form>";
	            htmlRespone += "</h2></html>";
	            writer.println(htmlRespone);
	    	  // Username already exists, do something...
	    	} else {
	    	  // Username doesn't exist, update it
	    	/*  PreparedStatement stmt2 = con.prepareStatement("UPDATE register_table SET user_name = ? WHERE user_name = ?");
	    	  stmt2.setString(1, search);
	    	  stmt2.setString(2, search); 
	    	  int rowsUpdated = stmt2.executeUpdate();
	    	  // Check if the update was successful
	    	  if (rowsUpdated > 0) { 
	    	  
	    	  } 
	    	  else {
	    		  
		      System.out.println("User is Not Registered pls Register"); 
		      
		      PrintWriter writer = response.getWriter();
	            
	            String htmlRespone = "<html>";
	            htmlRespone += "<h2> User Name is not Registered pls Register : <br/> </h2>";  
	            
	        /*    htmlRespone += "<form id='RegForm' action = '/MaiElec/servlet/RegisterServlet' method = 'POST'>";
	            htmlRespone += "<input type='text' name = 'username' placeholder='Username'>" ;
	            htmlRespone += "<input type='email' name = 'email' placeholder='Email'>";
	            htmlRespone += "<input type='password' name = 'password' placeholder='password'>";
	            htmlRespone += "<button type='submit' class='btn'>Register</button>";
	            htmlRespone += "</form>";
	        */
	            
	          /*  htmlRespone += "</html>";  
	              writer.println(htmlRespone);
               */
	    	  }
	    	  //stmt2.close();
	    	
	        
        }catch(Exception ex){
	       	ex.printStackTrace();
	    }finally{
	    	if(rs!=null){
	    	try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	}
	    	if(Stmt!=null){
	    	try {
				Stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	}
	    	if(con!=null){
	    	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	}
   	    }
	    	       

     }

}