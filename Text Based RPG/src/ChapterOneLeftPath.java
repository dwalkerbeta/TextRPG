import java.util.Scanner;

public class ChapterOneLeftPath {

	private static ChapterOneLeftPath chapteroneleftpath = new ChapterOneLeftPath();

	private ChapterOneLeftPath() {

	}

	public static ChapterOneLeftPath getInstance() {
		return chapteroneleftpath;
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

		do {

			check = stringin.nextLine().toLowerCase();

			if (check.equals("walk")) {
				System.out.println("You continue down the path and finally reach the end of the forest.");
			}

			else if (check.equals("search")) {
				System.out.println(
						"You search through the undergrowth and see a goblin lurking in ambush. It looks like he has a purse of coins on him.. (steal/attack/leave)\n");

				check = stringin.nextLine().toLowerCase();
				if (check.equals("steal")) {
					if (character.charclass == "Warrior") {
						int stealth = 1;
						int stealthcheck = (int) ((Math.random() * 5) + 1);

						if (stealth == stealthcheck) {
							character.setBank(10);
							System.out.println("You have succeeded in stealing the goblin's coins and now have 10 GP. You smile as you head onward with the forest soon to be behind you.\n");
						}

						else {
							System.out.println("You weren't stealthy enough and the goblin attacks you!\n");

							int charattack, charhp, gobhealth = 6;

							do {
								// these are at the beginning because the
								// while loop
								// simulates die rolls
								charattack = character.useWeapon(character.getWeapon());
								int gobattack = (int) (Math.random() * 3) + 1;

								// goblin attack and character health is set
								// but not
								// seen
								charhp = character.getCharhealth() - gobattack;
								character.setCharhealth(charhp);

								// check to see if character health is below
								// or
								// equal to
								// 0
								if (character.getCharhealth() <= 0) {
									System.out.println("The goblin dealt " + gobattack
											+ " damage, leaving you with 0 HP\n" + StringBank.chardeath);
									break;
								}

								else {
									System.out.println("The goblin dealt " + gobattack + " damage, leaving you with "
											+ character.getCharhealth() + " HP\n");
								}

								// character now attack goblin again
								gobhealth = gobhealth - charattack;

								// check to see if goblin health is below or
								// equal
								// to 0
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

								// if goblin isn't then return to top of
								// loop
								else {
									System.out.println("You dealt " + charattack + " damage, leaving the goblin with "
											+ gobhealth + " HP\n");
								}

							} while (gobhealth > 0 || character.getCharhealth() > 0);
						}
					}

					else if (character.charclass == "Rogue") {
						int stealth = 1;
						int stealthcheck = (int) ((Math.random() * 2) + 1);

						if (stealth == stealthcheck) {
							character.setBank(10);
							System.out.println("You have succeeded in stealing the goblin's coins and now have 10 GP. You smile as you head onward with the forest soon to be behind you.\n");

						}

						else {
							System.out.println("You weren't stealthy enough and the goblin attacks you!\n");

							int charattack, charhp, gobhealth = 6;

							do {
								// these are at the beginning because the
								// while loop
								// simulates die rolls
								charattack = character.useWeapon(character.getWeapon());
								int gobattack = (int) (Math.random() * 3) + 1;

								// goblin attack and character health is set
								// but not
								// seen
								charhp = character.getCharhealth() - gobattack;
								character.setCharhealth(charhp);

								// check to see if character health is below
								// or
								// equal to
								// 0
								if (character.getCharhealth() <= 0) {
									System.out.println("The goblin dealt " + gobattack
											+ " damage, leaving you with 0 HP\n" + StringBank.chardeath);
									break;
								}

								else {
									System.out.println("The goblin dealt " + gobattack + " damage, leaving you with "
											+ character.getCharhealth() + " HP\n");
								}

								// character now attack goblin again
								gobhealth = gobhealth - charattack;

								// check to see if goblin health is below or
								// equal
								// to 0
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

								// if goblin isn't then return to top of
								// loop
								else {
									System.out.println("You dealt " + charattack + " damage, leaving the goblin with "
											+ gobhealth + " HP\n");
								}

							} while (gobhealth > 0 || character.getCharhealth() > 0);
						}
					}

					else if (character.charclass == "Wizard") {
						int stealth = 1;
						int stealthcheck = (int) ((Math.random() * 4) + 1);

						if (stealth == stealthcheck) {
							character.setBank(10);
							System.out.println("You have succeeded in stealing the goblin's coins and now have 10 GP. You smile as you head onward with the forest soon to be behind you.\n");

						}

						else {
							System.out.println("You weren't stealthy enough and the goblin attacks you!\n");

							int charattack, charhp, gobhealth = 6;

							do {
								// these are at the beginning because the
								// while loop
								// simulates die rolls
								charattack = character.useWeapon(character.getWeapon());
								int gobattack = (int) (Math.random() * 3) + 1;

								// goblin attack and character health is set
								// but not
								// seen
								charhp = character.getCharhealth() - gobattack;
								character.setCharhealth(charhp);

								// check to see if character health is below
								// or
								// equal to
								// 0
								if (character.getCharhealth() <= 0) {
									System.out.println("The goblin dealt " + gobattack
											+ " damage, leaving you with 0 HP\n" + StringBank.chardeath);
									break;
								}

								else {
									System.out.println("The goblin dealt " + gobattack + " damage, leaving you with "
											+ character.getCharhealth() + " HP\n");
								}

								// character now attack goblin again
								gobhealth = gobhealth - charattack;

								// check to see if goblin health is below or
								// equal
								// to 0
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

								// if goblin isn't then return to top of
								// loop
								else {
									System.out.println("You dealt " + charattack + " damage, leaving the goblin with "
											+ gobhealth + " HP\n");
								}

							} while (gobhealth > 0 || character.getCharhealth() > 0);
						}
					}

					System.out.println("You head for the edge of the forest hoping your luck turns.\n");
					break;
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
							}

							else if (check.equals("")) {
								System.out.println("You didn't pick up the money. Have fun.");
								flag1 = 1;
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
							System.out.println("You dealt " + charattack + " damage, leaving the goblin with "
									+ gobhealth + " HP\n");
						}

					} while (gobhealth > 0 || character.getCharhealth() > 0);

					System.out.println("You head towards the forest edge that is now in sight, always on the lookout.\n");
					
					flag = 1;

					break;
				}

				else if (check.equals("leave")) {
					System.out.println("You continue ahead hoping to find friendlier beings/n");
					break;
				}

				else {
					System.out.println(StringBank.error);
				}
			}

			else {
				System.out.println(StringBank.error);
			}

			flag = 1;

		} while (flag == 0);

	}
}