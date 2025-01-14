import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Input voter ID status
        System.out.print("Do you have a voter ID? (true/false): ");
        boolean hasVoterID = scanner.nextBoolean();

        // Check voting eligibility
        if (age >= 18 && hasVoterID) {
            System.out.println("You are eligible to vote.");
        } else if (age < 18) {
            System.out.println("You are not eligible to vote because you are under 18.");
        } else {
            System.out.println("You are not eligible to vote because you do not have a voter ID.");
        }

        // Close the scanner
        scanner.close();
    }
}
