package war;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck (); //Creation of a new deck
		deck.shuffle(); //shuffles the deck
		//Creation of players
		Player player1 = new Player("Jennifer");
		Player player2 = new Player("Jacob");
		//Deal cards to the players
		for (int i = 0; i<52; i++) {
			if (i % 2 == 0) {
			player1.draw(deck);
		}else {
			player2.draw(deck);
		}
		}
	//Playing the game
	for (int i = 0; i<26; i++) {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		System.out.println(player1.getName() + " flips " + card1.getName());
		System.out.println(player2.getName() + " flips " + card2.getName());
		if (card1.getValue()>card2.getValue()) {
			player1.incrementScore();
			System.out.println(player1.getName() + " wins the round.");
		}else if (card2.getValue() > card1.getValue()) {
			player2.incrementScore();
			System.out.println(player2.getName() + " wins the round.");
		}else {
			System.out.println("Round is a tie.");
		}
		}
	//Displaying the results
	System.out.println("Final score: " + player1.getName() + " " + player1.getScore() + "," + player2.getName() + " " + player2.getScore());
	if (player1.getScore() > player2.getScore()) {
		System.out.println(player1.getName() + " wins the game!");
	}else if (player2.getScore() > player1.getScore()) {
		System.out.println(player2.getName() + " wins the game!");
	}else {
		System.out.println("The game is a draw");
		
	}
	}
}
