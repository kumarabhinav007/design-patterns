package org.example.specification;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
