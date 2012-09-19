package com.tete.domain;

import java.util.Set;

public class BurnDeck extends Deck {

    private final Set<Card> cards;
    private Value currentMax;

    public BurnDeck(final Set<Card> cards) {
        this.cards = cards;
        this.currentMax = Value.ACE;
    }

    @Override
    public void addCard(final Card card) {
        this.cards.add(card);
    }

    @Override
    public void addCards(final Set<Card> cards) {
        this.cards.addAll(cards);
    }

    @Override
    public Boolean canAddCardToCurrentDeck(final Card card) {
        return card.getValue().compareTo(currentMax) <= 0;
    }

    @Override
    public Integer size() {
        return cards.size();
    }
}
