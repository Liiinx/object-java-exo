import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// choice character
		Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour !!");
        System.out.println("Vous souhaitez etre un chat ou un etre humain ? \n taper : \n 1 -> chat \n 2 -> humain");
        int nombre = scanner.nextInt();
        
        // start game
        if (nombre == 2) {
        	//person
        	Scanner scanner2 = new Scanner(System.in);
        	System.out.println("Votre nom : ");
        	String name = scanner2.nextLine();
        	System.out.println("Votre mail : ");
        	String mail = scanner2.nextLine();
        	Person person = new Person(mail, "default address", name);
    		System.out.println(person.getEspece());
    		System.out.println(person);
    		Cat defaultCat = new Cat("miaou", 20, 10, "chat de goutière");
    		
    		while (defaultCat.point >= 0 && defaultCat.point < 100 && defaultCat.getLive() >= 0) {
	            System.out.println("Souhaitez vous taper ou donner à manger au chat ? \n taper : 1 \n manger : 2");
	            int choice = scanner.nextInt();
	            if (choice == 1) {
	            	person.taper(defaultCat);
	            	System.out.println("le chat a maintenant " + defaultCat.point);
	            } else {
	            	person.giveFood(defaultCat);
	            	System.out.println("le chat a maintenant " + defaultCat.point);
	            }
    		
	    		if (defaultCat.point <= 0) {
	    			System.out.println("Vous venez de tuer un chat !! \n bien joué mais un chat a 7 vies");
	    			defaultCat.point = 30;
	    		} else if(defaultCat.point > 100)  {
	    			System.out.println("Le chat est mort d'une crise cardiaque \n bien joué mais un chat a 7 vies");
	    			defaultCat.point = 30;
	    		}
	    		System.out.println(defaultCat.getLive());
    		}
    		scanner2.close();
        } else {
        	//cat
        	Scanner scanner3 = new Scanner(System.in);
        	System.out.println("Votre nom : ");
        	String name = scanner3.nextLine();
        	System.out.println("Votre espèce : ");
        	String espece = scanner3.nextLine();
        	Cat cat = new Cat(name, 20, 10, espece);
        	Person defaultPerson = new Person();
        	System.out.println(cat);
        	
        	while (defaultPerson.point >= 0 && defaultPerson.point < 100) {
	            System.out.println("Souhaitez vous griffer ou vous faire gratter par john Rambo ? \n griffer : 1 \n gratter : 2");
	            int choice = scanner3.nextInt();
	            if (choice == 1) {
	            	cat.griffer(defaultPerson);
	            	//System.out.println("Rambo a maintenant " + defaultPerson.point);
	            } else {
	            	cat.ronronner(defaultPerson);
	            	//System.out.println("le chat a maintenant " + defaultCat.point);
	            }
    		}
    		
    		if (defaultPerson.point <= 0) {
    			System.out.println("Rambo est mort !!");
    		} else {
    			System.out.println("Fin");
    		}
        	scanner3.close();
        }
        // end game
        scanner.close();
		
 	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}