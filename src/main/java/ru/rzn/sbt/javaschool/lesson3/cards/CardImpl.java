package ru.rzn.sbt.javaschool.lesson3.cards;

public class CardImpl implements Card {
    private int suit;
    private int rank;

    enum Suit {
        DIAMONDS(0, "бубны"),
        CLUBS(1, "трефы"),
        HEARTS(2, "червы"),
        SPADES(3, "пики");

        private int suitID;
        private String suitName;

        Suit(int suitID, String suitName) {
            this.suitID = suitID;
            this.suitName = suitName;
        }

        public int getSuitID() {
            return suitID;
        }
    }

    enum Rank {
        ACE(0, "туз"),
        SIX(1, "шестёрка"),
        SEVEN(2, "семёрка"),
        EIGHT(3, "восьмёрка"),
        NINE(4, "девятка"),
        TEN(5, "десятка"),
        JACK(6, "валет"),
        QUEEN(7, "дама"),
        KING(8, "король");

        private int strength;
        private String rankName;

        Rank(int strength, String rankName) {
            this.strength = strength;
            this.rankName = rankName;
        }

        public int getStrength() {
            return strength;
        }
    }

    public CardImpl(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        String suitName = "";
        String rankName = "";
        for (Suit suit : Suit.values()) {
            if (this.suit == suit.suitID) {
                suitName = suit.suitName;
            }
        }
        for (Rank rank : Rank.values()) {
            if (this.rank == rank.strength) {
                rankName = rank.rankName;
            }
        }

        return rankName + " " + suitName;
    }
}
