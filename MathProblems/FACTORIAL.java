// public class FACTORIAL {
//     public static void main(String[]args){
//         int n=5;
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//             System.out.print(fact+" ");
//         }
//     }    
// }

//using Recursion
public class FACTORIAL {
    public static int findFact(int n){
        if( n == 0 || n == 1){
            return 1;
        }else{
            return n*findFact(n-1);
        }
    }
    public static void main(String[]args){
        int n=5;
        int fact = findFact(n);
        System.out.println(fact);        
    }    
}
