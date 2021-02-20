import java.util.Comparator;

public class Card {
    // this class define a card with a suit and a rank
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

    // this function permit to print this card
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
/*number of victory with the Game one : 76815 / 1000000 or 7.6815 %
money earn with the Game one : -231850
number of victory with the Game two : 19277 / 1000000 or 1.9277 %
money earn with the Game two : -36150
number of victory with the Game three : 469801 / 1000000 or 46.980103 %
money earn with the Game three : -60398
number of victory with the Game four : 586455 / 1000000 or 58.6455 %
money earn with the Game four : -250173
number of victory with the Game five : 206861 / 1000000 or 20.6861 %
money earn with the Game five : 34305*/