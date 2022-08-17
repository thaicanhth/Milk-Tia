package Chuong4;

import java.util.Scanner;

public class Vidu4_5 {
    public static void main(String[] args) {
        int soDong, soCot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        //Khai báo và cấp phát bộ nhớ cho mảng
        int[][] A = new int[soDong][soCot];

        // Để nhập giá trị các phần tử cho mảng
        // chúng ta sẻ sử dụng hai vòng lập for
        // vòng lập bên ngoài sẻ duyệt i từ 0 đến soDong - 1
        // và vòng lập for bên trong sẻ duyệt j từ 0 đến soCot - 1
        // Mỗi lần như vậy thì sẻ nhập vào phần tử tại vị trí i , j
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" +i+ ", " +j+ "]: "); A[i][j] = scanner.nextInt();
            } }
        // hiển thị các phần tử trong mảng vừa nhập
        // chúng ta cũng sử dụng 2 vòng lập for như khi nhập
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) { System.out.print(A[i][j] + "\t");}
            System.out.println("\n"); } }
}

