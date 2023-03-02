/**
 * yournameismine
 */
import java.util.Scanner;
 class yournameismine {
         static void solv(String a,String b){
        int n=a.length();
        int m = b.length();
        int j=0;
         for(int i=0;i<n && j<m;i++){
             if(a.charAt(i)==b.charAt(j)){
                 j++;
             }
         }
         if(j==m)
         {
             System.out.println("YES");
             return;
         }
         System.out.println("NO");
         return;
    }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		while(n-->0){
		    String a = sc.next();
		    String b = sc.next();
		    if(a.length()>=b.length())
		    solv(a,b); 
            else{
                solv(b,a);
            }
 }  
}
}