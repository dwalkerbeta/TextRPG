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
		System.out.println(StringBank.askcharname);
		String name = stringin.nextLine();
		if (name.isEmpty() == true) {
			name = "Leeroy Jenkins";
			System.out.println("Since you foolishly didn't enter a name, it is now Leeroy Jenkins\n");
		}
		character.setCharname(name);

		System.out.println("Hello " + character.getCharname() + ", " + StringBank.askcharclass);

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
				+ character.getCharhealth() + "\n" + StringBank.str1 + "\n");

		// this is the first choice in the game
		do {
			check = stringin.nextLine().toLowerCase();

			if (check.equals("y")) {
				character.setWeapon();
				System.out.println(StringBank.str1y);
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
				System.out.println(
						"You are equipped with your " + character.getWeapon() + "\n\n" + StringBank.str1n + "\n");
				flag = 1;
			}

			else {
				System.out.println(StringBank.error);
			}

		} while (flag == 0);
		// end of first choice in game

	}
}
