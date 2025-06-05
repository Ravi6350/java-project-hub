import java.util.Scanner;

public class Chatbot {
         public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hello! I'm your Chatbot Type 'exit' to end.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Chatbot: Hello there! How can I help you?");
            } else if (input.contains("how are you")) {
                System.out.println("Chatbot: I'm just a bunch of code, but I'm running well!");
            } else if (input.contains("what is your name")) {
                System.out.println("Chatbot: You can call me Future Chatbot!");
            } else if (input.contains("exit") || input.contains("bye")) {
                System.out.println("Chatbot: Goodbye! Have a nice day.");
                break;
            } else {
                System.out.println("Chatbot'm not sure how to respond to that.");
            }
        }

        scanner.close();
    }
}