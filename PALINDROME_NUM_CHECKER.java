public class PALINDROME_NUM_CHECKER {
    public static void main(String[]args){
        int n=1341,m=0,sum=0;
        int org=n;
        while(n>0){
            m=n%10;
            sum=(sum*10)+m;
            n=n/10;            
        }
        if(org == sum){
            System.out.print("Palindrome");
        }else{
            System.out.print("not a Palindrome");
        }
    }
}
