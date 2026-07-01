import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Step 2: Create the array
        int[] numbers = new int[n];

        // Step 3: Prompt user for each element
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Search for the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 5: Display the results
        System.out.println("\n----- Results -----");
        System.out.println("Array entered: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Found at index: " + maxIndex);

        scanner.close();
    }
}