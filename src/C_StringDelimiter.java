package src;
import java.util.*;

public class C_StringDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        scanner.close();
        char[] s = S.toCharArray();

        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '0' && s[i+1] == '0' && i != s.length-1) {
                i++;
            }
            ans++;
        }

        System.out.println(ans);
    }    
}