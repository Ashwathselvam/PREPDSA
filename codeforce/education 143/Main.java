 import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int t = scanner.nextInt();
while (t-- > 0) {
int n = scanner.nextInt();
int k = scanner.nextInt();
int[] freq = new int[51];
for (int i = 0; i < n; i++) {
int l = scanner.nextInt();
int r = scanner.nextInt();
for (int j = l; j <= r; j++) {
freq[j]++;
}
}
int maxFreq = 0;
for (int i = 1; i <= 50; i++) {
maxFreq = Math.max(maxFreq, freq[i]);
}
System.out.println(maxFreq >= freq[k] ? "YES" : "NO");
}
}
    
}
