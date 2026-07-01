import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Step 2: Create and fill the array
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Get the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute force nested loop search
        boolean found = false;

        for (int i = 0; i < n && !found; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    // Step 5: Display the matching pair
                    System.out.println("\n----- Results -----");
                    System.out.println("Pair found!");
                    System.out.println("Index " + i + " and Index " + j);
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }
        }

        // Step 6: No pair found
        if (!found) {
            System.out.println("\n----- Results -----");
            System.out.println("No pair was found that adds up to " + target + ".");
        }

        scanner.close();
    }
}