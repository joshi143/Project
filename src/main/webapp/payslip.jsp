<%@page import="com.onlinecart.signup.Product_payslip"%>
<%@page import="com.onlinecart.signup.Buy_product"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Cart</title>
<link rel="stylesheet" href="payslip.css" type="text/css">
</head>
<body>
<%@ include file="header.jsp"%>
<div class="payslipmain">
	<h2 class="textmain">Invoice !!</h2>
	<table border="1">
		<thead>
		<tr>
		<h2  class="textmain">Company Name:-Online Cart</h2>
		<h3  class="textmain">Address:- XYZ layout</h3>
		<h3  class="textmain">Bangalore.</h3>
		
		</tr>
			<tr>
				
				<th colspan="2">Product Bill</th>
				<th>TotalCost with GST</th>
			</tr>
		</thead>
		<tbody>

			<tr>
				<td>User Phone</td>
				<td>${sessionScope.productpayslip.buyproduct.phone }</td>
				<td rowspan="4">Rs. ${sessionScope.productpayslip.totalcost }</td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td>${sessionScope.productpayslip.buyproduct.proname }</td>
			</tr>
			<tr>
				<td>Product Taken</td>
				<td>${sessionScope.productpayslip.buyproduct.protaken }</td>
			</tr>
			<tr>
				<td>Cost Per Product</td>
				<td>Rs. ${sessionScope.productpayslip.buyproduct.procost }</td>
			</tr>
		</tbody>

	</table>
	<br>
	<br>
	<br>
	<br>
	<br>
	<h3 class="textmain">Happy Shopping!!</h3>
	</div>
	<br>
	<br>
<%@ include file="footer.jsp"%>
</body>
</html>