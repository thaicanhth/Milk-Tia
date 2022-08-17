package Chuong4;
/*
Mảng một chiều trong ngôn ngữ java
- Định nghĩa, đặt điểm
- Khai bao, khởi tạo
- Gía trị mặc định của từng kiểu mảng
- Lấy số phần tử của mảng hiện thời
- Truy suất thông tin các phần tử của mảng
** Chi so phan tu trong mang: 0 -> length-1
 */
public class Video1 {
    public Video1() {
        super();
    }

    public static void main(String[] args) {
       int[] arr = new int[10];
        arr[0] = 100;
        arr[1] = 200;
        arr[9] = -999;


        int x = arr[1];
        int n = arr.length;


        System.out.println(x);
//            for (int i = 0; i<= n; i++){
//            System.out.print(arr[i] + " ");
//            if (i % 20 == 0){
//              System.out.println();
//            }
//        }
        //int[] b = arr;
        // tao mang nguyen arr có khả năng luu tru 10 ptu
    }
}
