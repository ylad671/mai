package com.mailelec.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterForm extends HttpServlet{ 
	
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{  
	
		 String username = request.getParameter("username");
	     String email = request.getParameter("email");
	     String password = request.getParameter("password");
     
	     System.out.println("Username: " + username);
	     System.out.println("Email: " + email);
	     System.out.println("Password: " + password);
	        
	     try{
	     Class.forName("com.mysql.cj.jdbc.Driver");	 
	     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maielec","maielec","maielec");
	     PreparedStatement st = con.prepareStatement("insert into register_table values (?,?,?)");
         // PreparedStatement st = con.prepareStatement("delete from register_table WHERE user_name = 'hiii'" );
     	
	 	 // SET user_name = 'Yogesh Lad', user_email= 'ladyogesh671@gmail.com', user_password = '123456' WHERE user_name = 'yy';
        
		 
	     st.setString(1, username);
	     st.setString(2, email);
	     st.setString(3, password);
	     st.execute();
	     
	     
	     PreparedStatement Stmt = con.prepareStatement("SELECT * FROM register_table");
	      //  st.setString(1, username); 
	      //  st.setString(2, email);
		  //  st.setString(3, password);
	        ResultSet rs = Stmt.executeQuery();
	        while(rs.next()){
	        	String dbUserName=rs.getString("user_name");
	        	String dbUserEmail=rs.getString("user_email");
	        	String dbUserPassword=rs.getString("user_password");
	        	System.out.println("DBUserNAMe = " + dbUserName);
	        	System.out.println("DBUserEmail = " + dbUserEmail);
	        	System.out.println("DBUserPassword = " + dbUserPassword);
	        }
	        
	       // htmlRespone += "<h3> Your value entered is :   " + rs + "<br/>";
	       /* String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your username is: " + username + "<br/>"; 
	        htmlRespone += "<h2>Your Email is: " + email + "<br/>"; 
	        htmlRespone += "Your password is: " + password + "</h2>";    
	        htmlRespone += "</html>";   */

	    //    System.out.println(rs);
	        
	        /*if (count > 0) {
	            // Data already exists, do something here
	            // For example, you could update the existing record
	            PreparedStatement updateStmt = con.prepareStatement("UPDATE register_table SET user_name = ?, user_email=?,"
	            		+ " user_password=? WHERE user_name = ?");
	            updateStmt.setString(1, username);
	            updateStmt.setString(2, email);
	            updateStmt.setString(3,password);
	            updateStmt.executeUpdate();
	        } else {
	            // Data doesn't exist, insert a new record
	            PreparedStatement insertStmt = con.prepareStatement("insert into register_table values (?,?,?)");
	            insertStmt.setString(1,username );
	            insertStmt.setString(2,email );
	            insertStmt.setString(3, password);
	            insertStmt.executeUpdate();
	        }*/
	     
	     
	     }catch(Exception ex){
	       	ex.printStackTrace();
	     }
	     
	        PrintWriter writer = response.getWriter(); 
	        
	        	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your username is: " + username + "<br/>"; 
	        htmlRespone += "<h2>Your Email is: " + email + "<br/>"; 
	        htmlRespone += "Your password is: " + password + "</h2>";    
	        htmlRespone += "</html>";
	      
	        writer.println(htmlRespone);    
	        
	}

}
