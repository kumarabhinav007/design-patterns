package org.example.specification;

import java.util.List;
import java.util.stream.Stream;

public class Filter implements IFilter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification specification) {
        return items.stream().filter(p -> specification.isSatisfied(p));
    }
}
