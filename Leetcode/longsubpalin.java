import java.util.*;
public class longsubpalin {
    private static String longestSubPalin(String s) {
     int n  = s.length();
     int dp[][] = new int[n][n];
     int maxle=1;
     int start=0;
     for(int i=0;i<n;i++){
            dp[i][i] = 1;
     }
     for(int i=0;i<n-1;i++){
        if(s.charAt(i)==s.charAt(i+1)){
            dp[i][i+1]=1;
            maxle=2;
            start=i;
        }
     }
for(int k=3;k<=n;k++){
    for(int i=0;i<n-k+1;i++){
        int j = i+k-1;
        if(dp[i+1][j-1]==1 && s.charAt(i)==s.charAt(j) ){
            dp[i][j]=1;
            if(k>maxle){
                start = i;
                maxle=k;
            }
        }
    }
}
return s.substring(start,start+maxle);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestSubPalin(s));
    }
}
