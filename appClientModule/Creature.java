
abstract class Creature implements Espece {
	
	protected double height;
	protected double weight;
	protected String name;
	protected int point;
	
	Creature(){}
	Creature(double height, double weight, String name) {
		this.height = height;
    	this.weight = weight;
    	this.name = name;
	}
	
	@Override
	public String getEspece() {
		// TODO Auto-generated method stub
		return "Vous etes de l'espèce " + this.getClass().getSimpleName() + "!!!!!";
	}
}