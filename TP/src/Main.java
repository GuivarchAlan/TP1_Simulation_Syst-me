public class Main {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("need a number of try in argument");
        }
        // initialise the counter of victory, the counter for the money earn by the player, number of try and the possible seed for the Random attribute for the dealer
        int victoryCount = 0;
        int moneyEarn = 0;
        int numberOfTry = Integer.parseInt(args[0]);
        boolean shuffle = false;
        if (args[1].startsWith("t")) {
            shuffle = true;
        }
        Long seed = null;
        if (args.length > 2) {
            seed = Long.parseLong(args[2]);
        }
        Dealer dealer = new Dealer(seed, shuffle);

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
