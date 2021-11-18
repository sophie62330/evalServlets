package evalServlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import evalServlet.modele.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns="/login")
public class Login extends HttpServlet{
	public Login() {}
	
	@Override 
	protected void doGet(
				HttpServletRequest request,
				HttpServletResponse response) 
				throws ServletException, IOException {
		User user1=new User("login1","mdp1");
		User user2=new User("login2","mdp2");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
		String login=request.getParameter("login");
		String mdp=request.getParameter("mdp");
		
		ArrayList<User> listeUsers= User.getListeUsers();
		int index=User.getIndexUserFromLogin(login);
		if (index==-1) {
			//le login nexiste pas
			this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		} else {
			//le login existe on vérifie si il correspond au mot de passe renseigné
			User user=listeUsers.get(index);
			if (user.getMdp().equals(mdp)) {
				System.out.println("connecté");
				String contextPath = request.getContextPath();
				response.sendRedirect(contextPath+"/accueil");
				//this.getServletContext().getRequestDispatcher("/accueil").forward(request, response);
				//this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
			} else {
				System.out.println("pas connecté");
				this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
			}
		}
	}
}
