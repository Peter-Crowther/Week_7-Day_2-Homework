package com.example.petes.blackjack.card;


import com.example.petes.blackjack.card.Rank;
import com.example.petes.blackjack.card.Suit;

/**
 * Created by petes on 07/11/2017.
 */

public class Card {

    Suit suit;
    Rank rank;

    public Card( Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }



    public int getValue() {
        return rank.getValue();
    }


}
