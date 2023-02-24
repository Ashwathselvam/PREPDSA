
import java.util.*;
  class ValidExpression {
        public static void solv(int n,int x){
         int max = n+1;
         int min = 1-n;
         if(!(min<=x && x<=max)){
            System.out.println(-1);
            return;
         }
         if(x>0){
                if(x==n+1){
                        for(int i=0;i<n;i++){
                           System.out.print("+");
                         }
                }
                else if(x<=n){
                        for(int i=0;i<x-1;i++){
                                System.out.print("+");
                        }
                        for(int i=0;i<n-(x-1);i++) System.out.print("*");
                }
         }
         else if(x<0){

                if(1-n==x){
                        for(int i=0;i<n;i++) System.out.print("-");
                }
                else if(x>=n){
                        for(int i=0;i<Math.abs(x)+1;i++) System.out.print("-");
                        for(int i=0;i<n-(Math.abs(x)+1);i++) System.out.print("*");
                }
         }
         else if(x==0){
                System.out.print("-");
                if(n>1) for(int i=0;i<n-1;i++)System.out.print("*");
         }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
           int a = sc.nextInt();
           int x = sc.nextInt();
           solv(a,x);
           System.out.println();
        }
    }
}
