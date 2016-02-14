
public class Character {
	
	private static Character character = new Character();
	
	private Character() {}
	
	public static Character getInstance() {
		return character;
	}

	String charname;
	String charclass;
	int charhealth;
	String weapon;

	public void setCharname(String in) {
		charname = in;
	}

	public String getCharname() {
		return charname;
	}

	public void setCharclass(String in) {
		charclass = in;
	}

	public String getCharclass() {
		return charclass;
	}

	public void setCharhealth(int in) {
		charhealth = in;
	}

	public int getCharhealth() {
		return charhealth;
	}

	public void setWeapon(String in) {
		weapon = in;
	}

	public String getWeapon() {
		return weapon;
	}

	// adds a string to the string var weapon for later if else checks
	public void setWeapon() {

		String weapon;

		if (getCharclass() == "Warrior") {
			weapon = "Axe";
			setWeapon(weapon);
		}

		else if (getCharclass() == "Rogue") {
			weapon = "Dagger";
			setWeapon(weapon);
		}

		else if (getCharclass() == "Wizard") {
			weapon = "Dagger";
			setWeapon(weapon);
		}

		else {
			System.out.println(StringBank.error);
		}
	}
	// end of add weapon

	// roll the dice to see if you hit!
	public int useWeapon(String weapon) {
		int result = 0;

		if (getWeapon() == "Axe") {
			result = (int) ((Math.random() * 8) + 1);
		}

		else if (getWeapon() == "Dagger") {
			result = (int) ((Math.random() * 6) + (Math.random() * 3));
		}

		else if (getWeapon() == "Staff") {
			result = (int) ((Math.random() * 6) + 3);
		}

		else if (getWeapon() == "Hand") {
			result = (int) ((Math.random() * 3) + 1);
		}

		else {
			System.out.println(StringBank.error);
		}
		return result;
	}
	// end of useWeapon
}
