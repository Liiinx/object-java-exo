import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person extends Creature {
	
    private String email;
    private String address;
    private List<Cat> cats;
    private int numberHit;
    
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
    	this.setNumberHit(0);
    	setCats(new ArrayList<Cat>());
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
	public List<Cat> getCats() {
		return cats;
	}
	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}
	public int getNumberHit() {
		return numberHit;
	}
	public void setNumberHit(int numberHit) {
		this.numberHit = numberHit;
	}
	
	//functions
	public void taper(Cat cat, Scanner scanner) {
		cat.point -= 20;
		this.numberHit ++;
		if (this.numberHit == 2 && cat.point > 0) {
			//Scanner scanner5 = new Scanner(System.in);
	        System.out.println("Vous devriez adopter ce chat au lieu de le taper !? \n adopter : 1 \n retaper : 2");
	        int nombre = scanner.nextInt();
	        //scanner5.close();
	        if(nombre == 1 ) {
	        	cat = this.adopter(cat);
	        	this.numberHit = 0;
	        } else {
	        	System.out.println("Vous n'avez pas d'ame.");
	        	this.taper(cat, scanner);
	        }
		} else {
			System.out.println(this.numberHit);
			System.out.println("Vous venez de taper le chat, il perd 20 points de vie");
			System.out.println("le chat a maintenant " + cat.point);
			if (cat.point <= 0) {
				cat.setLive(cat.getLive() - 1);
			}
		}
	}
	public void giveFood(Cat cat) {
		cat.point += 20;
		System.out.println("Vous etes gentil, le chat gagne 20 points de vie");
		System.out.println("le chat a maintenant " + cat.point);
		if (cat.point > 80) {
			cat.setLive(cat.getLive() - 1);
		}
	}
	public void killCat(Cat cat, boolean typeOfDeath) {
		if(typeOfDeath) {
			System.out.println("Vous venez de tuer un chat !! \n bien joué, mais le chat a encore " + cat.getLive() +  " vies");
			cat.point = 30;
		} else {
			System.out.println("Le chat est mort d'une crise cardiaque \n Le chat a encore " + cat.getLive() +  " vies");
			cat.point = 30;
		}
	}
	public Cat adopter(Cat cat) {
		this.cats.add(cat);
		System.out.println("Bravo, vous avez adopter " + cats.size() + " chat");
		return new Cat("garfield", 20, 10, "chat feignant");
	}
}
