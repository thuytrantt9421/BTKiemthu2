import java.util.Scanner;

public class Ucln {
    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        }
        a = a % b;
        return gcd(a, b);
    }

    /**
     * ham main.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print(gcd(a, b));
    }
}
