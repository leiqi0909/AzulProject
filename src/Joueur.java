
public class Joueur {
	
	Tuiles[][] lignesMotif;
	Tuiles[][] mur;
	Tuiles[] plancher;
	int score;
	boolean first;
	Defausse defausse;
	
	public Joueur() {
		lignesMotif=new Tuiles[5][5];
		mur=new Tuiles[5][5];
		plancher=new Tuiles[6];
		first=false;
	}
	
	public void remplirLignes(int l,Tuiles[] e) {
		if(e.length>l++) {
			enTrop(l,e);
		}else {
			int cpt=0;
			while(lignesMotif[l][cpt]!=null) {
				cpt++;
			}
				for(int i=cpt;i<e.length;i++) {
							lignesMotif[l][i]=e[i];
				}
				
		}
		
	}
	
	public void enTrop(int l,Tuiles[] e) {
		int cpt=0;
		while(lignesMotif[l][cpt]!=null) {
			cpt++;
		}
		for(int i=cpt;i<l++;i++) {
			lignesMotif[l][i]=e[i];
		}
		if(estPlein()) {
			for(int i=l++;i<e.length;i++) {
				defausse.tuiles_d.add(e[i]);
			}
		}else {
			int a=0;
			while(plancher[a]!=null) {
				a++;
			}
			for(int i=l++;i<e.length;i++) {
				plancher[a]=e[i];
				a++;
			}
		}
		
	}
	
	public boolean estPlein() {
		return plancher[5]!=null;
	}
	

	

}
