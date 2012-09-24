package com.tete.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class RemainingDeck implements Deck {

    private final List<Card> cards;

    public RemainingDeck() {
        cards = new ArrayList<>();

        for (Suit s : Suit.values()) {
            for (Value v : Value.values()) {
                cards.add(new Card(s, v));
            }
        }

        Collections.shuffle(cards);

    }

    public Card dealCard() {
        return this.cards.remove(0);
    }

    @Override
    public void addCard(final Card card) {
        this.cards.add(card);
    }

    @Override
    public void shuffleNewDeck() {

        List<Card> cardList = new ArrayList<>();
        Collections.shuffle(cardList);

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
