import java.util.Scanner;

public class ChapterZero {

	private static ChapterZero chapterzero = new ChapterZero();

	private ChapterZero() {

	}

	public static ChapterZero getInstance() {
		return chapterzero;
	}

	public static void main(String[] args) {

		// initialize all the vars and things we will use in the main game
		// method
		Scanner intin = new Scanner(System.in);
		Scanner stringin = new Scanner(System.in);
		String check;
		int flag = 0;
		// singleton method to have a single instance
		Character character = Character.getInstance();

		// START THE GAME ALREADY
		System.out.println("What is your name?\n");
		String name = stringin.nextLine();
		if (name.isEmpty() == true) {
			name = "Leeroy Jenkins";
			System.out.println("Since you foolishly didn't enter a name, it is now Leeroy Jenkins\n");
		}
		character.setCharname(name);

		System.out.println("Hello " + character.getCharname() + ", what is your class? (Choose a number) \n1. Warrior\n2. Rogue\n3. Wizard\n");

		do {
			// initialize the fields that will be parameters passed to the
			// character methods
			String charclass;
			int charhealth, checkclass = intin.nextInt();

			if (checkclass == 1) {
				charclass = "Warrior";
				character.setCharclass(charclass);
				charhealth = 50;
				character.setCharhealth(charhealth);
				flag = 1;
			}

			else if (checkclass == 2) {
				charclass = "Rogue";
				character.setCharclass(charclass);
				charhealth = 35;
				character.setCharhealth(charhealth);
				flag = 1;
			}

			else if (checkclass == 3) {
				charclass = "Wizard";
				character.setCharclass(charclass);
				charhealth = 25;
				character.setCharhealth(charhealth);
				flag = 1;
			}

			else {
				System.out.println(StringBank.error);
			}

		} while (flag == 0);

		flag = 0;

		System.out.println(character.getCharname() + ", you are a " + character.getCharclass() + " with a health of "
				+ character.getCharhealth() + "\nYou find yourself in the clearing of a forest. There is a weapon on the ground, do you take it? (y/n)\n");

		// this is the first choice in the game
		do {
			check = stringin.nextLine().toLowerCase();

			if (check.equals("y")) {
				character.setWeapon();
				System.out.println("You take the weapon\n");
				if (character.getCharclass() == "Warrior") {
					System.out.println("You now have an " + character.getWeapon() + "\n");
				}

				else {
					System.out.println("You now have a " + character.getWeapon() + "\n");
				}
				flag = 1;
			}

			else if (check.equals("n")) {
				String in = "Hands";
				character.setWeapon(in);
				System.out.println("You leave the weapon behind. Good luck.\n" + 
						"You are equipped with your " + character.getWeapon() + "\n");
				flag = 1;
			}

			else {
				System.out.println(StringBank.error);
			}

		} while (flag == 0);
		// end of first choice in game

	}
}
