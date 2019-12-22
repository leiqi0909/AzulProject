
public class Visible {
	Centre centre;
	Frabrique[] fabriques;
	Joueur joueur;
	
	public Visible(int n) {
		centre=new Centre();
		fabriques=new Frabrique[n*2+1];
	}
	
	public void fabriqueVersJoueur(int l,Tuiles e) {
		Tuiles[] tmpTuiles=null;
			for(int i=0;i<fabriques.length;i++) {
				for(int j=0;j<fabriques[i].tab.length;j++) {
					if(fabriques[i].tab[j]==e) {
						tmpTuiles=fabriques[i].memeCouleur(e);
						restant(fabriques[i]);
					}
				}
			}
		joueur.remplirLignes(l,tmpTuiles);
	}
	
	
	public void restant(Frabrique f) {
		for(int i=0;i<f.tab.length;i++) {
			if(f.tab[i]!=null) {
				centre.tab.add(f.tab[i]);
				f.tab[i]=null;
			}
		}
	}
	
	public boolean sacVersFrabrique(Sac s) {
		boolean b=true;
		int cpt=0;
		Tuiles index=s.tuiles_s.get(cpt);
		if(s.getSize_s()==0) {//si le sac est vide;
			b=false;
		}
			for(int i=0;i<fabriques.length;i++) {
				for(int j=0;j<fabriques[i].tab.length;j++) {
					if(fabriques[i].size()==fabriques[i].tab.length) {//si le fabrique est plein;
						b=false;
					}else {
						fabriques[i].tab[j]=index;
						s.tuiles_s.remove(index);
						cpt++;
						b=true;
				}
			}
		}
			return b;
	}
	
	
	
	
}
