package evalServlet.modele;

import java.util.ArrayList;
import java.util.List;


public class Eleve{
	private String nom;
	
	private String prenom;
	
	private int age;
	
	private int note;
	
	private Formation formation;
	
	private static ArrayList<Eleve> listeEleves; 

	public static ArrayList<Eleve> getListeEleves() {
		return listeEleves;
	}

	public static void setListeEleves(ArrayList<Eleve> listeEleves) {
		Eleve.listeEleves = listeEleves;
	}

	public Eleve(String nom, String prenom, int age, int note, Formation formation) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAge(age);
		this.setNote(note);
		this.setFormation(formation);
		
		if (listeEleves==null)
			listeEleves=new ArrayList<Eleve>();
		listeEleves.add(this);
		
		formation.setNbEleves(formation.getNbEleves()+1);
		
	}

	public static int getIndexEleveFromNom(String nom) {
		int res=-1;
		
		for (Eleve e : getListeEleves()) {
			if (e.getNom().equals(nom)){
				res=listeEleves.indexOf(e);
			}
		}
		return res;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	
}
