import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

  public class A {
     static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
                                        st=new StringTokenizer(br.readLine());				               
                                } catch (Exception e) {}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
    static int sol(int []arr,int n){
        int i=0;
        int j=n-1;
        int cnt1=0;
        int cnt2=0;
       while(i<j){
if(arr[i]==2)
cnt1++;
else if(arr[j]==2)
cnt2++;
if(cnt1<cnt2)
       }
    }
     public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        while(n-->0){
            int len = fs.nextInt();
            int arr[] = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = fs.nextInt();
                
            }
            System.out.println(sol(arr,len));
          
        }

     }

    }
