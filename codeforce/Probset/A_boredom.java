import java.util.Scanner;

/**
 * A.boredom
 */
public class A_boredom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[218 * 1000];
        for (int i = 0; i < n; ++i)
            ++a[in.nextInt()];
        long[] d = new long[a.length];
        d[0] = 0;
        d[1] = a[1];
        for (int i = 2; i < d.length; ++i) {
            d[i] = Math.max(d[i - 1], d[i - 2] + (long) a[i] * (long) i);
        }
        System.out.print(d[d.length - 1]);
        
}
}