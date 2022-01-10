<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Cart</title>
<link rel="stylesheet" href="signin.css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<main>
		<div class="bg-img">
			<div class="container">
				<main>
					<form action="./buyproduct" method="post">
						Enter Product Name : <input type="text" name="proname"
							placeholder="Product Name"><br>
						<!--  <br> Enter User Phone : <input type="text" name="phone"
							placeholder="User Phone "><br>-->
						<br> Enter Number of Products : <input type="text"
							name="protaken" placeholder="Number of Products"><br>
						<br> <br> <input type="submit" value="Buy product"
							class="btn">
					</form>
				</main>
			</div>
		</div>
	</main>
	<%@ include file="footer.jsp"%>
</body>
</html>