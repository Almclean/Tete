package com.tete.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Card {

    private final Value value;
    private final DeckAction action;
    private final Suit suit;

    public Card(final Suit suit, final Value value, final DeckAction action) {
        this.value = value;
        this.suit = suit;
        this.action = action;
    }

    public Value getValue() {
        return value;
    }

    public DeckAction getAction() {
        return action;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(value)
                .append(action)
                .append(suit)
                .toHashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Card)) {
            return false;
        }

        final Card rhs = (Card) object;
        return new EqualsBuilder()
                .append(this.action, rhs.action)
                .append(this.suit, rhs.suit)
                .append(this.value, rhs.value)
                .isEquals();
    }
}
