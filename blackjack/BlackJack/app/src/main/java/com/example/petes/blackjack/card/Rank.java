package com.example.petes.blackjack.card;

/**
 * Created by petes on 07/11/2017.
 */

public enum Rank {

    ACE(11),
    KING(10),
    QUEEN(10),
    JACK(10),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);



    private int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }






}
