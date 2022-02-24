package org.example.core;

import java.util.ArrayList;


public class CardRepository implements Container<ICard> {
    private ArrayList<ICard> cards = new ArrayList<ICard>();

    @Override
    public Iterator getIterator() {
        return new CardIterator();
    }

    @Override
    public void add(ICard card) {
        cards.add(card);
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    private class CardIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if(index < cards.size())
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
            {
                return cards.get(index++);
            }
            return null;
        }

    }
}
