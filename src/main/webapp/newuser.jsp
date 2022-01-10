<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.headline{
text-align: center;
}

</style>
<meta charset="ISO-8859-1">
<title>Online Cart</title>
<link rel="stylesheet" href="signin.css">
</head>
<body>

<h2 class="headline">New User Register Here!!</h2>
<main>
 <main>
		<div class="bg-img">
			<div class="container">
				<main>
					<form action="./register" method="post">
						Enter Email : <input type="text" name="email"
							placeholder="Email" required><br>
						<br> Enter Name : <input type="text" name="name"
							placeholder="Name" required><br>
						<br> Enter Phone : <input type="text"
							name="phone" placeholder="Phone" required><br>
							<br> Enter Password : <input type="password"
							name="password" placeholder="Password" required>
						<br> <br> <input type="submit" value="Register new user"
							class="btn">
					</form>
				</main>
			</div>
		</div>
	</main>	
</main>
<%@ include file="footer.jsp"%>
</body>
</html>