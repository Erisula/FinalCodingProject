package war;
import java.util.ArrayList;
import java.util.List;
public class Player {
	private List<Card> hand; // List for the player's hand
	private int score; // the Player's current score
	private String name; //the Player's name
	//Constructor time
	public Player(String name) {
		this.name=name;
		hand = new ArrayList<>();
		score = 0;
	}
	//Time for methods
	//Describing the player's hand
	public void describe() {
		System.out.println(name + "'s hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
	//Drawing a card from the deck
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	//Flip the top card from the player's hand
	public Card flip() {
		return hand.remove(0);
	}
	//Adding player's score
	public void incrementScore() {
		score++;
	}
	//Getters
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	
	}