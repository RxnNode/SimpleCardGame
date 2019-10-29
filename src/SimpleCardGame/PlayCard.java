package SimpleCardGame;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PlayCard extends DeckofCard {

    public static void GameInitialize(){
        Scanner input;
        String command;
        int playNum = 0;

        //Make a new deck of card
        ArrayList<Card> Deck = new ArrayList<>();
        NewDeck(Deck);

        //Welcome message
        System.out.println("Welcome to Simple Card Game!");

        //Get quantity of players
        while (true){
            System.out.print("Players:");
            input = new Scanner(System.in);
            try{
                command = input.nextLine();
            } catch (NoSuchElementException e){
                System.err.println();
                break;
            }
            if (!input.hasNextInt()){
                System.err.println("Please enter number only!");
            }else if (command.isEmpty()){
                System.err.println("Please enter number of players.");
            }
        }

    }
}
