package TerminalOperations;

import java.util.List;

public class Match {
    public static void main(String[] args) {
        List<String> list = List.of("Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi");
        System.out.printf("Original list: %s%n", list);
        System.out.printf("Anymatch: %s%n", list.stream().anyMatch("Kenya"::equals));
        boolean anyMatch = list.stream().anyMatch(name->name.startsWith("k"));
        System.out.println("Any name starts with 'K': " + anyMatch);
        boolean allMatch = list.stream().allMatch(name -> name.length() >= 3);
        System.out.println("All names have length >= 3: " + allMatch);
        boolean noneMatch = list.stream().noneMatch(name -> name.startsWith("Z"));
        System.out.println("No name starts with 'Z': " + noneMatch);
    }
}
