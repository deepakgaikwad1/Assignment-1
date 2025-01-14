import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * radius * radius;  // Formula: πr²
        double circumference = 2 * Math.PI * radius;  // Formula: 2πr

        // Print the results
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);

        // Close the scanner
        scanner.close();
    }
}
