package com.onlinecart.model.service;

import java.sql.SQLException;
import java.util.List;

import com.onlinecart.signup.Buy_product;
import com.onlinecart.signup.Product_payslip;
import com.onlinecart.signup.Products;
import com.onlinecart.signup.Sign_up;




public interface signupinter {
	public boolean getsignin(Sign_up signup)throws ClassNotFoundException,SQLException;
	public boolean insertUser(Sign_up signup) throws ClassNotFoundException, SQLException;
	List<Products> getAllproducts()throws ClassNotFoundException,SQLException;
	public boolean insertbuyproduct(Buy_product buyproduct) throws ClassNotFoundException, SQLException;
	public Product_payslip generatePayslip(String phone,String proname)throws ClassNotFoundException, SQLException;
}
