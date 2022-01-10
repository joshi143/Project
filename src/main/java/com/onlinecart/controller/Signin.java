package com.onlinecart.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinecart.model.service.Signupservice;
import com.onlinecart.model.service.signupinter;
import com.onlinecart.signup.Sign_up;

/**
 * Servlet implementation class Signin
 */
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String phonenumber=request.getParameter("uname");
		String password=request.getParameter("pwd");
		Sign_up signup=new Sign_up(phonenumber,password);
		
		signupinter signupser=new Signupservice();
		session.setAttribute("signup",signup);
		session.setAttribute("phone", phonenumber);
		try {
			if(signupser.getsignin(signup)) {
				response.sendRedirect("./main.jsp");
			}
			else {
				response.sendRedirect("./Signinfailed.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
