public class Main {

    public static void main(String[] args) {

        int victoryCount = 0;
        int moneyEarn = 0;
        int numberOfTry = 1000000;

        Dealer dealer = new Dealer();

        // Test Game One
        for (int i = 0; i < numberOfTry; i++) {
            int result = dealer.GameOne();
            if (result >= 0) {
                victoryCount ++;
            }
            moneyEarn += result;
        }
        System.out.println("number of victory with the Game one : " + victoryCount + " / " + numberOfTry + " or " + (float) victoryCount/numberOfTry * 100 + " %");
        System.out.println("money earn with the Game one : " + moneyEarn);

        // Test Game Two
        dealer.resetDeck();
        victoryCount = 0;
        moneyEarn = 0;

        for (int i = 0; i < numberOfTry; i++) {
            int result = dealer.GameTwo();
            if (result >= 0) {
                victoryCount ++;
            }
            moneyEarn += result;
        }
        System.out.println("number of victory with the Game two : " + victoryCount + " / " + numberOfTry + " or " + (float) victoryCount/numberOfTry * 100 + " %");
        System.out.println("money earn with the Game two : " + moneyEarn);

        // Test Game Three
        dealer.resetDeck();
        victoryCount = 0;
        moneyEarn = 0;

        for (int i = 0; i < numberOfTry; i++) {
            int result = dealer.GameThree();
            if (result >= 0) {
                victoryCount ++;
            }
            moneyEarn += result;
            dealer.resetDeck();
        }
        System.out.println("number of victory with the Game three : " + victoryCount + " / " + numberOfTry + " or " + (float) victoryCount/numberOfTry * 100 + " %");
        System.out.println("money earn with the Game three : " + moneyEarn);

        // Test Game Four
        dealer.resetDeck();
        victoryCount = 0;
        moneyEarn = 0;

        for (int i = 0; i < numberOfTry; i++) {
            int result = dealer.GameFour();
            if (result >= 0) {
                victoryCount ++;
            }
            moneyEarn += result;
            dealer.resetDeck();
        }
        System.out.println("number of victory with the Game four : " + victoryCount + " / " + numberOfTry + " or " + (float) victoryCount/numberOfTry * 100 + " %");
        System.out.println("money earn with the Game four : " + moneyEarn);

        // Test Game Five
        dealer.resetDeck();
        victoryCount = 0;
        moneyEarn = 0;

        for (int i = 0; i < numberOfTry; i++) {
            int result = dealer.GameFive();
            if (result >= 0) {
                victoryCount ++;
            }
            moneyEarn += result;
            dealer.resetDeck();
        }
        System.out.println("number of victory with the Game five : " + victoryCount + " / " + numberOfTry + " or " + (float) victoryCount/numberOfTry * 100 + " %");
        System.out.println("money earn with the Game five : " + moneyEarn);


    }
}
