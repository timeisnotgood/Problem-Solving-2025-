public class COUNTDIVISOR {
    public static int sumOfDivisors(int n){
        int sum=0,count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum +=i;
                count++;            
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int n=5;

        int result = sumOfDivisors(n);
        System.out.println("Sum of all divisors of " + n + " is: " + result);
    }
    
}
