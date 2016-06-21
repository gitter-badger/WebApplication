<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="index.css">
	<link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>
	<div class="outer-container">
		
		<div class="index-header">	
			
			<div class="index-header-navigation">

			</div>

			<div class="backround-style index-header-title">
				<h1>Login</h1>
			</div>
		
		</div>	

		<div class="index-content"> 
			<div class="backround-style login-content">
				<form class="login-form backround-style-input" method="post" action="loginServletPath">
					<p> Enter your username/email <p>
					<input type="text" "userName" />
					<p> Enter your password <p>
					<input type="text" name="userPassword" />
					<input type="submit" />
				</form>
			</div>
		</div>

		<div class="backround-style index-footer"> 
				<p> Created by Yamada <p>
		</div>
	</div>	

</body>
</html>