package com.tete.domain;

import java.util.Set;

public class RemainingDeck extends Deck {

    private final Set<Card> cards;

    public RemainingDeck(final Set<Card> cards) {
        this.cards = cards;

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
        return cards.contains(card);
    }

    @Override
    public Integer size() {
        return cards.size();
    }
}
