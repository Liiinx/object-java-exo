
public class Cat extends Creature {
	
	private String species;
	private int live;
	
	Cat(String name, double height, double weight, String p_species) {
		super(height, weight, name);
		super.point = 30;
    	this.setSpecies(p_species);
    	this.setLive(7);
    }

	//getter setter
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getLive() {
		return live;
	}
	public void setLive(int live) {
		this.live = live;
	}
	
	@Override
    public String toString() {
      return "Je suis un gentil chat de race " + this.species + " et je m'appelle " + this.name;
    }
	
	//methods
	public void griffer(Person person) {
		person.point -= 30;
		System.out.println("Vous griffez fort, vostre adversaire a " + person.point); 
	}
	public void ronronner(Person person) {
		person.point += 20;
		this.point +=10; 
		System.out.println("relax");
	}

}
