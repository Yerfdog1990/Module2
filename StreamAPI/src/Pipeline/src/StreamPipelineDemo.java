import java.util.*;
import java.util.stream.Collectors;

public class StreamPipelineDemo {
    public static void main(String[] args) {
        // Sample data
        List<Integer> numbers = Arrays.asList(5, 3, 8, 6, 2, 3, 8, 5, 10, 2);

        System.out.println("Original List: " + numbers);

        // Intermediate Operations: filter, distinct, sorted
        // Terminal Operations: forEach, toArray, min, max
        System.out.println("\nPipeline Demonstration:");

        // 1. Using filter, distinct, and forEach
        System.out.println("Filtered, Distinct, and Printed Elements:");
        numbers.stream()
                .filter(num -> num > 4)            // Keep only numbers greater than 4
                .distinct()                       // Remove duplicate numbers
                .forEach(System.out::println);    // Print each number (Terminal)

        // 2. Using distinct, sorted, and toArray
        System.out.println("\nDistinct and Sorted Array:");
        Integer[] distinctSortedArray = numbers.stream()
                .distinct()                       // Remove duplicates
                .sorted()                         // Sort the elements
                .toArray(Integer[]::new);         // Convert to an array (Terminal)
        System.out.println(Arrays.toString(distinctSortedArray));

        // 3. Using filter, sorted, and min
        System.out.println("\nMinimum of Filtered and Sorted Numbers:");
        numbers.stream()
                .filter(num -> num % 2 == 0)      // Keep only even numbers
                .sorted()                         // Sort the numbers
                .min(Integer::compareTo)          // Find the minimum value (Terminal)
                .ifPresent(System.out::println);  // Print if present

        // 4. Using filter, sorted, and max
        System.out.println("\nMaximum of Filtered and Sorted Numbers:");
        numbers.stream()
                .filter(num -> num % 2 == 0)      // Keep only even numbers
                .sorted()                         // Sort the numbers
                .max(Integer::compareTo)          // Find the maximum value (Terminal)
                .ifPresent(System.out::println);  // Print if present

        // 5. Chaining Intermediate and Terminal Operations
        System.out.println("\nSum of Distinct Numbers Greater Than 5:");
        int sum = numbers.stream()
                .filter(num -> num > 5)           // Keep numbers greater than 5
                .distinct()                       // Remove duplicates
                .reduce(0, Integer::sum);         // Sum the numbers (Terminal)
        System.out.println(sum);

        // 6. Collecting Stream Results into a List
        System.out.println("\nCollecting Filtered and Sorted Stream into a List:");
        List<Integer> collectedList = numbers.stream()
                .filter(num -> num > 4)           // Keep numbers greater than 4
                .sorted()                         // Sort the elements
                .collect(Collectors.toList());    // Collect into a list (Terminal)
        System.out.println(collectedList);
    }
}

