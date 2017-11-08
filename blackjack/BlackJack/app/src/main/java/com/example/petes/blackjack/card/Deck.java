package com.example.petes.blackjack.card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by petes on 07/11/2017.
 */

public class Deck {



  private ArrayList<Card> cards;




    public void setup(){
        this.cards = new ArrayList<>();
        Suit[] allSuits = Suit.values();
        Rank[] allRanks = Rank.values();

        for(Suit suit : allSuits) {
            for(Rank rank : allRanks) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
        
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card nextCard() {
        return this.cards.remove(0);
    }

    public int getNumberOfCards() {
        return this.cards.size();
    }





}
