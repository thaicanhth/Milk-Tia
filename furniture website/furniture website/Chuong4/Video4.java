package Chuong4;
import java.util.Arrays;

/*
Mảng hai chiều trong java:
1 Định nghĩa, khai báo, khởi tạo
2 Truy suất phần tử mảng
3 Sử dụng for each với mảng hai chiều
4 Mảng zigzag
 */
public class Video4 {
    public Video4() {
        super();
    }

    public static void main(String[] args) {
        // tổng quát kiểu[][] tên mảng;
        int[][] arr = new int[4][3];
        /* chi so bat ki:0 -> length-1*/
        arr[0][0] = 100;
        arr[0][1] = 200;
        arr[arr.length-1][arr[0].length-1] = -999;
        boolean[][] booleans = new boolean[9][9];

        String[][] strings = new String[2][3];

        int[][] arr2 = /* new int[][] */{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {0, 1, 9, 8}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i+j;
            }
        }
        for (int i = 0; i < arr.length; i++){ // arr.length: so hang
            for (int j = 0; j < arr[0].length; j++){// arr[0].length: so cot
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}