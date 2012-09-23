package com.tete.domain;

import java.util.Set;

public interface Deck {

    public void addCard(final Card card);

    public void shuffleNewDeck();

    public void addCards(final Set<Card> cards);

    public Boolean canAddCardToCurrentDeck(final Card card);

    public Integer size();

}
