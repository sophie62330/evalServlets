package evalServlet.servlet;

import java.io.IOException;

import evalServlet.modele.Eleve;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/detailEleve")
public class DetailEleve extends HttpServlet{
	public DetailEleve() {}
	
	@Override 
	protected void doGet(
				HttpServletRequest request,
				HttpServletResponse response) 
				throws ServletException, IOException {

		String nom=request.getParameter("nom");
		Eleve e = Eleve.getListeEleves().get(Eleve.getIndexEleveFromNom(nom));
		request.setAttribute("formation", e);
		this.getServletContext().getRequestDispatcher("/WEB-INF/detailEleve.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
	}
}
