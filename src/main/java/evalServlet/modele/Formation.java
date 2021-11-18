package evalServlet.modele;

import java.util.ArrayList;

public class Formation {
	private String titre;
	
	private String programme;
	
	private static ArrayList<Formation> listeFormations; 
	
	private int nbEleves;

	public Formation(String titre, String programme) {
		this.setTitre(titre);
		this.setProgramme(programme);
		this.setNbEleves(0);
		
		
		if (listeFormations==null)
			listeFormations=new ArrayList<Formation>();
		listeFormations.add(this);
	}

	public static int getIndexFormationFromTitre(String titre) {
		int res=-1;
		
		for (Formation f : getListeFormations()) {
			if (f.getTitre().equals(titre)){
				res=listeFormations.indexOf(f);
			}
		}
		return res;
	}
	
	public String getTitre() {
		return titre;
	}

	public static ArrayList<Formation> getListeFormations() {
		return listeFormations;
	}

	public static void setListeFormations(ArrayList<Formation> listeFormations) {
		Formation.listeFormations = listeFormations;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public int getNbEleves() {
		return nbEleves;
	}

	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}
	
	
}
