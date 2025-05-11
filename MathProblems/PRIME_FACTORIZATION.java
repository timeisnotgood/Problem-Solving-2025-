import java.util.*;

public class PRIME_FACTORIZATION {

    public static void primeFactorial(int n) {
        System.out.print("Prime factors: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                 n = n / i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Enter a number greater than 1");
        } else {
            primeFactorial(n);
        }

        sc.close();
    }
}
