package com.tete.domain;

public class Card {

    private final Value value;
    private final DeckAction action;

    public Card ( final Value value, final DeckAction action ) {
        this.value = value;
        this.action = action;
    }

    public Value getValue() {
        return value;
    }

    public DeckAction getAction() {
        return action;
    }
}
