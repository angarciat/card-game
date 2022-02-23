package org.example.core;

public class Game implements AutoCloseable {
    private Game() {
        deck = new Deck();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Cleaning up instance");
        instance = null;
    }

    public void dealCard(Player p) {
        p.getHand().add(deck.dealCard());
    }

    public void printWinner(Player p1, Player p2) {
        Card c1 = null;
        Card c2 = null;
        for (Card c : p1.getHand()) {
            if (c1 == null) {
                c1 = c;
            } else if (c.getValue() > c1.getValue())  {
                 c1 = c;
            }
        }
        for (Card c : p2.getHand()) {
            if (c2 == null) {
                c2 = c;
            } else if (c.getValue() > c2.getValue())  {
                c2 = c;
            }
        }
        if (c1.getValue() > c2.getValue()) {
            System.out.println("Player 1 wins");
        } else if (c2.getValue() > c1.getValue()) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("It's a tie");
        }
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private static Game instance;
    private Deck deck;
}
