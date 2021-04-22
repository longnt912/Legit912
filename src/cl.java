import java.util.Scanner;
public class cl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, min, i;
        System.out.println("Nhap vao so a: ");
        a = sc.nextInt();
        System.out.println("Nhap vao so b: ");
        b = sc.nextInt();
        System.out.println("UCLN cua " + a + " va " + b + " la:" + UCLN(a, b));
        System.out.println("BCNN cua " + a + " va " + b + " la:" + BCNN(a, b));
    }

    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}