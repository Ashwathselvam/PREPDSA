/**
 * bitwiseequation...
 */
import java.util.*;
public class bitwiseequation {
static void solv(long n){
     if(n==0){
        System.out.print(4+" "+6+" "+3+" "+7);
        return;
    }
    long a=1;
    long b=2;
long d=0;
long c=0;
for(long i=3;i<1000000;i++){
long cur=i^n;
if(i!=cur && cur>2){
c=i;
d=cur;
break;
}
}
if(c==0) System.out.println("-1");
else{
System.out.print(a+" "+b+" "+c+" "+d);
}
return;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            long a = sc.nextLong();
            solv(a);
            System.out.println();
        }
    }
}