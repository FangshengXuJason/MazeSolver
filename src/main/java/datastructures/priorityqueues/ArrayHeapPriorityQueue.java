package datastructures.priorityqueues;

import datastructures.dictionaries.IDictionary;
import misc.exceptions.NotYetImplementedException;

import java.util.Iterator;

/**
 * TODO: Replace this class with your `ArrayHeapPriorityQueue` implementation from the previous
 *       project.
 */
public class ArrayHeapPriorityQueue<T extends Comparable<T>> implements IPriorityQueue<T> {
    T[] heap;
    IDictionary<T, Integer> indices;

    public ArrayHeapPriorityQueue() {
        throw new NotYetImplementedException();
    }

    @Override
    public T removeMin() {
        throw new NotYetImplementedException();
    }

    @Override
    public T peekMin() {
        throw new NotYetImplementedException();
    }

    @Override
    public void add(T item) {
        throw new NotYetImplementedException();
    }

    @Override
    public boolean contains(T item) {
        throw new NotYetImplementedException();
    }

    @Override
    public void remove(T item) {
        throw new NotYetImplementedException();
    }

    @Override
    public void replace(T oldItem, T newItem) {
        throw new NotYetImplementedException();
    }

    @Override
    public int size() {
        throw new NotYetImplementedException();
    }

    @Override
    public String toString() {
        throw new NotYetImplementedException();
    }

    @Override
    public Iterator<T> iterator() {
        throw new NotYetImplementedException();
    }
}
