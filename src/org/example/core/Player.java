package org.example.core;


public class Player {
    private CardRepository hand;

    public Player() {
        hand = new CardRepository();
    }

    public void showHand() {
        System.out.println(hand);
    }

    public CardRepository getHand() {
        return hand;
    }
}
