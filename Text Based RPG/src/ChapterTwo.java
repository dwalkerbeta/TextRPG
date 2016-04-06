import java.util.Scanner;

public class ChapterTwo {

	private static ChapterTwo chaptertwo = new ChapterTwo();

	private ChapterTwo() {

	}

	public static ChapterTwo getInstance() {
		return chaptertwo;
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
		ChoiceBank cb = ChoiceBank.getInstance();
		
		
		// chapter two beginning
		
		System.out.println("Having cleard the forest, you see a small village in the valley below. You walk for some time until you are closer to the village. The door looks inviting, but you could also skirt around the edges. What do you do? (door/sneak)\n");
		do { 
			check = stringin.nextLine().toLowerCase();
			
			if (check.equals("door")) {
				flag = 1;
				System.out.println("You knock on the door with your fist. A manly voice answers and says \"Who goes there?\" How do you respond? (friend/foe)\n");
				cb.chaptertwodoor = 1;
				break;
			}
			
			else if (check.equals("sneak")) {
				flag = 1;
				System.out.println("As you sneak around the village you can see two guards on the ramparts. They do not see you. What do you wish to do? (enter/talk)\n");
				cb.chaptertwosneak = 1;
				break;
			}

			else {
				System.out.println(StringBank.error);
			}
		} while (flag == 0);
		
		
	}

}
