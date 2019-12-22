
public class HorsJeu {
	Sac sac;
	Defausse defausse;
	Visible visible;
	
	public HorsJeu() {
		sac=new Sac();
		defausse=new Defausse();
	}
	
	public boolean GameOver() {
		boolean b=false;
		if(this.sac.tuiles_s.size()==0 || this.defausse.tuiles_d.size()==0) {
			System.out.println("le est Terminé,Au revoir");
			b=true;
		}
		return b;
	}
	

}
