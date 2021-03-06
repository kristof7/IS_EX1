package Zadanie1.ZadanieC;

import java.util.Scanner;

public class ExerciseC {

    public void gameC() throws Exception {

//--------------ZADANIE C---VERSION2-SCANNER-(UPDATED)---------------------

        //----Some Card objects------
        System.out.println("Example cards:");
        Card card1 = new Card();
        card1.setRanks(Ranks.ACE);
        card1.setSuits(Suits.SPADES);

        Card card2 = new Card();
        card2.setRanks(Ranks.KING);
        card2.setSuits(Suits.CLUBS);

        Card card3 = new Card();
        card3.setRanks(Ranks.QUEEN);
        card3.setSuits(Suits.HEARTS);

        Card card4 = new Card();
        card4.setRanks(Ranks.JACK);
        card4.setSuits(Suits.DIAMONDS);

        System.out.println(card1.getRanks() + " of " + card1.getSuits());
        System.out.println(card2.getRanks() + " of " + card1.getSuits());
        System.out.println(card3.getRanks() + " of " + card1.getSuits());
        System.out.println(card4.getRanks() + " of " + card1.getSuits());
        System.out.println("---------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        //----This class shows the combination of a rank with a suit by entering the corresponding numbers
        System.out.println("This application displays the combination of a rank with a suit by entering the corresponding numbers.");
        System.out.println("You will be asked to input two numbers, first is for rank, second for suit.");
        System.out.println("Choose Card's rank (1-ACE , 2-KING, 3-QUEEN, 4-JACK):");
        //----Here user input rank value in number----
        int rank = scanner.nextInt();
        if (rank > 4 || rank < 1) {
            System.out.println("The number you input is not valid, choose numbers only from 1 to 4.");
        }

        System.out.println("Choose Card's suit (1-CLUBS , 2-DIAMONDS, 3-HEARTS, 4-SPADES):");
        //----Here user input suit value in number----
        int suit = scanner.nextInt();
        if (suit > 4 || rank < 1) {
            System.out.println("The number you input is not valid, choose numbers only from 1 to 4.");
        }

        //----rank & suit are reduced by one to start counting from 1, not 0----
        rank = rank - 1;
        suit = suit - 1;

        Card.getDescription(rank, suit);

    }
}
