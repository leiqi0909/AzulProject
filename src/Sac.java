
import java.util.LinkedList;
import java.util.Random;

public class Sac {

	public LinkedList<Tuiles> tuiles_s;
	
	public Frabrique fabrique;
	//public final boolean inaccessibles;
	Sac () {
		//this.inaccessibles=false;
		this.tuiles_s=new LinkedList<Tuiles>();
		
	}
	public boolean isEmpty() {
		return this.tuiles_s.size()==0;
	}
	public int getSize_s(){
		return this.tuiles_s.size();
	}
	/*public boolean ConTainsTuiles(Tuiles e) {
		for(int i=0;i<)
	}
	*/
	public void RemplirLeSac(Defausse d) {
		if(d!=null) {
			if(this.getSize_s()==0) {
					for(int i=0;i<d.tuiles_d.size();i++) {
						this.tuiles_s.add(d.tuiles_d.get(i));
						d.tuiles_d.remove(i);
					}
				}
			}
		}
	
	
}
