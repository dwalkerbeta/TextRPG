import java.util.Scanner;

public class ChapterOneRightPath {

	private static ChapterOneRightPath chapteronerightpath = new ChapterOneRightPath();

	private ChapterOneRightPath() {

	}

	public static ChapterOneRightPath getInstance() {
		return chapteronerightpath;
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

		// this is if they have gone down the "right" path

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

							System.out.println("You can now inspect the body with (inspect)\n");

							check = stringin.nextLine().toLowerCase();

							if (check.equals("inspect")) {
								character.setBank(10);
								System.out.println("You now have " + character.getBank() + " GP.");
								break;
							}

							else if (check.equals("")) {
								System.out.println("You didn't pick up the money. Have fun.");
								break;
							}

							else {
								System.out.println(StringBank.error);
							}

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
					System.out.println(
							"You have succeeded in talking the goblin down. You can now ask him questions! (path/goblin)\n");

					check = stringin.nextLine().toLowerCase();

					if (check.equals("path")) {
						System.out.println(
								"\"The path ahead leads towards a human village. I'll be leaving now.\"/n/nYou head towards the edge of the forest, keeping an eye out for the village.\n");
					}

					else if (check.equals("goblin")) {
						System.out.println(
								"\"I'm just a poor goblin. Thank you for taking pity on me. I don't know what came over me, it felt like I just had to attack you. I'll be leaving now, but the path ahead leads to a human village. So long!\"\n\nYou continue walking and wonder if there are other forces at work here..\n");
					}

					else {
						System.out.println(StringBank.error);
					}

					break;
				}
				flag = 1;
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

					System.out.println("You can now inspect the body with (inspect)\n");

					int flag1 = 0;

					do {
						check = stringin.nextLine().toLowerCase();

						if (check.equals("inspect")) {
							character.setBank(10);
							System.out.println("You now have " + character.getBank() + " GP.");
							flag1 = 1;
							break;
						}

						else if (check.equals("")) {
							System.out.println("You didn't pick up the money. Have fun.");
							flag1 = 1;
							break;
						}

						else {
							System.out.println(StringBank.error);
						}
					} while (flag1 == 0);
					
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
						System.out.println("You can now inspect the body with (inspect)\n");
						int flag1 = 0;

						do {

							check = stringin.nextLine().toLowerCase();

							if (check.equals("inspect")) {
								character.setBank(10);
								System.out.println("You now have " + character.getBank() + " GP.");
								flag1 = 1;
								break;
							}

							else if (check.equals("")) {
								System.out.println("You didn't pick up the money. Have fun.");
								flag1 = 1;
								break;
							}

							else {
								System.out.println(StringBank.error);
							}

						} while (flag1 == 0);

						break;

					}

					// if goblin isn't then return to top of loop
					else {
						System.out.println(
								"You dealt " + charattack + " damage, leaving the goblin with " + gobhealth + " HP\n");
					}

				} while (gobhealth > 0 || character.getCharhealth() > 0);

				flag = 1;
			}

			else {
				System.out.println(StringBank.error);
			}

		} while (flag == 0);

	}
}
