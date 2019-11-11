package SimpleCardGame;

import java.util.*;

public class PlayCard extends DeckofCard {

    public static void GameInitialize(){
        Scanner input;
        String command = "";
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
            if (!input.hasNextInt()){
                System.err.println("Please enter number only!");
            }
            try{
                command = input.nextLine();
                if (command.isEmpty()){
                    System.err.println("Please enter number of players.");
                }
            } catch (NoSuchElementException e){
                System.err.println();
                break;
            }

            System.out.println(command +" players join the game!");
            playNum = Integer.valueOf(command);
            break;
        }

        //Who win
        //int[] randCard = new int[playNum];
        //ArrayList<Integer> randCard = new ArrayList<Integer>();
        System.out.println("Rule : ♠ > ♥ > ♦ > ♣");
        for (int i = 0; i < playNum; ++i){
            System.out.println("Player No." + (i+1) +", your card :"+ Deck.get(i).getSuits() + ", "+ Deck.get(i).getRanks());
            Card bigestcard = new Card();

        }
    }
}
