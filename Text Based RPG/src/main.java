import java.util.*;

public class main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int choice = 0;
		String check = null;

		System.out.println(StringBank.askcharname);
		Character.charname = in.nextLine();

		do {
			System.out.println(StringBank.askcharclass);
			int checkclass = in.nextInt();
			if (checkclass == 1) {
				Character.charclass = "Warrior";
			}

			else if (checkclass == 2) {
				Character.charclass = "Rogue";
			}

			else if (checkclass == 3) {
				Character.charclass = "Wizard";
			}

			else {
				System.out.println(StringBank.error);
			}
		} while (Character.charclass.equals(null));

		Character.charclass = in.nextLine();

		System.out.println(StringBank.str1);

		// this is the first choice in the game
		do {
			System.out.println(StringBank.entercommand);
			check = in.nextLine().toLowerCase();

			if (check.equals("y")) {
				Actions.addWeapon();
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
		} while (choice == 0);
		// end of first choice in game

		// choice 1.1
		if (choice == 1) {
			System.out.println(StringBank.str1_1);
			do {
				System.out.println(StringBank.entercommand);
				check = in.nextLine().toLowerCase();

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
