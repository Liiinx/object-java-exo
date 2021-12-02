
public class Creature implements Espece {
	
	protected double height;
	protected double weight;
	protected String name;
	protected int point;
	
	@Override
	public String getEspece() {
		// TODO Auto-generated method stub
		return "Vous etes de l'espèce " + this.getClass().getSimpleName() + "!!!!!";
	}
}


