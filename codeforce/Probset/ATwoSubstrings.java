import java.util.ArrayList;
import java.util.Scanner;

public class ATwoSubstrings {
static String solv(String s){
    int n = s.length();
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    for(int i=0;i<n-1;i++){
        if(s.charAt(i)=='A' && s.charAt(i+1)=='B'){
            a.add(i);
        }
        if(s.charAt(i)=='B' && s.charAt(i+1)=='A'){
            b.add(i);
        }
    }
    int flag=0;
    for (int i : a ){
        if(flag==1) break;
        for(int j: b){
            if(Math.abs(i-j)>1){
                flag=1;
                break;
            }
        }
    }
  if(flag==1) return "YES";
  else return "NO";
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s = sc.next().trim();
       System.out.println(solv(s));
       
    }
}
