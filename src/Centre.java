import java.util.LinkedList;

public class Centre {
	public LinkedList<Tuiles> tab;
	
	Centre(){
		this.tab=new LinkedList<Tuiles>();
		tab.add(new Tuiles(Tuiles.Couleur.Premier));
	}
}
