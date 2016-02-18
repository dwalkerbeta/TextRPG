
public class ChoiceBank {

	private static ChoiceBank cb = new ChoiceBank();

	private ChoiceBank() {

	}

	public static ChoiceBank getInstance() {
		return cb;
	}

	public int chapteroneright = 0;
	public int chapteroneleft = 0;

}
