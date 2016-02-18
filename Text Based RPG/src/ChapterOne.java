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
		System.out.println(StringBank.str1_1);
		do {
			check = stringin.nextLine().toLowerCase();

			if (check.equals("right")) {
				System.out.println(StringBank.str1_1right);
				flag = 1;
				cb.chapteroneright = 1;
				break;
			}

			else if (check.equals("left")) {
				System.out.println(StringBank.str1_1left);
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
