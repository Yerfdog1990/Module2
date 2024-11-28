package TerminalOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<String> list = List.of("Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi");
        // collect operation - Gathers the elements into a collection.
        List<String> collectedList = list.stream().collect(Collectors.toList());
        System.out.printf("Collected list: %s%n", collectedList);
    }
}
