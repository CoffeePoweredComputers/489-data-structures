import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardGames {

    public static void shuffle(SinglyLinkedList<Card> deck){

        Random rand = new Random();

        return; // remove when you implement this method
    }

    public static void guessHigherOrLower(SinglyLinkedList<Card> deck){

        Scanner sc = new Scanner(System.in);
        int score = 0;
        Card card = deck.removeFromEnd().data;
        System.out.println("Your first card is: " + card + ". Let the game begin!\n\n");

        while(true){
            break; // remove when you implement this loop
        }

        return; //remove when you implement this method

    }

    public static void main(String[] args){

        /* Step 1: Start the selection process */
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--Guess Higher Or Lower: A Card Game--\n" +
                "This is a simple card game. In a given move you can\n" +
                "choose to shuffle the deck or select a card. If you select a card\n" +
                "it will be selected from the top of the deck and compared to the\n" +
                "previously selected card. If the user guessed that the card is low\n" +
                "and the card has a lower value or if you guessed high and the card\n" +
                "had a higher value then your score will be incremented. If you do not\n" +
                "then the game will end and your final score is reported.\n");

        while(true){

            /* Step 2: Build and fill the deck */
            SinglyLinkedList<Card> deck = new SinglyLinkedList<>();

            /*Step 3: Shuffle the deck and start the game */

            /*Step 4: Ask the user if they want to quit or continue */
        }


    }

}
