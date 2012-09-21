package com.tete.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
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

    public void addHiddenCard(final Card card) {
        // TODO - Add validation logic here.
        this.hiddenCards.add(card);
    }

    public void clearAndSetHiddenCards(List<Card> hiddenCards) {
        this.faceCards.clear();
        this.hiddenCards.addAll(hiddenCards);
    }

    public Set<Card> getFaceCards() {
        return faceCards;
    }

    public void clearAndSetFaceCards(List<Card> faceCards) {
        this.faceCards.clear();
        this.faceCards.addAll(faceCards);
    }

    public void addFaceCard(final Card card) {
        this.faceCards.add(card);
    }

    public Set<Card> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<Card> handCards) {
        this.handCards.addAll(handCards);
    }

    public void addHandCard(final Card card) {
        // TODO - Add validation logic here.
        this.handCards.add(card);
    }

    private Card getRandomCard() {
        Random prng = new Random(System.nanoTime());
        return (new Card(Suit.values()[prng.nextInt(Suit.suitArrayLength)],
                Value.values()[prng.nextInt(Value.valueArrayLength)],
                new DeckAction()));
    }

    public void addRandomFaceCard() {
        this.faceCards.add(getRandomCard());
    }

    public void addRandomHandCard() {
        this.handCards.add(getRandomCard());
    }

    public void addRandomHiddenCard() {
        this.hiddenCards.add(getRandomCard());
    }
}
