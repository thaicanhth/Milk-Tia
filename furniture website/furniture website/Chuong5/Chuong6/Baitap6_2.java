package Chuong6;

import java.util.Scanner;

public class Baitap6_2 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);

        // n còn nhỏ hơn 0 thì còn nhập lại
        do {
            System.out.println("Mời bạn nhập vào số n: ");
            n = scanner.nextInt();
        } while (n < 0);

        /*
         * tính giá trị của biểu thức
         * i còn nhỏ hơn n thì còn thực hiện thân vòng lặp
         */
        for (int i = 0; i <= n; i++) {
            sum += (2 * i + 1); // sum = sum + (2 * i + 1)
        }
        System.out.println("Tổng = " + sum);
    }
}




