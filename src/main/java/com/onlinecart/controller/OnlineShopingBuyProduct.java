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
import com.onlinecart.signup.Buy_product;

/**
 * Servlet implementation class OnlineShopingBuyProduct
 */
public class OnlineShopingBuyProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String proname=request.getParameter("proname");
		proname=proname.toLowerCase();
	//	String phone=request.getParameter("phone");
	//	session.getAttribute(phone);
		String phone=(String) session.getAttribute("phone");
		int protaken=Integer.parseInt(request.getParameter("protaken"));
		signupinter sign=new Signupservice();
		Buy_product buyproduct=new Buy_product(proname, phone, protaken);
		

	String message=null;
		try {
			if(sign.insertbuyproduct(buyproduct)) {
			message="Thanks For Shopping You Can Generate Your Bill";
		}
		else {
			message="Buy Product Failed!";
		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		}
		session.setAttribute("message", message);
		RequestDispatcher dispatcher=request.getRequestDispatcher("./output.jsp");
		dispatcher.forward(request, response);
	}

}
