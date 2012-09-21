package com.tete.domain;

public enum Suit {
    SPADE("S"),
    CLUB("C"),
    DIAMOND("D"),
    HEART("H");

    public static int suitArrayLength = Suit.values().length;

    private final String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.suit;
    }
}