package org.example.specification;

import java.util.List;
import java.util.stream.Stream;

public interface IFilter<T> {

    Stream<T> filter(List<T> items, Specification<T> specification);
}
