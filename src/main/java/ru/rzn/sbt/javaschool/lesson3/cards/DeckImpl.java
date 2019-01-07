package ru.rzn.sbt.javaschool.lesson3.cards;

public class DeckImpl implements Deck {
    private CardImpl[][] cards;

    public DeckImpl() {
        CardImpl.Suit[] suitsArray = CardImpl.Suit.values();
        CardImpl.Rank[] ranksArray = CardImpl.Rank.values();

        this.cards = new CardImpl[suitsArray.length][ranksArray.length];

        for (int i = 0; i < suitsArray.length; i++) {
            for (int j = 0; j < ranksArray.length; j++) {
                cards[i][j] = new CardImpl(suitsArray[i].getSuitID(), ranksArray[j].getStrength());
            }
        }
    }

    @Override
    public Card getCard(int suit, int rank) {
        return cards[suit][rank];
    }
}
