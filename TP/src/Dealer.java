import java.lang.reflect.Array;
import java.util.*;

public class Dealer {

    int numberOfCard;
    LinkedList<Card> deck;

    Dealer() {
        numberOfCard = 52;
        deck = new LinkedList<Card>();
        this.makeDeck();
    }

    private void makeDeck() {
        for(int i = 1; i < 14; i++) {
            deck.add(new Card(Constant.cardSuit.Clubs,i));
            deck.add(new Card(Constant.cardSuit.Diamonds,i));
            deck.add(new Card(Constant.cardSuit.Hearts,i));
            deck.add(new Card(Constant.cardSuit.Spades,i));
        }
        Collections.shuffle(deck);
    }

    public Card DrawCardFromDeckDealer(boolean handover)
    {
        Random rand = new Random();
        //Collections.shuffle(deck);

        int indexCard = rand.nextInt(numberOfCard);

        Card card = deck.get(indexCard);
        if (!handover) {
            deck.remove(indexCard);
            numberOfCard --;
        }
        return card;
    }

    public int GameOne() {
        int moneyEarn = -1;
        Collections.shuffle(deck);
        // draw one card and if it is an ace the player win ten dollars
        Card card = this.DrawCardFromDeckDealer(true);
        //show the card for debug
        //card1.showCard();
        if (card.getRank() == 1) {
            moneyEarn += 10;
        }
        return moneyEarn;
    }

    public int GameTwo() {
        int moneyEarn = -1;
        Collections.shuffle(deck);
        // draw two card (with handover) and if the player draw the same card he win fifty dollars
        Card card1 = this.DrawCardFromDeckDealer(true);
        Card card2 = this.DrawCardFromDeckDealer(true);
        //show the card for debug
        //card1.showCard();
        //card2.showCard();
        if (card1.getRank() == card2.getRank() && card1.getSuit() == card2.getSuit()) {
            moneyEarn += 50;
        }
        return moneyEarn;
    }

    public int GameThree() {
        int moneyEarn = -1;
        Collections.shuffle(deck);
        // draw two card if the rank of the second card is stricly greater than the fisrt card rank then the player earn two dollars
        Card card1 = this.DrawCardFromDeckDealer(false);
        Card card2 = this.DrawCardFromDeckDealer(false);

        //show the card for debug
        //card1.showCard();
        //card2.showCard();

        if (card2.getRank() > card1.getRank()) {
            moneyEarn += 2;
        }
        return moneyEarn;
    }

    public int GameFour() {
        int moneyEarn = -1;
        Collections.shuffle(deck);
        // draw three cards and for each card
        // if its suit is a heart add one dollar to moneyEarn
        for (int i = 0; i < 3; i++) {
            Card card = this.DrawCardFromDeckDealer(false);

            //show the card for debug
            //card.showCard();

            if (card.getSuit() == Constant.cardSuit.Hearts) {
                moneyEarn ++;
            }
        }
        return moneyEarn;
    }

    public int GameFive() {
        int moneyEarn = -1;
        Collections.shuffle(deck);
        ArrayList<Card> drawCard = new ArrayList<Card>();
        // draw five cards
        for (int i = 0; i < 5; i++) {
            drawCard.add(this.DrawCardFromDeckDealer(false));

            //show the card for debug
            //drawCard.get(i).showCard();
        }
        drawCard.sort(new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                return card1.getRank() < card2.getRank() ? -1 : 1;
            }
        });
        for (int i = 0; i < 3; i++) {
            int rankOne = drawCard.get(i).getRank();
            if(drawCard.get(i + 1).getRank() == rankOne + 1 && drawCard.get(i + 2).getRank() == rankOne + 2) {
                moneyEarn += 5;
                break;
            }
        }
        return moneyEarn;
    }

    public void resetDeck() {
        deck = new LinkedList<Card>();
        numberOfCard = 52;
        this.makeDeck();
    }
}
