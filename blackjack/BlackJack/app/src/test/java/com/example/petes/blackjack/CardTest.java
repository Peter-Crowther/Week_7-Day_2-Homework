package com.example.petes.blackjack;

import com.example.petes.blackjack.card.*;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by petes on 07/11/2017.
 */

public class CardTest {

    @Test
    public void hasValue() {
        Card card = new Card(Suit.CLUBS, Rank.EIGHT);
        int actual = card.getValue();
        assertEquals(8, actual);
    }

}
