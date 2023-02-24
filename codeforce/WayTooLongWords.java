import java.util.Scanner;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String st = sc.nextLine();
            int length = st.length();
            if (length <= 10) {
                System.out.println(st);
            } else {
                System.out.println("" + st.charAt(0) + (length - 2) + st.charAt(length - 1));
            }
        }
        sc.close();
    }
}