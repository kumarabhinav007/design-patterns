package org.example.specification;

import java.util.List;

public class Demo {

    public static void main(String args[]) {
        Product apple = new Product("Apple", Colour.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Colour.GREEN, Size.LARGE);
        Product house = new Product("House", Colour.BLUE, Size.LARGE);
        List<Product> products = List.of(apple, tree, house);


        Filter filter = new Filter();
        System.out.println("Green products:");
        filter.filter(products, new ColourSpecification(Colour.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large products:");
        filter.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(" - " + p.name + " is large"));

        System.out.println("Large blue items:");
        filter.filter(products,
                        new AndSpecification<>(
                                new ColourSpecification(Colour.BLUE),
                                new SizeSpecification(Size.LARGE)
                        ))
                .forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
    }
}
