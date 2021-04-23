import java.util.Scanner;


// BAI 1

public class BTVN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao N so: ");
        n = scanner.nextInt();
        int[] danhsach = new int[n];
        int i;
        for (i = 0; i < danhsach.length; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + ":");
            danhsach[i] = scanner.nextInt();
        }
        System.out.print("Cac so chia het cho 3 la: ");
        for (i = 0; i < danhsach.length; i++) {
            if (danhsach[i] % 3 == 0) {
                System.out.print(danhsach[i]);
                System.out.print(" ");
            }
        }

            //BAI 2


            int a, b;
            int gcd, lcm, Du, n1, n2;
            System.out.println("\n Nhap vao 2 so: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            try {
                if (a > b) {
                    n1 = a;
                    n2 = b;
                } else {
                    n1 = b;
                    n2 = a;
                }
                Du = n1 % n2;
                while (Du != 0) {
                    n1 = n2;
                    n2 = Du;
                    Du = n1 % n2;
                }
                gcd = n2;
                lcm = a * b / gcd;
                System.out.println("GCD of " + a + " and " + b + " = " + gcd);
                System.out.println("LCM of " + a + " and " + b + " = " + lcm);
            } catch (ArithmeticException e) {
                System.out.println("UCLN & UCNN = 0");
            }


            // BAI 3


            int j, SoNhap, Sum = 0;
            System.out.println("\n Hay nhap 1 so la: ");
            SoNhap = scanner.nextInt();
            if(SoNhap >= Math.pow(10,9)){
                System.out.println(" Qua so cho phep");
            }
                for (j = 1; j < SoNhap; j++) {
                    if (SoNhap % j == 0) {
                        Sum = Sum + j;
                    }
                }
            if (Sum == SoNhap) {
                System.out.format("\n %d la so hoan hao", SoNhap);
            } else {
                System.out.format("\n %d KHONG PHAI so hoan hao", SoNhap);
            }
        }
    }
