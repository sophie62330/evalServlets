package evalServlet.servlet;

import java.io.IOException;

import evalServlet.modele.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/eleves")
public class Eleves extends HttpServlet{
		public Eleves() {}

	@Override 
	protected void doGet(
				HttpServletRequest request,
				HttpServletResponse response) 
				throws ServletException, IOException {

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/eleves.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
	}
}
