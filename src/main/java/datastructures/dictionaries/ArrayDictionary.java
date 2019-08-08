package datastructures.dictionaries;

import misc.exceptions.NotYetImplementedException;

import java.util.Iterator;

/**
 * TODO: Replace this class with your `ArrayDictionary` implementation from the first project.
 */
public class ArrayDictionary<K, V> implements IDictionary<K, V> {
    Pair<K, V>[] pairs;

    public ArrayDictionary() {
        throw new NotYetImplementedException();
    }

    public ArrayDictionary(int initialCapacity) {
        throw new NotYetImplementedException();
    }

    @Override
    public V get(K key) {
        throw new NotYetImplementedException();
    }

    @Override
    public V put(K key, V value) {
        throw new NotYetImplementedException();
    }

    @Override
    public V remove(K key) {
        throw new NotYetImplementedException();
    }

    @Override
    public boolean containsKey(K key) {
        throw new NotYetImplementedException();
    }

    @Override
    public int size() {
        throw new NotYetImplementedException();
    }

    @Override
    public Iterator<KVPair<K, V>> iterator() {
        throw new NotYetImplementedException();
    }

    @Override
    public String toString() {
        throw new NotYetImplementedException();
    }

    private static class Pair<K, V> {
        public K key;
        public V value;

        // You may add constructors and methods to this class as necessary.
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("%s=%s", this.key, this.value);
        }
    }
}
