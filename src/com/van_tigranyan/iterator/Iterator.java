package com.van_tigranyan.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
