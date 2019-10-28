package SimpleCardGame;

public class Card {

    private String suits = null;
    private String ranks = null;

    public Card(){}

    public Card(String suits, String ranks) {
        this.suits = suits;
        this.ranks = ranks;
    }

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
    }
}
