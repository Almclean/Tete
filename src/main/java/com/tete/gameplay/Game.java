package com.tete.gameplay;

import com.tete.domain.BurnDeck;
import com.tete.domain.Deck;
import com.tete.domain.Player;
import com.tete.domain.RemainingDeck;

import java.util.Set;

public class Game {
    private final TeteRules rules;
    private final Set<Player> players;
    private Deck burnDeck;
    private Deck remainingDeck;

    public Game(TeteRules rules, Set<Player> players) {
        this.rules = rules;
        this.players = players;
        burnDeck = new BurnDeck();
        remainingDeck = new RemainingDeck();
    }

    public void deal() {
        // TODO - Implement deal logic.
        for (Player p : players) {
            for (int i = 0; i < 3; ++i) {
                p.addRandomFaceCard();
                p.addRandomHandCard();
                p.addRandomHiddenCard();
            }
        }
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public Deck getBurnDeck() {
        return burnDeck;
    }

    public Deck getRemainingDeck() {
        return remainingDeck;
    }
}
