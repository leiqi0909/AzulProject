

public class Tuiles {
	public enum Couleur{ //enumeration des couleur et Premier jouer;
	blue,jaune,rouge,noir,blanc,Premier;
	}

	public Couleur color;
	
	public String getColor() {//Getteur de couleur ou premier jouer;
		return this.color.name();
	}
	public Couleur getco() {
		return this.color;
	}
	public Tuiles(Couleur c) {//initialiser les tuiles par couleur,sinon tuiles de premier jouer;
		switch(c) {
		case blue:
			color=Couleur.blue;
		case jaune:
			color=Couleur.jaune;
		case rouge:
			color=Couleur.rouge;
		case noir:
			color=Couleur.noir;
		case blanc:
			color=Couleur.blanc;
		default :
			color=Couleur.Premier;			
		}
	}
	/*public void IniTuiles2() {
		for(int i=0;i<20;i++) {
			tuiles.add(tuiles.get(i));
		}
	}
	*/
}
