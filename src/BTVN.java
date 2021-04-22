import java.util.Scanner;


// BAI 1

public class BTVN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        int max = 0;
        if (b ==0  ) {
            System.out.println(" UCLN la: " + a);
            System.out.println("UCNN la: " +  b);
        }else if(a==0 ){
            System.out.println("UCLN la: " + b);
            System.out.println(" UCNN la: " +a);
        } else if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (max < i)
                        max = i;
                }
            }
        } else if (a == b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0)
                    if (max < i)
                        max = i;
            }
        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (max < i)
                        max = i;
                }
            }
        System.out.println(" UCLN la:" + max);
        System.out.println("UCNN la: " + (a * b) / max);
        }

        // BAI 2


        int[] danhsach = new int[3];
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


        // BAI 3


    int j, SoNhap, Sum = 0 ;
        System.out.println("\n Hay nhap 1 so la: ");
    SoNhap = scanner.nextInt();

        for(j = 1 ; j < SoNhap ; j++) {
        if(SoNhap % j == 0)  {
            Sum = Sum + j;
        }
    }
        if (Sum == SoNhap) {
        System.out.format("\n %d la so hoan hao", SoNhap);
    }
        else {
        System.out.format("\n %d KHONG PHAI so hoan hao", SoNhap);
        }
    }
}
