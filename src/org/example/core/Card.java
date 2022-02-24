package org.example.core;

public class Card implements ICard {
    private Suite suite;
    private int value;

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

    public int getValue() {
        return value;
    }
}
