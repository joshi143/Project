package com.onlinecart.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinecart.model.service.Signupservice;
import com.onlinecart.model.service.signupinter;
import com.onlinecart.signup.Sign_up;

/**
 * Servlet implementation class Registernewuser
 */
public class Registernewuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		signupinter sign=new Signupservice();
		Sign_up signup=new Sign_up(email,name, phone, password);
		

	String message=null;
		try {
			if(sign.insertUser(signup)) {
			message="Thanks for Registering !!! Registeration sucessfull";
		}
		else {
			message="Registration Failed!! re-Register";
		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		}
		session.setAttribute("message", message);
		RequestDispatcher dispatcher=request.getRequestDispatcher("./successfulreg.jsp");
		dispatcher.forward(request, response);
	
	}

}
