package TerminalOperations;

import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        System.out.printf("Original list: %s%n", list);

        // forEach operation
        System.out.println("forEach operation:");
        list.stream().forEach(System.out::println);

        // count operation
        long count = list.stream().count();
        System.out.printf("Count of elements: %d%n", count);

        // collect operation
        List<String> collectedList = list.stream().collect(Collectors.toList());
        System.out.printf("Collected list: %s%n", collectedList);

        // anyMatch operation
        boolean anyMatch = list.stream().anyMatch("a"::equals);
        System.out.printf("Any match for 'a': %b%n", anyMatch);
    }
}
