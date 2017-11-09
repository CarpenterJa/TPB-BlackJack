import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	protected String name;
	protected int value;

	public Deck(String n, int v) {
		name = n;
		value = v;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	static ArrayList<Deck> deck = new ArrayList<Deck>();

	public static void addDeck() {

		deck.add(new Deck("Aces of Spades", 1));
		deck.add(new Deck("Two of Spades", 2));
		deck.add(new Deck("Three of Spades", 3));
		deck.add(new Deck("Four of Spades", 4));
		deck.add(new Deck("Five of Spades", 5));
		deck.add(new Deck("Six of Spades", 6));
		deck.add(new Deck("Seven of Spades", 7));
		deck.add(new Deck("Eight of Spades", 8));
		deck.add(new Deck("Nine of Spades", 9));
		deck.add(new Deck("Ten of Spades", 10));
		deck.add(new Deck("Jack of Spades", 10));
		deck.add(new Deck("Queen of Spades", 10));
		deck.add(new Deck("King of Spades", 10));
		deck.add(new Deck("Aces of Hearts", 1));
		deck.add(new Deck("Two of Hearts", 2));
		deck.add(new Deck("Three of Hearts", 3));
		deck.add(new Deck("Four of Hearts", 4));
		deck.add(new Deck("Five of Hearts", 5));
		deck.add(new Deck("Six of Hearts", 6));
		deck.add(new Deck("Seven of Hearts", 7));
		deck.add(new Deck("Eight of Hearts", 8));
		deck.add(new Deck("Nine of Hearts", 9));
		deck.add(new Deck("Ten of Hearts", 10));
		deck.add(new Deck("Jack of Hearts", 10));
		deck.add(new Deck("Queen of Hearts", 10));
		deck.add(new Deck("King of Hearts", 10));
		deck.add(new Deck("Aces of Clubs", 1));
		deck.add(new Deck("Two of Clubs", 2));
		deck.add(new Deck("Three of Clubs", 3));
		deck.add(new Deck("Four of Clubs", 4));
		deck.add(new Deck("Five of Clubs", 5));
		deck.add(new Deck("Six of Clubs", 6));
		deck.add(new Deck("Seven of Clubs", 7));
		deck.add(new Deck("Eight of Clubs", 8));
		deck.add(new Deck("Nine of Clubs", 9));
		deck.add(new Deck("Ten of Clubs", 10));
		deck.add(new Deck("Jack of Clubs", 10));
		deck.add(new Deck("Queen of Clubs", 10));
		deck.add(new Deck("King of Clubs", 10));
		deck.add(new Deck("Aces of Diamonds", 1));
		deck.add(new Deck("Two of Diamonds", 2));
		deck.add(new Deck("Three of Diamonds", 3));
		deck.add(new Deck("Four of Diamonds", 4));
		deck.add(new Deck("Five of Diamonds", 5));
		deck.add(new Deck("Six of Diamonds", 6));
		deck.add(new Deck("Seven of Diamonds", 7));
		deck.add(new Deck("Eight of Diamonds", 8));
		deck.add(new Deck("Nine of Diamonds", 9));
		deck.add(new Deck("Ten of Diamonds", 10));
		deck.add(new Deck("Jack of Diamonds", 10));
		deck.add(new Deck("Queen of Diamonds", 10));
		deck.add(new Deck("King of Diamonds", 10));

	}

	public static void Shuffle() {
		Collections.shuffle(deck);
	}

	
}
