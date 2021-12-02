
public class Person extends Creature {
	
    private String email;
    private String address;
    
    Person() {
    	this.setEmail("john.rambo@killer.com");
    	this.setAddress("texas");
    	super.height = 195;
    	super.weight = 90;
    	super.name = "john";
    	this.point = 50;
    }
    
    Person(String p_email, String p_address, String p_name) {
    	this.setEmail(p_email);
    	this.setAddress(p_address);
    	super.height = 175;
    	super.weight = 70;
    	super.name = p_name;
    	this.point = 50;
    }
    
    @Override
    public String toString() {
    	return "Votre nom : " + this.name + ", votre taille et poids :  " + this.height + " " + this.weight;
    }

    //getter setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void taper(Cat cat) {
		cat.point -= 20;
		System.out.println("Vous venez de taper le chat, il perd 20 points de vie");
		System.out.println("le chat a maintenant " + cat.point);
		if (cat.point <= 0) {
			cat.setLive(cat.getLive() - 1);
		}
	}
	public void giveFood(Cat cat) {
		cat.point += 20;
		System.out.println("Vous etes gentil, le chat gagne 20 points de vie");
		System.out.println("le chat a maintenant " + cat.point);
		if (cat.point > 100) {
			cat.setLive(cat.getLive() - 1);
		}
	}
	public void killCat(Cat cat, boolean typeOfDeath) {
		if(typeOfDeath) {
			System.out.println("Vous venez de tuer un chat !! \n bien joué mais le chat a encore " + cat.getLive() +  " vies");
			cat.point = 30;
		} else {
			System.out.println("Le chat est mort d'une crise cardiaque \n Le chat a encore " + cat.getLive() +  " vies");
			cat.point = 30;
		}
	}
 
}
