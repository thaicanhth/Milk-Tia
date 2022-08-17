package Chuong4;
import java.util.Scanner;
public class Baitapmang_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] < 1) {
                continue;
            }
            if (arr[i] == 2) {
                System.out.print(arr[i] + " ");
            }
            if(arr[i] > 2) {
                boolean check = true;
                for(int j = 2; j < arr[i]; j++) {
                    if(arr[i] % j == 0) {
                        check = false;
                    }
                }
                if(check) {
                    System.out.print(arr[i] + " ");
                }

            }

        }

    }
}
