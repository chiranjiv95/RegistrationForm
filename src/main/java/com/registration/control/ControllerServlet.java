package com.registration.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registration.dao.DaoJDBC;
import com.registration.model.UserDetails;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String fname=request.getParameter("first-name");
		String lname=request.getParameter("last-name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		//String condition=request.getParameter("terms");
		
		String age=request.getParameter("age");
		String course=request.getParameter("course");
		
		//store these inside pojo(plain old java object): userdetails class
		
		//create objects of UserDetails class and store the details inside it
			
		UserDetails details=new UserDetails(fname, lname, email, password, age, course);  //add : condition, age, course
		
		//insert the data into database 
		//1. call dao class
		DaoJDBC dao=new DaoJDBC();
			
		//CALL INSERT METHOD TO PERFORM DATA INSERTION, for that first create insert method in dao class
		
		String result=dao.insert(details);    //pass object of userdetails with it
			
		response.getWriter().println(result);
		
		
		}
		
		
			
			
		
		
		
		
		
	}


