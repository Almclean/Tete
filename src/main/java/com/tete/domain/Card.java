package com.tete.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Card implements Comparable<Card> {

    private final Value value;
    private final Suit suit;

    public Card(final Suit suit, final Value value) {
        this.value = value;
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(value)
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
                .append(this.suit, rhs.suit)
                .append(this.value, rhs.value)
                .isEquals();
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.value.getValue(), o.value.getValue());
    }
}
