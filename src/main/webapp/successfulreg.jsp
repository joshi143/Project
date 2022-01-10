<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
.btnsignin {
	background-color: black;
	 z-index:3;
	color: white;
	padding: 16px 20px;
	border: none;
	cursor: pointer;
	width: 10%;
	opacity: 0.9;
}

.btnsignin:hover {
	background-color: gray;
}
</style>
<title>Online Cart</title>
<link rel="stylesheet" href="signin.css">
</head>
<body>
<h3>${sessionScope.message}</h3>
<br>
<br>
<h3>Click this Sign in to get into Online Cart Application</h3>
<a href="./signin.jsp"> <button type=submit class="btnsignin">Sign in</button></a>
</body>
<%@ include file="footer.jsp"%>
</html>