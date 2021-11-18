package evalServlet.servlet;

import java.io.IOException;

import evalServlet.modele.Formation;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/detailFormation")
public class DetailFormation extends HttpServlet{
	public DetailFormation() {}
	
	@Override 
	protected void doGet(
				HttpServletRequest request,
				HttpServletResponse response) 
				throws ServletException, IOException {
		String titre=request.getParameter("titre");
		Formation f = Formation.getListeFormations().get(Formation.getIndexFormationFromTitre(titre));
		System.out.println("titre : "+f.getTitre());
		request.setAttribute("formation", f);
		this.getServletContext().getRequestDispatcher("/WEB-INF/detailFormation.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
	}
}
