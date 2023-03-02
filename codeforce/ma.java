/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ma
{
    static int gcd(int  a,int b){
        if(a==0)
        return b;
        return gcd(b%a,a);
    }
    static int sol(int a,int b ,int  c){
        while(1){
            
        }
}
return 0;
         }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =  new Scanner( System.in);
        int t=sc.nextInt();
        while(t-->0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(sol(a,b,c)==1)
        System.out.println("YES");
        else
        System.out.println("NO");
        }

	}
}