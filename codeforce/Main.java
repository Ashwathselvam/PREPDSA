/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static void  solv(int []a,int n){
        int [] [] dp = new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=n+1;
            }
        }
        for(int i=0;i<n;i++){
            dp[a[i]][0] = Math.min(dp[a[i]][0],i);
            dp[a[i]][1]=i;
        }
     int ans=0,tot=0;
     int last=n+1,ctr=0;
     for(int i=n;i>0;i--){
        if(dp[i][0]!=n+1){
            ctr++;
        }
        if(dp[i][1]<last){
            tot++;
            ans=Math.max(ans,tot);
            last=dp[i][0];
        }
        else{
            tot=1;
            last=dp[i][0];
        }
     }
     System.out.print(ctr-ans);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        solv(arr,n);
	}
}
