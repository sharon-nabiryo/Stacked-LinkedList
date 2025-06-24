import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * A program that reads integers from user input, stores them in a LinkedList,
 * sorts them, and prints them in ascending order.
 * <p>
 * Built for reuse and future extensibility.
 * </p>
 * 
 * @author Sharon
 * @version 1.0
 */
public class SortedLinkedList {

    /**
     * Main entry point of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers = readInput(); // Read integers from user
        sortList(numbers);                   // Sort the list
        printList(numbers);                  // Display sorted output
    }

    /**
     * Reads integers from standard input and returns them as a List.
     *
     * @return list of integers from user input
     */
    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);    // Set up scanner for user input
        List<Integer> numbers = new LinkedList<>();  // Use LinkedList to store integers
        System.out.println("Enter integers separated by space. Press Ctrl+D (or Ctrl+Z + Enter) to end:");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());      // Add valid integer input to the list
            } else {
                scanner.next();                      // skip invalid input
            }
        }
        scanner.close();                             // Close scanner to avoid resource leak  
        return numbers;                              // Return the list of numbers
    }

    /**
     * Sorts the given list in ascending order.
     *
     * @param numbers the list to be sorted
     */
    public static void sortList(List<Integer> numbers) {
        Collections.sort(numbers);             // sort list using built-in sort method
    }

    /**
     * Prints the list of integers.
     *
     * @param numbers the list to print
     */
    public static void printList(List<Integer> numbers) {
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");       // Print each number followed by a space
        }
        System.out.println();                 // Print neline after all numbers
    }
}
