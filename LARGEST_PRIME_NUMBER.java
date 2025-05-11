import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LARGEST_PRIME_NUMBER {

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Get all prime numbers up to n
    public static List<Integer> lPrime(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Enter number greater than 1");
            return;
        }

        List<Integer> result = lPrime(n);

        if (result.isEmpty()) {
            System.out.println("No prime numbers found.");
            return;
        }

        // Find largest manually without Collections.max()
        int largest = result.get(0);
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i) > largest) {
                largest = result.get(i);
            }
        }

        System.out.println("The largest prime number up to " + n + " is: " + largest);
    }
}
