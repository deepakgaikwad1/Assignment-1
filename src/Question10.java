import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Determine the life stage
        if (age < 13) {
            System.out.println("Life Stage: Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Life Stage: Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Life Stage: Adult");
        } else if (age >= 60) {
            System.out.println("Life Stage: Senior Citizen");
        } else {
            System.out.println("Invalid age entered.");
        }

        // Close the scanner
        scanner.close();
    }
}
