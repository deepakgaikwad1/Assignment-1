import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by both 5 and 3
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by both 5 and 3.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 3.");
        }

        // Close the scanner
        scanner.close();
    }
}
