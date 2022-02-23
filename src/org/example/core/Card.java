package org.example.core;

public class Card {
    public Suite suite;
    public int value;
    public Card(int value, Suite suite) {
        this.suite = suite;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suite='" + suite + '\'' +
                ", value=" + value +
                '}';
    }
}
