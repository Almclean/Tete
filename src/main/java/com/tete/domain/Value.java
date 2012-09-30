package com.tete.domain;

public enum Value {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    public static int valueArrayLength = Value.values().length;
    private final int value;

    public int getValue() {
        return this.value;
    }

    Value(int n) {
        this.value = n;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
