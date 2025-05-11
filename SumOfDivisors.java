import java.util.Scanner;

public class SumOfDivisors {

    public static int sumOfDivisors(int n) {
        int sum = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;

                // n / i is the corresponding pair divisor
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sumOfDivisors(n);
        System.out.println("Sum of all divisors of " + n + " is: " + result);
    }
}
