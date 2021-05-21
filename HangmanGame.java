public class HangmanGame {
	public static void main(String[] args) {
		HangmanWording w = new HangmanWording();
		HangmanController c = new HangmanController(w);
		c.gameWord();
		new HangmanDrawing(400,400,w);
		c.gameProcessing();
	}
}

//Hangman game is played often with numbers and special symbols (ASCII usually)
//If someone wants to play it only with alphabetical letters, then we declare a string like this: String alphabet = "abcdefghijklmnopqrstuvxwyz";
//Now, we write these lines of code at method word() in an appropriate place:
//     for (int i = 0; i < wordLength; i++){
//          for (int j = 0; j < alphabet.length(); j++){
//                 if (word.charAt(i) != alphabet.charAt(j){
//                     ...
//In the same manner we can handle the situation in the section of method characterChosen().
