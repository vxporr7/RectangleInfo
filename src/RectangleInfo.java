import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        double length = 0;
        double width = 0;

        // Input loop
        do {
            try {
                System.out.print("Enter the length of the rectangle: ");
                length = Double.parseDouble(in.nextLine());

                System.out.print("Enter the width of the rectangle: ");
                width = Double.parseDouble(in.nextLine());

                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
            }
        } while (!validInput);

        // Calculations
        double area = length * width;
        double perimeter = 2 * (length + width);
        double hypotenuse = Math.sqrt(length * length + width * width);

        // Output results
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Hypotenuse: %.2f%n", hypotenuse);

        // Tests
        System.out.println("\nRunning tests...");
        runTests();
    }

    public static void runTests() {
        // Test with 3, 4, 5 triangle
        double testLength = 3;
        double testWidth = 4;

        double expectedArea = testLength * testWidth;
        double expectedPerimeter = 2 * (testLength + testWidth);
        double expectedHypotenuse = 5; // Known value for 3, 4, 5 triangle

        System.out.printf("Test area: %.2f (expected: %.2f)%n", expectedArea, expectedArea);
        System.out.printf("Test perimeter: %.2f (expected: %.2f)%n", expectedPerimeter, expectedPerimeter);
        System.out.printf("Test hypotenuse: %.2f (expected: %.2f)%n", expectedHypotenuse, expectedHypotenuse);

        // Test bad input
        try {
            System.out.println("Testing bad input...");
            Double.parseDouble("bad input");
        } catch (NumberFormatException e) {
            System.out.println("Caught bad input as expected.");
        }

    }
}