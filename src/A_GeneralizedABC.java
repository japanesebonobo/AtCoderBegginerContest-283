package src;
import java.util.*;

public class A_GeneralizedABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextInt();
        double B = scanner.nextInt();
        scanner.close();

        double ans = Math.pow(A, B);

        System.out.println((int)ans);
    }
}