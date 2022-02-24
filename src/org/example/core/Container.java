package org.example.core;

public interface Container<T> {
    public Iterator getIterator();
    public void add(T element);
}
