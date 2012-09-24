package com.tete.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BurnDeck implements Deck {

    private final List<Card> cards;
    private Value currentMax;

    public BurnDeck() {
        this.cards = new ArrayList<>();
    }

    @Override
    public void addCard(final Card card) {
        this.cards.add(card);
    }

    @Override
    public void shuffleNewDeck() {
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

    @Override
    public Card dealCard() {
        return this.cards.remove(0);
    }
}
