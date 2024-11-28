package TerminalOperations;

import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<String> list = List.of("Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi");
        System.out.printf("Original list: %s%n.", list.stream().count());
    }
}
