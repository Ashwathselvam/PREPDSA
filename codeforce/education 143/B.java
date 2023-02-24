import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n,k,start=0,end=0;
        n  = sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<n;i++){
        int l = sc.nextInt();
        int r = sc.nextInt();
        if(l==k)
        start++;
        if(r==k) 
        end++;
        }
        if(start>0 && end>0) {
        System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
    }
}
