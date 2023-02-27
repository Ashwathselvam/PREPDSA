import java.util.*;
/**
 * longsubwithoutrep
 */
public class longsubwithoutrep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestSubWithoutRep(s));
    }

    private static int longestSubWithoutRep(String s) {
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int max =  0;
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i)))
            {
                       while(s.charAt(left)!=s.charAt(i)){
                            hs.remove(s.charAt(left));
                            left++;
                       }
                       hs.remove(s.charAt(left));
                        left++;
                          hs.add(s.charAt(i));
            }
            else{
                hs.add(s.charAt(i));
                max = Math.max(max,i-left+1);
            }
        }
        return max;
    }

}