package evalServlet.modele;

import java.util.ArrayList;

public class User {
	private String login;
	
	private String mdp;

	private static ArrayList<User> listeUsers;
	
	public User(String login, String mdp) {
		this.setLogin(login);
		this.setMdp(mdp);
		
		if (listeUsers==null)
			listeUsers=new ArrayList<User>();
		listeUsers.add(this);
	}

	public static ArrayList<User> getListeUsers() {
		return listeUsers;
	}

	public static void setListeUsers(ArrayList<User> listeUsers) {
		User.listeUsers = listeUsers;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public static int getIndexUserFromLogin(String login) {
		int res=-1;
		for (User u : listeUsers) {
			if (u.getLogin().equals(login)) {
				res=listeUsers.indexOf(u);
			}
		}
		return res;
	}
	
	
}
