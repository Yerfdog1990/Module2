package TerminalOperations;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<String> list = List.of("Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi");
        System.out.printf("Original list: %s%n", list);

        //Reduce operations: Reduces the elements to a single value
        System.out.printf("\nConcatanated names: %s%n", list.stream().reduce("", (result, name)-> result + name +"").trim());
    }
}
