package com.online.model.persistence;

import java.sql.SQLException;
import java.util.List;

import com.onlinecart.signup.Buy_product;
import com.onlinecart.signup.Product_payslip;
import com.onlinecart.signup.Products;
import com.onlinecart.signup.Sign_up;





public interface SignDBC {
	int saveRecord(Sign_up signup)throws ClassNotFoundException,SQLException;
	Sign_up signin(Sign_up signup)throws ClassNotFoundException,SQLException;
	List<Products> getallproducts()throws ClassNotFoundException,SQLException;
	int buyproduct(Buy_product buyproduct) throws ClassNotFoundException, SQLException;
	Buy_product getRecordByphone(String phone,String proname)throws ClassNotFoundException,SQLException;
}
