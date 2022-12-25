package src;
import java.util.*;

public class B_LetsGetAPerfectScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int flag = scanner.nextInt();
            int k = scanner.nextInt();
            if(flag == 1) {
                int x = scanner.nextInt();
                A[k-1] = x;
            } else {
                System.out.println(A[k-1]);
            }
        }
    }
}