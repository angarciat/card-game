package org.example.core;

import java.util.ArrayList;

public class Deck <T extends ICard> {
    private ArrayList<T> deck = new ArrayList<T>();

    // Typo in delt? dealt?
    private ArrayList<T> delt = new ArrayList<T>();

    public Deck(ArrayList<T> deck) {
        this.deck = deck;
    }

    public T dealCard(){
        int rand = (int)(Math.random() * ((deck.size() - 1)));
        T c = deck.get(rand);
        deck.remove(c);
        delt.add(c);
        return c;
    }
}
