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

	<div class="bg-img">
		<div class="container">
			<form action="./signin" method="post">
				<h1>Sign in</h1>

				<label for="phone"><b>Enter Phone Number:</b></label> <input
					type="text" placeholder="Enter Phone Number" name="uname">
				<label for="psw"><b>Enter Password</b></label> <input
					type="password" placeholder="Enter Password" name="pwd">

				<button type="submit" class="btn">Login</button>
				<br>
				<p>If you are new user please click here to Register!!</p>
				<br>

			</form>
			<a href="./newuser.jsp">
				<button type="submit" class="btn">New User</button>
			</a>
		</div>

		<footer class="footer">
			<h5>Copyright content of Online Cart &copy;</h5>

		</footer>
	</div>


</body>

</html>