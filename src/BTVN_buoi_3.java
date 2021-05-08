import java.util.Scanner;

public class BTVN_buoi_3 {
        public static void main(String[] args) {
            String chuoi;
            char kytu;
            char i;
            int dem = 0;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập vào chuỗi bất kỳ: ");
                    chuoi = scanner.nextLine();
                    System.out.println("Các ký tự có trong chuỗi là: ");
            for (i = 0; i < chuoi.length(); i++) {
                    kytu = chuoi.charAt(i);
                    System.out.println(kytu);
                    }
            for (i = 'a' & 'A'; i <= 'z'; i++) {
                for (int j = 0; j < chuoi.length() - 1; j++) {
                    if (chuoi.charAt(j) == i) {
                        dem++;
                    }
                }
                if (dem != 0) {
                    System.out.println(i + "=" + dem);
                    dem = 0;
                }
            }
            for (i = 0; i < chuoi.length(); i++) {
                    kytu = chuoi.charAt(chuoi.length() - i - 1);
                if (chuoi.charAt(i) == kytu) {
                    System.out.println(chuoi + " Chuoi nay la Panlydrome");
                }else {
                    System.out.println(chuoi + " Chuoi nay khong la Panlydrome");

                }
            }
        }
    }

