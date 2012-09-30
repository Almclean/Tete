package com.tete.gameplay;

import com.tete.domain.Card;
import com.tete.domain.Player;
import com.tete.domain.Suit;
import com.tete.domain.Value;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameplayTest {

    Player p1;
    Player p2;
    Player p3;

    Set<Player> players;

    Game newGame;

    @Before
    public void setupData() {
        p1 = new Player("Alistair");
        p2 = new Player("Fritzy");
        p3 = new Player("Olly");

        players = new HashSet<>();
        players.addAll(Arrays.asList(p1, p2, p3));

        newGame = new Game(TeteRules.STANDARD, players);
        newGame.deal();
    }

    @Test
    public void dealTest() {

        for (Player p : newGame.getPlayers()) {
            assertThat(p.getHiddenCards().size(), is(3));
            assertThat(p.getFaceCards().size(), is(3));
            assertThat(p.getHandCards().size(), is(3));
        }

        assertThat(newGame.getBurnDeck().size(), is(0));
        assertThat(newGame.getRemainingDeck().size(), is(52 - (newGame.getPlayers().size() * (3 * newGame.getPlayers().size()))));
    }

    @Test
    public void checkCardsCanBeComparedProperly() {
        Card fourOfClubs = new Card(Suit.CLUB, Value.FOUR);
        Card fourOfDiamonds = new Card(Suit.DIAMOND, Value.FOUR);
        Card aceOfSpades = new Card(Suit.SPADE, Value.ACE);
        Card fiveOfHearts = new Card(Suit.HEART, Value.FIVE);

        assertThat(fourOfClubs.compareTo(fiveOfHearts), is(-1));
        assertThat(fiveOfHearts.compareTo(fourOfClubs), is(1));
        assertThat(fourOfClubs.compareTo(fourOfClubs), is(0));
        assertThat(fourOfClubs.compareTo(fourOfDiamonds), is(0));
        assertThat(aceOfSpades.compareTo(fiveOfHearts), is(1));
    }
}
