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
	<!--  <main>
		<form action="./payslip" method="post">
			Enter  User Phone : <input type="text" name="phone"><br><br>
			Enter  Product Name : <input type="text" name="proname"><br><br>
			<br> <input type="submit" value="Buy product">
		</form>
	</main>
	-->
	<div class="bg-img">
		<div class="container">
			<form action="./payslip" method="post">
				

				<!--<label for="phone"><b>Enter Phone Number:</b></label> <input
					type="text" placeholder="Enter Phone Number" name="phone">
					-->
				<label for="proname"><b>Enter Product Name</b></label> <input
					type="text" placeholder="Enter Product Name" name="proname">

				<button type="submit" class="btn">Submit</button>
				<br>
				
				<br>

			</form>
			
		</div>

		<footer class="footer">
			<h5>Copyright content of Online Cart &copy;</h5>

		</footer>
	</div>
	
	<%@ include file="footer.jsp"%>

</body>
</html>