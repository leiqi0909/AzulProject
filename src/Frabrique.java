
public class Frabrique {
	
	public Tuiles[] tab;
	
	Frabrique(){
		this.tab=new Tuiles[3];
	}
	public Tuiles[] getFrabrique() {
		return this.tab;
	}
	public void setFrabrique(Tuiles[] t) {
		this.tab=t;
	}
	
	public Tuiles[] memeCouleur(Tuiles e){
		int cpt=0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i].getColor()==e.getColor()) {
				cpt++;
			}
		}
		Tuiles[] rep=new Tuiles[cpt];
		for(int i=0;i<tab.length;i++) {
			if(tab[i].getColor()==e.getColor()) {
				rep[cpt--]=tab[i];
				tab[i]=null;
			}
		}
		return rep;
	}
	
	public int size() {
		int cpt=0;
		while(cpt!=tab.length) {
			if(tab[cpt]!=null) {
				cpt++;
			}
		}
		return cpt;
	}
}
