package com.onlinecart.model.service;

import java.sql.SQLException;
import java.util.List;

import com.online.model.persistence.SignDBC;
import com.online.model.persistence.Signimp;
import com.onlinecart.signup.Buy_product;
import com.onlinecart.signup.Product_payslip;
import com.onlinecart.signup.Products;
import com.onlinecart.signup.Sign_up;

public class Signupservice implements signupinter {
	private SignDBC signdbc=new Signimp();

	@Override
	public boolean insertUser(Sign_up signup) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int rows=signdbc.saveRecord(signup);
		if(rows>0) {
			return true;
		}
		return false;
	}
	
	@Override
	public List<Products> getAllproducts() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return signdbc.getallproducts();
	}
	@Override
	public boolean insertbuyproduct(Buy_product buyproduct) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int rows=signdbc.buyproduct(buyproduct);
		if(rows>0) {
			return true;
		}
		return false;
	}
	@Override
	public Product_payslip generatePayslip(String phone, String proname) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Buy_product buyproduct=signdbc.getRecordByphone(phone, proname);
		Product_payslip productpayslip=null;
		if(buyproduct!=null) {
			double gst=buyproduct.getProcost()*0.18;
			double totalcost=(gst*buyproduct.getProtaken())+(buyproduct.getProcost()*buyproduct.getProtaken());
			productpayslip=new Product_payslip(buyproduct,totalcost);
			
		}
		return productpayslip;
	}

	@Override
	public boolean getsignin(Sign_up signup) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Sign_up signup1=signdbc.signin(signup);
		if(signup1!=null) {
			return true;
		}
		return false;
	}

	

	
	
}
