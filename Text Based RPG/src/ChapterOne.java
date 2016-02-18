import java.util.Scanner;

public class ChapterOne {

	private static ChapterOne chapterone = new ChapterOne();

	private ChapterOne() {

	}

	public static ChapterOne getInstance() {
		return chapterone;
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

		// choice 1.1
		System.out.println("Having taken your weapon you set off exploring. After some time you come across a fork in the road. The right path looks sunny and the left path leads further into the forest. Which path do you follow? (right/left)\n");
		do {
			check = stringin.nextLine().toLowerCase();

			if (check.equals("right")) {
				System.out.println("You are heading down the right path when suddenly a goblin jumps out in front of you! At this point you have some choices. You can either attempt to talk to the goblin and appeal to its feral nature, or you can attack with a guarunteed initiative. What do you do? (talk/attack)\n");
				flag = 1;
				cb.chapteroneright = 1;
				break;
			}

			else if (check.equals("left")) {
				System.out.println("Headed further into the forest you hear a rustling sound to your right. You may either continue walking or search for the source. (walk/search)\n");
				flag = 1;
				cb.chapteroneleft = 1;
				break;
			}

			else {
				System.out.println(StringBank.error);
			}
		} while (flag == 0);
	}
}
