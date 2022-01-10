package com.onlinecart.signup;

public class Product_payslip {
	private Buy_product buyproduct;
	
	private double totalcost;
	public Buy_product getBuyproduct() {
		return buyproduct;
	}
	public void setBuyproduct(Buy_product buyproduct) {
		this.buyproduct = buyproduct;
	}
	public double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}
	public Product_payslip(Buy_product buyproduct,double totalcost) {
		super();
		this.buyproduct = buyproduct;
		this.totalcost = totalcost;
	}
	@Override
	public String toString() {
		return "Product_payslip:-"+"\n" + buyproduct + "\n"+"Totalcost with GST=" + totalcost;
	}
	

}
