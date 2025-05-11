import java.util.Scanner;

public class Nth_PRIME_NUMBER {


    public static boolean isPrimeNumber(int n){
        boolean isPrime = true;
        if(n <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break; 
                }
            }
        }
        return isPrime;
    }

    
    public static int nPrime(int n){
        int count = 0;
        int num = 1;
        while(n > count){
            num++;
            if(isPrimeNumber(num)){
                count++;
            }            
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int result = nPrime(n);
        System.out.println("The " + n + "th prime number is: " + result);
    }
}
