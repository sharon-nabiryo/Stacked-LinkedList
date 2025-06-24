# SortedLinkedList

## Description

`SortedLinkedList.java` is a Java program that reads a list of integers from user input, stores them in a `LinkedList` using the Java Collections Framework, sorts them in ascending order, and prints the result.

This program demonstrates code reuse through the use of modular methods and general interfaces. For instance, the readInput() method can be reused in any future program requiring numeric input, and sortList() abstracts sorting logic so it can be applied to any list of integers. Additionally, using the List interface instead of directly coding to LinkedList allows easy reuse and extension, such as replacing it with a Queue in Module 5 without rewriting core logic.

---

## Features

- Uses Java's `LinkedList` via the `List<Integer>` interface
- Sorts values using `Collections.sort()`
- Handles invalid (non-integer) input gracefully
- Modular design with reusable methods: `readInput()`, `sortList()`, and `printList()`
- Follows best practices and includes Javadoc comments
- Prepared for extension and reuse in future modules

---

## Command used for compiling program

javac SortedLinkedList.java

---

### Input Instructions

After running the program: Command: java SortedLinkedList

1. Type integers separated by spaces.
2. Press:
   - `Ctrl + D` (macOS/Linux)
   - or `Ctrl + Z`, then `Enter` (Windows)
     to signal the end of input.

---

### Command used for generating JavaDoc

To keep the directory clean, generate the documentation inside a folder named `docs`:

javadoc -d docs -author -version SortedLinkedList.java
