package com.tete.domain;

import java.util.HashSet;
import java.util.Set;

public abstract class Deck {

    public enum Suit {
        SPADE("S"),
        CLUB("C"),
        DIAMOND("D"),
        HEART("H");

        private final String suit;

        Suit(String suit) {
            this.suit = suit;
        }

        @Override
        public String toString() {
            return this.suit;
        }
    }

    public static HashSet<Card> emptyDeck() {
        return new HashSet<Card>();
    }

    abstract public void addCard(final Card card);

    abstract public void addCards(final Set<Card> cards);

    abstract public Boolean canAddCardToCurrentDeck(final Card card);

    abstract public Integer size();

}
