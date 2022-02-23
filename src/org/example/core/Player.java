package org.example.core;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void showHand() {
        System.out.println(hand);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
