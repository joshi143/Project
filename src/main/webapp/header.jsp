<%@page import="com.onlinecart.signup.Sign_up"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Cart</title>

<link rel="stylesheet" href="navbar.css">

</head>
<body>

		<!--  <h1>Online cart System</h1>
		<h2>Welcome  ${fn:toUpperCase(sessionScope.signup.phone)} !</h2>
		-->
		<nav class="navbar">
		<a class="navbar" href="./main.jsp">
		<div class="brand-title">Online Cart ${fn:toUpperCase(sessionScope.signup.phone)}</div>
		<a href="#" class="toggle-button">
		</a> <span class="bar"></span> <span
			class="bar"></span> <span class="bar"></span>
		</a>
		<div class="navbar-links">
			<ul>
				<li><a href="./viewproducts">View Product</a></li>
				<li><a href="./buyproduct.jsp">Buy Product</a></li>
				<li><a href="./productslip.jsp">Bill Generate</a></li>
				<li><a href="./logout">Log Out</a></li>
			</ul>
		</div>
	</nav>

</body>
</html>