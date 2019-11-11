package SimpleCardGame;

import java.util.*;

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
        System.out.println("Rule : ♠ > ♥ > ♦ > ♣");

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
        /*
        for (int i = 0; i < 52; ++i){
            System.out.println(Deck.get(i).getSuit()+" "+Deck.get(i).getRank());
        }
         */

        //Who win

        int biggest = 0;
        for (int i = 0; i < playNum; ++i){
            System.out.println("Player No." + (i+1) +", your card :"+ Deck.get(i).getSuit() + ", "+ Deck.get(i).getRank());

            if (Deck.get(i).getSuit().getvSuit() > Deck.get(biggest).getSuit().getvSuit()){
                biggest = i;
                //System.err.println("Now biggest: "+Deck.get(biggest).getSuit()+" "+Deck.get(biggest).getRank());
            }else if (Deck.get(i).getSuit().getvSuit() == Deck.get(biggest).getSuit().getvSuit()){
                if (Deck.get(i).getRank().getvRank() > Deck.get(biggest).getRank().getvRank()) biggest = i;
                //System.err.println("Now biggest: "+Deck.get(biggest).getSuit()+" "+Deck.get(biggest).getRank());
            }

        }
        System.out.println("Player No."+ (biggest+1) +" win!!");
    }
}
