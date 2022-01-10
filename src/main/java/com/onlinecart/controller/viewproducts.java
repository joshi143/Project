package com.onlinecart.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinecart.model.service.Signupservice;
import com.onlinecart.model.service.signupinter;
import com.onlinecart.signup.Products;

/**
 * Servlet implementation class viewproducts
 */
public class viewproducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(false);
		signupinter signser = new Signupservice();
		List<Products> productslist = null;

		try {
			productslist = signser.getAllproducts();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		session.setAttribute("productslist", productslist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./viewproduct.jsp");
		dispatcher.forward(request, response);

	}

}
