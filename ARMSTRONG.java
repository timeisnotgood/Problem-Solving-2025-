public class ARMSTRONG{
    public static void main(String[]args){
        int n=152,m=0;
        double sum=0;
        int org=n;
        int count=0;

        while(n>0){
            n=n/10;
            count++;
        }
        n=org;

        while(n>0){
            m=n%10;
            sum=sum+Math.pow(m,count);
            n=n/10;            
        }
        if(org == sum){
            System.out.print("Armstrong");
        }else{
            System.out.print("not a Armstrong");
        }
    }
}
