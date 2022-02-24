package org.example.core;

import java.util.ArrayList;

public class Player {
    private ArrayList<ICard> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void showHand() {
        System.out.println(hand);
    }

    public ArrayList<ICard> getHand() {
        return hand;
    }
}
