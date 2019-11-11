package SimpleCardGame;

enum CardSuit {

    Clubs(0),
    Diamonds(1),
    Hearts(2),
    Spades(3);

    private final int vSuit;
    public int getvSuit() {
        return vSuit;
    }
    CardSuit (int vSuit){
        this.vSuit = vSuit;
    }
}
enum CardRank {
    Ace(0),
    Twe(1),
    Three(2),
    Four(3),
    Five(4),
    Six(5),
    Seven(6),
    Eight(7),
    Nine(8),
    Ten(9),
    Jack(10),
    Queen(11),
    King(12);

    private final int vRank;
    public int getvRank() {
        return vRank;
    }
    CardRank (int vRank){
        this.vRank = vRank;
    }
}


public class Card {
    private CardSuit suit = null;
    private CardRank rank = null;

    public Card(){};

    public Card(CardSuit suit, CardRank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public CardRank getRank() {
        return rank;
    }

}
