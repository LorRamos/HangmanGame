public class HangmanController {
	private HangmanWording wording;
	public HangmanController (HangmanWording w) 
		{wording = w;}
	public void gameWord() {
		wording.word();
		wording.getWordLength();
	}
	public void gameProcessing() {
		wording.characterChosen();
		wording.winGame();
		wording.charactersString();
		wording.guessesLength();
		wording.countMistakes();
		if (wording.mistakes < 6 && wording.sum != (wording.wordLength * (wording.wordLength-1))/2)   //introducing sum of indices
			{this.gameProcessing();}
	}
}