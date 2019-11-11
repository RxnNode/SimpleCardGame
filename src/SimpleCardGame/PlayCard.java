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
            System.out.println("Player No." + (i+1) +", your card :"+ Deck.get(i).getSuits() + ", "+ Deck.get(i).getRanks());

            if (getvSuit(Deck.get(i))> getvSuit(Deck.get(biggest))){
                biggest = i;
                //System.err.println("Now biggest: "+Deck.get(biggest).getSuit()+" "+Deck.get(biggest).getRank());
            }else if (getvSuit(Deck.get(i)) == getvSuit(Deck.get(biggest))){
                if (getvRank(Deck.get(i))> getvRank(Deck.get(biggest))) biggest = i;
                //System.err.println("Now biggest: "+Deck.get(biggest).getSuit()+" "+Deck.get(biggest).getRank());
            }

        }
        System.out.println("Player No."+ (biggest+1) +" win!!");
    }

    public static int getvSuit(Card card){
        int card0s = 0;
        switch (card.getSuits()){
            case "Clube": card0s= 0;
                break;
            case "Diamonds": card0s= 1;
                break;
            case "Hearts": card0s= 2;
                break;
            case "Spades": card0s= 3;
                break;
        }
        return card0s;
    }
    public static int getvRank(Card card){
        int card0s = 0;
        switch (card.getSuits()){
            case "A": card0s= 0;
                break;
            case "2": card0s= 1;
                break;
            case "3": card0s= 2;
                break;
            case "4": card0s= 3;
                break;
            case "5": card0s= 4;
                break;
            case "6": card0s= 5;
                break;
            case "7": card0s= 6;
                break;
            case "8": card0s= 7;
                break;
            case "9": card0s= 8;
                break;
            case "10": card0s = 9;
                break;
            case "J": card0s= 10;
                break;
            case "Q": card0s= 11;
                break;
            case "K": card0s= 12;
                break;
        }
        return card0s;
    }
}
