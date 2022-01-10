
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
import com.onlinecart.signup.Product_payslip;

/**
 * Servlet implementation class Productpayslip
 */
public class Productpayslip extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(false);
//		String userphone = request.getParameter("phone");
		String userphone=(String) session.getAttribute("phone");
		String productname = request.getParameter("proname");
		signupinter sign = new Signupservice();
		Product_payslip productpayslip=null;
		String message="Please Buy product to generate this bill";
		try {
			productpayslip=sign.generatePayslip(userphone, productname);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(productpayslip!=null) {
			session.setAttribute("productpayslip", productpayslip);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("./payslip.jsp");
			requestDispatcher.forward(request, response);
		}else {
			session.setAttribute("message", message);
			RequestDispatcher dispatcher=request.getRequestDispatcher("./output.jsp");
			dispatcher.forward(request, response);
		}
	
	}

}
