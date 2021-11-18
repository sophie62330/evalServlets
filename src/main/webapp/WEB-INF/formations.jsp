<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="evalServlet.modele.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>les formations</h1>
		<% for (Formation f : Formation.getListeFormations()) { %>
		<li>	
			<a href="/detailFormation?titre=<%=f.getTitre() %>"><%= f.getTitre() %></a>
		</li>
	<% } %>
</body>
</html>