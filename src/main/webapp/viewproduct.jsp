<%@page import="com.onlinecart.signup.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Cart</title>
<link rel="stylesheet" href="viewproucts.css" type="text/css">
</head>
<body>
<%@ include file="header.jsp"%>
	<div class="bg-img">
		<div class="container">
	<main>
		<table class="view" >
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Product Name</th>
					<th>Product Cost</th>
					<th>Product Avail</th>

				</tr>
			</thead>
			<c:forEach items="${sessionScope.productslist}" var="product">
				<tr>
					<td class="data">${product.proid }</td>
					<td class="data">${product.pname }</td>
					<td class="data">${product.procost }</td>
					<td class="data">${product.proavail }</td>
				</tr>
			</c:forEach>
		</table>
		<br>

	</main>
</div>
</div>

</body>
<%@ include file="footer.jsp"%>
</html>
