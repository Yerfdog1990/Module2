package TerminalOperations;

import java.util.List;
import java.util.NoSuchElementException;

public class Find {
    public static void main(String[] args) {
        List<String> list = List.of("Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi");
        System.out.printf("Original list: %s%n", list);
        System.out.printf("First element: %s%n", list.stream().findFirst().get());
        List<String> list2 = List.of("");
        list.stream().findFirst().ifPresent(firstElement-> System.out.printf("First element: %s%n", firstElement));
        System.out.printf("First element: %s%n", list2.stream().findFirst().orElse("No first element in the list."));
        System.out.printf("First element: %s%n", list2.stream().findFirst().orElseThrow(()-> new NoSuchElementException("No element found.")));
        System.out.printf("Find any: %s%n", list.stream().findAny().get());
    }
}
