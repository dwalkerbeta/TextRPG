import java.util.*;

public class main {

	public static void main(String[] args) {

		// initialize all the vars and things we will use in the main game
		// method
		Scanner intin = new Scanner(System.in);
		Scanner stringin = new Scanner(System.in);
		int choice = 0;
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
				choice = 1;
			}

			else if (check.equals("n")) {
				String in = "Hands";
				character.setWeapon(in);
				System.out.println(
						"You are equipped with your " + character.getWeapon() + "\n" + StringBank.str1n + "\n");
				choice = 1;
			}

			else {
				System.out.println(StringBank.error);
			}

		} while (choice != 1);
		// end of first choice in game

		// choice 1.1
		if (choice == 1) {
			System.out.println(StringBank.str1_1);
			do {
				check = stringin.nextLine().toLowerCase();

				if (check.equals("right")) {
					System.out.println(StringBank.str1_1right);
					choice = 2;
					break;
				}

				else if (check.equals("left")) {
					System.out.println(StringBank.str1_1left);
					choice = 4;
					break;
				}

				else {
					System.out.println(StringBank.error);
				}
			} while ((choice != 2) || (choice != 4));
		}

		// this is if they have gone down the "right" path
		if (choice == 2) {

			do {

				check = stringin.nextLine().toLowerCase();

				if (check.equals("talk")) {
					int gobchoice = (int) ((Math.random() * 2) + 1);

					// goblin is pissed and wants to attack first
					if (gobchoice == 1) {

						System.out.println(
								"Your attempt to break the traditional antagonistic relationship between adventurers and monsters has failed. Prepare to be attacked!\n");

						int charattack, charhp, gobhealth = 6;

						do {
							// these are at the beginning because the while loop
							// simulates die rolls
							charattack = character.useWeapon(character.getWeapon());
							int gobattack = (int) (Math.random() * 3) + 1;

							// goblin attack and character health is set but not
							// seen
							charhp = character.getCharhealth() - gobattack;
							character.setCharhealth(charhp);

							// check to see if character health is below or
							// equal to
							// 0
							if (character.getCharhealth() <= 0) {
								System.out.println("The goblin dealt " + gobattack + " damage, leaving you with 0 HP\n"
										+ StringBank.chardeath);
								break;
							}

							else {
								System.out.println("The goblin dealt " + gobattack + " damage, leaving you with "
										+ character.getCharhealth() + " HP\n");
							}

							// character now attack goblin again
							gobhealth = gobhealth - charattack;

							// check to see if goblin health is below or equal
							// to 0
							if (gobhealth <= 0) {
								System.out.println("You dealt " + charattack
										+ " damage, leaving the goblin with 0 HP\n\nThe goblin has died. Congratulations!\n");
								break;
							}

							// if goblin isn't then return to top of loop
							else {
								System.out.println("You dealt " + charattack + " damage, leaving the goblin with "
										+ gobhealth + " HP\n");
							}

						} while (gobhealth > 0 || character.getCharhealth() > 0);
					}

					// enter dialogue with the goblin
					else {
						System.out.println("You have reached diplomacy");
						break;
					}
					choice = 3;
				}

				else if (check.equals("attack")) {
					// sets goblin health and variables to use for initial
					// attack
					int gobhealth = 6, charhp, charattack = character.useWeapon(character.getWeapon());

					// first attack because of initiative
					gobhealth = gobhealth - charattack;

					// check if goblin died yet
					if (gobhealth <= 0) {
						System.out.println("You dealt " + charattack
								+ " damage, leaving the goblin with 0 HP\n\nThe goblin has died. Congratulations!\n");
						break;
					}

					else {
						System.out.println(
								"You dealt " + charattack + " damage, leaving the goblin with " + gobhealth + " HP\n");
					}

					// begin do while loop for attacking the goblin
					do {
						// these are at the beginning because the while loop
						// simulates die rolls
						charattack = character.useWeapon(character.getWeapon());
						int gobattack = (int) (Math.random() * 3) + 1;

						// goblin attack and character health is set but not
						// seen
						charhp = character.getCharhealth() - gobattack;
						character.setCharhealth(charhp);

						// check to see if character health is below or equal to
						// 0
						if (character.getCharhealth() <= 0) {
							System.out.println("The goblin dealt " + gobattack + " damage, leaving you with 0 HP\n"
									+ StringBank.chardeath);
							break;
						}

						else {
							System.out.println("The goblin dealt " + gobattack + " damage, leaving you with "
									+ character.getCharhealth() + " HP\n");
						}

						// character now attack goblin again
						gobhealth = gobhealth - charattack;

						// check to see if goblin health is below or equal to 0
						if (gobhealth <= 0) {
							System.out.println("You dealt " + charattack
									+ " damage, leaving the goblin with 0 HP\n\nThe goblin has died. Congratulations!\n");
							break;
						}

						// if goblin isn't then return to top of loop
						else {
							System.out.println("You dealt " + charattack + " damage, leaving the goblin with "
									+ gobhealth + " HP\n");
						}

					} while (gobhealth > 0 || character.getCharhealth() > 0);

					choice = 3;
				}

				else {
					System.out.println(StringBank.error);
				}

			} while (choice != 3);
			// end of choice 3

			
			//put here how they can now inspect for lootz
			
			
			
		} // end of if choice == 2

		// this is if they have gone down the "left" path
		if (choice == 4) {
			System.out.println("left path choices");
		}

	} // end of public static void main DON'T GO OVER THIS
} // end of class ALSO DON'T GO OVER THIS
