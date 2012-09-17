package com.tete.gameplay;

import com.tete.domain.Player;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameplayTest {

    @Test
    public void highLevelApiTest() {

        Player p1 = new Player("Alistair");
        Player p2 = new Player("Olly");
        Player p3 = new Player("Fritzy");

        Set<Player> players = new HashSet<Player>();
        players.add(p1);
        players.add(p2);
        players.add(p3);

        Game newGame = new Game(TeteRules.STANDARD, players);
        newGame.deal();

        int cardAccumulator = 0;
        for (Player p : newGame.getPlayers()) {
            assertThat(p.getHiddenCards().size(), is(3));
            assertThat(p.getFaceCards().size(), is(3));
            assertThat(p.getHandCards().size(), is(3));
            cardAccumulator += 9;
        }

        assertThat(newGame.getBurnDeck().size(), is(0));
        assertThat(newGame.getRemainingDeck().size(), is(50 - (newGame.getPlayers().size() * 9)));
    }
}
