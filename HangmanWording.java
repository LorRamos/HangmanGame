import javax.swing.*;
public class HangmanWording {
	String word;
	char character;
	int wordLength;
	int mistakes;
	int sum;
	int lettersChosenNum;
	String chosenLetters = "";
	public String word() {
		String input = JOptionPane.showInputDialog("Write the word: ");
		if (input.length() > 9) {
			JOptionPane.showMessageDialog(null, "Long word, please choose a shorter one");
			this.word();
		}
		else if (input.length() == 0){
			JOptionPane.showMessageDialog(null, "Please, write a word");
			this.word();
		}
		else if (input.length() < 3 && input.length() > 0) {
			JOptionPane.showMessageDialog(null, "Short word, please choose a longer one");
			this.word();
		}
		else  
			{word = input.toUpperCase();}
		return word;
	}
	
	public int getWordLength() {
		wordLength = word.length();
		return wordLength;
	}
	
	public int winGame() {
		for (int i = 0 ; i < wordLength ; i++ ) {
			if (character == word.charAt(i)) 
				{sum = sum + i;}
		}
		return sum;
	}
	
	public char characterChosen() {
		String charac = JOptionPane.showInputDialog("Pick a letter: ");
		if (charac.length()>1) 
			{JOptionPane.showMessageDialog(null, "Please, write a single letter (the first letter of the typed word was chosen as character)");}
		character = charac.toUpperCase().charAt(0);
		for (int i = 0; i < chosenLetters.length() ; i++) {
			if (character == chosenLetters.charAt(i)) {
				JOptionPane.showMessageDialog(null, "This letter has already been chosen. Please choose another letter");
				this.characterChosen();	
			}
		}
		return character;
	}
	
	public String charactersString() {
		chosenLetters = chosenLetters +""+ character;
		return chosenLetters;
	}
	
	public int countMistakes() {
			if ((word.indexOf(character, 0)) == -1) 
				{mistakes = mistakes + 1;}
		return mistakes;
	}
	
	public int guessesLength() {
		lettersChosenNum = chosenLetters.length();
		return lettersChosenNum;
	}
}
