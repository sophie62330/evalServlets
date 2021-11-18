<%@page import="evalServlet.modele.Formation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Détail formation</h1>
	<%Formation f=(Formation) request.getAttribute("formation"); %>

	<h1>Titre : <% f.getTitre(); %></h1>
	<p>Programme : <% f.getProgramme(); %></p>
	<p>Nombre d'élèves : <% f.getNbEleves(); %></p>
</body>
</html>