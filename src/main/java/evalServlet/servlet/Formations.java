package evalServlet.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(urlPatterns="/formations")
public class Formations extends HttpServlet{
	public Formations() {}
	
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/formations.jsp").forward(request, response);
	
}

@Override
protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response) 
		throws ServletException, IOException {
	
}
}
