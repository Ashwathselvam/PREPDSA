import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public  class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n,m,cnt=0;
             n = sc.nextInt();
             m = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            StringBuilder sb=new StringBuilder(a);  
            sb.reverse();  
             sb.toString();
            String res = sb+b;
            for(int i=0;i<n+m-1;i++){
                if(res.charAt(i)==res.charAt(i+1))
                cnt++;
            }
            if(cnt>1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
        }
    }
}
    