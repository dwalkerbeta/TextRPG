import java.util.*;

public class main {
	

	public static void main(String[] args) {

		// initialize all the vars and things we will use in the main game method
		Scanner intin = new Scanner(System.in);
		Scanner stringin = new Scanner(System.in);
		int choice = 0;
		String check;
		//singleton method to have a single instance
		Character character = Character.getInstance();

		//START THE GAME ALREADY
		System.out.println(StringBank.askcharname);
		String name = stringin.nextLine();
		character.setCharname(name);
		System.out.println("Your name is " + character.getCharname() + "\n");
		
		do {
			// initialize the fields that will be parameters passed to the character methods
			String charclass;
			int charhealth;
			
			System.out.println(StringBank.askcharclass);
			int checkclass = intin.nextInt();
			
			if (checkclass == 1) {
				charclass = "Warrior";
				character.setCharclass(charclass);
				charhealth = 50;
				character.setCharhealth(charhealth);
			}

			else if (checkclass == 2) {
				charclass = "Rogue";
				character.setCharclass(charclass);
				charhealth = 35;
				character.setCharhealth(charhealth);
			}

			else if (checkclass == 3) {
				charclass = "Wizard";
				character.setCharclass(charclass);
				charhealth = 25;
				character.setCharhealth(charhealth);
			}

			else {
				System.out.println(StringBank.error);
			}
			
			System.out.println(character.getCharname() + ", you are a " + character.getCharclass() +
					" with a health of " + character.getCharhealth() + "\n");
			
		} while (character.charclass.equals(null));

		System.out.println(StringBank.str1);

		// this is the first choice in the game
		do {
			check = stringin.nextLine().toLowerCase();

			if (check.equals("y")) {
				character.setWeapon();
				System.out.println(StringBank.str1y);
				choice = 1;
			}

			else if (check.equals("n")) {
				System.out.println(StringBank.str1n);
				choice = 1;
			}

			else {
				System.out.println(StringBank.error);
			}
			
			//some pretty prints
			if(character.getCharclass() == "Warrior") {
				System.out.println("It is an " + character.getWeapon() + "\n");
			}
			
			else {
				System.out.println("It is a " + character.getWeapon() + "\n");
			}
		} while (choice == 0);
		// end of first choice in game

		// choice 1.1
		if (choice == 1) {
			System.out.println(StringBank.str1_1);
			do {
				check = stringin.nextLine().toLowerCase();

				if (check.equals("right")) {
					System.out.println(StringBank.str1_1right);
					choice = 2;
				}
				
				else if (check.equals("left")) {
					System.out.println(StringBank.str1_1left);
					choice = 2;
				}
				
				else {
					System.out.println(StringBank.error);
				}
			} while (choice == 1);
		}

	}
}
