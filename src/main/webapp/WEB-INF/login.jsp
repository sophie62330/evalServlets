<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="evalServlet.modele.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="login">
		<label for="login">Login : </label>
		<input type="text"  name="login" id="login"/>
		
		<label for="mdp">Mot de passe : </label>
		<input type="text"  name="mdp" id="mdp"/>
		
		<input type="submit"/>
	</form>
	
	

</body>
</html>