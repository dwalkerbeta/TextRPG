
public class Actions {
	
	//adds a string to the string var weapon for later if else checks
	public static void addWeapon() {
		if (Character.charclass == "Warrior") {
			Character.weapon = "Axe";
		}
		 
		else if (Character.charclass == "Rogue") {
			Character.weapon = "Dagger";
		}
		
		else if (Character.charclass == "Wizard") {
			Character.weapon = "Staff";
		}
	}
	// end of add weapon
}
