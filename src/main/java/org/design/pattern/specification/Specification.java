package org.design.pattern.specification;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
