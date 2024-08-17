package war;

public class Card {
	private int value; // whatever the value of the card is
	private String name; // What's on the card, like Queen of Hearts
	
	//Constructor
	public Card(int value, String name) {
		this.value=value;
		this.name=name;
	}
	//Getters and Setters
	public int getValue() {
		return value; // getter to get the value
	}
	public void setValue (int value) {
		this.value=value; //setter to set that value
	}
	public String getName() {
		return name; //getter to get the name
	}
	public void setName (String name) {
		this.name=name; // setter to set the name
	}
	//Time for the Method so we can print card info
	public void describe() {
		System.out.println(name);
		
	}
	

}
