import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate average
        double average = (subject1 + subject2 + subject3) / 3.0;

        // Check if the student has passed
        if (subject1 >= 40 && subject2 >= 40 && subject3 >= 40 && average >= 50) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }

        // Print the average
        System.out.println("Average Marks: " + average);

        // Close the scanner
        scanner.close();
    }
}
