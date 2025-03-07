package com.otahontas.archiver.datastructures;

/**
 * Basic implementation of key-value -pair. 
 *
 * @param <K> Key for pair, give type when declaring
 * @param <V> Value for pair, give type when declaring
 */

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
