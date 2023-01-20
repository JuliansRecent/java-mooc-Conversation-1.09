
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Print a question to give the user a question to respond to
        System.out.println("Greetings! How are you doing?");
        // Prompt the user to give a response, store it in a String variable, and return it in the console
        String first_response = scanner.nextLine();
        // Print a response to their input to the first question, asking for another response
        System.out.println("Oh, how interesting. Tell me more!");
        // Prompt the user for a response again, store it in a String variable and return it in the console
        String second_response = scanner.nextLine();
        // Print a closing statement, letting the user know that the interaction is over
        System.out.println("Thanks for sharing!");
    }
}
