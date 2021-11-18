<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="evalServlet.modele.Eleve"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Détail élève</h1>
	<%Eleve e=(Eleve) request.getAttribute("eleve"); %>

	<p>Nom : <% e.getNom(); %></p>
	<p>Prénom : <% e.getPrenom(); %></p>
	<p>Age : <% e.getAge(); %></p>
	<p>Note : <% e.getNote(); %></p>
	<p> Formation : <% e.getFormation().getTitre(); %>
</body>
</html>