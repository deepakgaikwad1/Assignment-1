import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area
        double area = length * breadth;

        // Print the area
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
