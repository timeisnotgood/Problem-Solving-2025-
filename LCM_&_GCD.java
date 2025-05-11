 class LCM_GCD {
    public static int findGCD(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
       int a=12;
       int b=18;
       int gcd = findGCD(a, b); 
       int lcm = (a * b) / gcd; // LCM formula
       System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
       System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}