package evalServlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import evalServlet.modele.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/accueil")
public class Accueil extends HttpServlet{
	public Accueil() {}
	
	@Override 
	protected void doGet(
				HttpServletRequest request,
				HttpServletResponse response) 
				throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
		Formation f1=new Formation("titre 1","programme1");
		Formation f2=new Formation("titre 2","programme2");
		Formation f3=new Formation("titre 3","programme3");
		Formation f4=new Formation("titre 4","programme4");
		Formation f5=new Formation("titre 5","programme5");
		
		Eleve e1=new Eleve("nom1","Sophie",33,15,f1);
		Eleve e2=new Eleve("nom2","Lucie",23,17,f2);
		Eleve e3=new Eleve("nom3","Fred",45,18,f1);
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
	}
}
