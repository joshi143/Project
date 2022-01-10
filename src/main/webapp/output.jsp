<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Cart</title>
<style type="text/css">
body, html {
	height: 100%;
	background-image: url('backgournd-02.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
h3{
	text-align: center;
	padding-top: 280px;
	font-size: 50px;
}

a{
	text-decoration: none;
	color:white;
}

</style>
</head>
<body>
<%@ include file="header.jsp"%>
<main>
	<h3>${sessionScope.message}</h3>
	</main>
</body>
<%@ include file="footer.jsp"%>
</html>