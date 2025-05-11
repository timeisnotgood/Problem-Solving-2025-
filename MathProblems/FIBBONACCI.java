// public class FIBBONACCI {
//     public static void main(String[] args){
//         int n=10,n1=0,n2=1,n3=0;
//         System.out.print(n1+" "+n2+" ");
//         for(int i=2;i<=n;i++){
//             n3=n1+n2;
//             n1=n2;
//             n2=n3;
//             System.out.print(n3+" ");
//         }
//     }    
// }

public class FIBBONACCI {
    public static int fibbo(int n){
        if(n<=1){
            return n;
        }else{
            return fibbo(n-1) + fibbo(n-2);
        }
    } 
    public static void main(String[] args){
        int n=10,n1=0,n2=1,n3=0;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<=n;i++){
            System.out.print(fibbo(i)+" ");
        }
    }    
}
