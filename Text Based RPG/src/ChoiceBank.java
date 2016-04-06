
public class ChoiceBank {

	private static ChoiceBank cb = new ChoiceBank();

	private ChoiceBank() {

	}

	public static ChoiceBank getInstance() {
		return cb;
	}

	// chapter one decisions
	public int chapteroneright = 0;
	public int chapteroneleft = 0;
	
	// chapter two decisions
	public int chaptertwodoor = 0;
	public int chaptertwosneak = 0;

}
