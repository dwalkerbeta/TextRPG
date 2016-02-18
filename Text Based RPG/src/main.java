import java.util.*;

public class main {

	public static void main(String[] args) {

		// get all the singletons of the chapters
		ChoiceBank cb = ChoiceBank.getInstance();
		ChapterZero chapterzero = ChapterZero.getInstance();
		ChapterOne chapterone = ChapterOne.getInstance();
		ChapterOneRightPath corp = ChapterOneRightPath.getInstance();
		ChapterOneLeftPath colp = ChapterOneLeftPath.getInstance();

		// do the main methods of initialized chapters
		chapterzero.main(args);

		chapterone.main(args);

		if (cb.chapteroneleft == 1) {
			colp.main(args);
		}

		else if (cb.chapteroneright == 1) {
			corp.main(args);
		}

	} // end of public static void main DON'T GO OVER THIS
} // end of class ALSO DON'T GO OVER THIS
