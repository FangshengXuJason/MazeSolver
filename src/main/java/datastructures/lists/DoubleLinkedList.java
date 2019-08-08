package datastructures.lists;

import misc.exceptions.NotYetImplementedException;

import java.util.Iterator;

/**
 * TODO: Replace this class with your `DoubleLinkedList` implementation from the first project.
 */
public class DoubleLinkedList<T> implements IList<T> {
    public DoubleLinkedList() {
        throw new NotYetImplementedException();
    }

    @Override
    public void add(T item) {
        throw new NotYetImplementedException();
    }

    @Override
    public T remove() {
        throw new NotYetImplementedException();
    }

    @Override
    public T get(int index) {
        throw new NotYetImplementedException();
    }

    @Override
    public T set(int index, T item) {
        throw new NotYetImplementedException();
    }

    @Override
    public void insert(int index, T item) {
        throw new NotYetImplementedException();
    }

    @Override
    public T delete(int index) {
        throw new NotYetImplementedException();
    }

    @Override
    public int indexOf(T item) {
        throw new NotYetImplementedException();
    }

    @Override
    public int size() {
        throw new NotYetImplementedException();
    }

    @Override
    public boolean contains(T other) {
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

    static class Node<E> {
        final E data;
        Node<E> prev;
        Node<E> next;

        Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        Node(E data) {
            this(null, data, null);
        }
    }
}
