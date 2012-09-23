package com.tete.domain;

import java.util.HashSet;
import java.util.Set;

public class Player {

    private final String playerName;
    private final Set<Card> hiddenCards;
    private final Set<Card> faceCards;
    private final Set<Card> handCards;

    public Player(final String name) {
        this.playerName = name;
        this.hiddenCards = new HashSet<Card>();
        this.faceCards = new HashSet<Card>();
        this.handCards = new HashSet<Card>();
    }

    public Set<Card> getHiddenCards() {
        return hiddenCards;
    }


    public Set<Card> getFaceCards() {
        return faceCards;
    }

    public Set<Card> getHandCards() {
        return handCards;
    }

    public void addRandomFaceCard(final Card card) {
        this.faceCards.add(card);
    }

    public void addRandomHandCard(final Card card) {
        this.handCards.add(card);
    }

    public void addRandomHiddenCard(final Card card) {
        this.hiddenCards.add(card);
    }
}
