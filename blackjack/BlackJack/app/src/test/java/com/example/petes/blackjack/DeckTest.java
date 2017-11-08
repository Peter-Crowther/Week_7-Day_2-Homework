package com.example.petes.blackjack;

import com.example.petes.blackjack.card.Card;
import com.example.petes.blackjack.card.Deck;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


/**
 * Created by petes on 07/11/2017.
 */

public class DeckTest {

    @Test
    public void testSetup() {
        Deck deck = new Deck();
        deck.setup();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void testGetNextCard() {
        Deck deck = new Deck();
        deck.setup();
        Card card = deck.nextCard();
        //because card does not have any methods to expose rank or suit
        //I could potentially just assert that it is not null
        //This may change as my code evolves.
        assertNotNull(card);

    }
}
