package SimpleCardGame;

import java.util.ArrayList;

public class DeckofCard {


    public static void NewDeck(ArrayList<Card> deck) {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++) {
                Card card = new Card(suits[i], ranks[j]);
                deck.add(card);
            }
        }
        shuffle(deck);
    }

   private static void shuffle(ArrayList<Card> d){

        for (int j = 0; j < 52; j++){
            int rand = (int)(Math.random()*52);
            //swapping
            //String Suit_temp = d.get(rand).getSuits();
            //String Rank_temp = d.get(rand).getRanks();
            Card cardtemp = d.get(rand);
            d.set(rand,d.get(j));
            d.set(j, cardtemp);
        }
    }
}
