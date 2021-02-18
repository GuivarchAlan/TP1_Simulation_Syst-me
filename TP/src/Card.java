import java.util.Comparator;

public class Card {
    private Constant.cardSuit suit;
    private int rank;

    Card(Constant.cardSuit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public Constant.cardSuit getSuit() {
        return suit;
    }

    public void showCard() {
        if (rank == 1) {
            System.out.println("Ace of " + suit);
        }
        else if (rank == 11) {
            System.out.println("Jack of " + suit);
        }
        else if (rank == 12) {
            System.out.println("Queen of " + suit);
        }
        else if (rank == 13) {
            System.out.println("King of " + suit);
        }
        else {
            System.out.println(rank + " of " + suit);
        }
    }
}
