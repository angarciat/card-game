package org.example.core;
import java.util.ArrayList;

public class Game implements AutoCloseable {
    private Game() {
        ArrayList<ICard> deckCollection = new ArrayList<ICard>();
        for(int i = 1 ; i <= 13 ; i++){
            deckCollection.add(new Card(i,Suite.CLUBS));
            deckCollection.add(new Card(i,Suite.DIAMONDS));
            deckCollection.add(new Card(i,Suite.HEARTS));
            deckCollection.add(new Card(i,Suite.SPADE));
        }
        deck = new Deck<ICard>(deckCollection);
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
        ICard c1 = null;
        ICard c2 = null;

        // These two loops pretty much do the same thing. 
        // Consider refactoring them to a method. 
        // Use a descriptive name for that new metod.
        for (Iterator iter = p1.getHand().getIterator(); iter.hasNext();) {
            ICard card = (ICard)iter.next();
            if (c1 == null) {
                c1 = card;
            } else if (card.getValue() > c1.getValue())  {
                 c1 = card;
            }
        }
        for (Iterator iter = p2.getHand().getIterator(); iter.hasNext();) {
            ICard card = (ICard)iter.next();
            if (c2 == null) {
                c2 = card;
            } else if (card.getValue() > c2.getValue())  {
                c2 = card;
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
    private Deck<ICard> deck; // Consider using dependency injection for this.
}
