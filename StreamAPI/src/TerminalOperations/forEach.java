package TerminalOperations;

import java.util.List;
import java.util.stream.Collectors;

public class forEach {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        System.out.printf("Original list: %s%n", list);

        // forEach operation - Executes the given action for each element.
        System.out.println("forEach operation:");
        list.stream().forEach(System.out::println);


        // anyMatch operation
        boolean anyMatch = list.stream().anyMatch("a"::equals);
        System.out.printf("Any match for 'a': %b%n", anyMatch);
    }
}
