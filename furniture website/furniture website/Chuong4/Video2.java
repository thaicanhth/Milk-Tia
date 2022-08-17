package Chuong4;
/*
Khoi tao cac phan tu trong mang
 */
public class Video2 {
    public Video2() {
        super();
    }

    public static void main(String[] args) {
    //    cach 1
    //    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2,-99};
    //    int len = arr.length;
    //    cach 2
        int[] arr = new int[]{1,3,4,99,5,6,7,8,9,0};
        int len = arr.length;
    //  cach 3
        int[] b = new int[20];
        for (int i = 0; i < b.length; i++) {
           b[i] = 199;
        }
        for (int i: b){
            System.out.print(i+" ");
        }

    }
}
