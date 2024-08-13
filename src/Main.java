import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a scanner object

        System.out.println("Write and sentence, and I will reverse it!");

        String userInput = input.nextLine(); // Read user input
        input.close();

        // Split the input string into a list of words
        List<String> userInputWords = Arrays.asList(userInput.split(" "));

        // Reverse the order of the words
        Collections.reverse(userInputWords);

        // Join the words back to a single string with space
        String reversedInput = String.join(" ", userInputWords);

        System.out.println("Your original input: " + userInput);
        System.out.println("Your input reversed: " + reversedInput); // Output user input

        // Call the capitalize method
        String capitalizedReversedInput = CapitalizeWords.capitalizeWords(reversedInput);

        // Output the capitalized reversed string
        System.out.println("Capitalized reversed input: " + capitalizedReversedInput);

    }
}