package SimpleCardGame;

import java.util.ArrayList;

public class DeckofCard {


    public static void NewDeck(ArrayList<Card> deck) {
        for (CardSuit suit : CardSuit.values()){
            for (CardRank rank : CardRank.values()) {
                Card card = new Card(suit,rank);
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
