package datastructures.dictionaries;

import misc.exceptions.NotYetImplementedException;

import java.util.Iterator;

/**
 * TODO: Replace this class with your `ChainedHashDictionary` implementation from the second
 * project.
 */
public class ChainedHashDictionary<K, V> implements IDictionary<K, V> {
    IDictionary<K, V>[] chains;

    public ChainedHashDictionary() {
        throw new NotYetImplementedException();
    }

    public ChainedHashDictionary(double resizingLoadFactorThreshold, int initialChainCount, int chainInitialCapacity) {
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
    public String toString() {
        throw new NotYetImplementedException();
    }

    @Override
    public Iterator<KVPair<K, V>> iterator() {
        throw new NotYetImplementedException();
    }
}
