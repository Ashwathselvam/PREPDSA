import java.util.Scanner;

public class A {
public static String sol(int l,String s){
    s=s.toLowerCase();
    String res="meow";
    StringBuilder temp = new StringBuilder();
    int j=0;
    temp.append(s.charAt(j));
    for(int i=1;i<l;i++){
        if(s.charAt(i)!=s.charAt(j)){
            temp.append(s.charAt(i));
            j=i;
        }
}
    if(res.equals(temp.toString())){
        return "YES";
    }
    else{
        return "NO";
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int l = sc.nextInt();
            String s = sc.next();
            System.out.println(sol(l,s));
        }
    }
}