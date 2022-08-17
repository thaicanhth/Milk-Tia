package Chuong6;

import java.util.Scanner;

public class vidu6_16 {
    public static void main(String[] args) {
        String chuoi;
        char KyTu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        // nếu độ dài chuỗi nhập vào còn lớn 80 thì phải nhập lại
        do{
            System.out.println("Nhập vào một chuỗi bất kì:");
            chuoi=scanner.nextLine();
        }while (chuoi.length()>80);
        System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện:");
        KyTu = scanner.next().charAt(0);
        /*
        * đếm và in ra số lần xuất hiện của ký tự đó tong chuỗi
        * duyệt từ đầu đến cuối chuỗi
        * nếu có kí tự nào tại vị trí i bằng với ký tự ch thì tăng biến count lên 1
         */
        for (int i = 0; i< chuoi.length();i++){
            if (KyTu==chuoi.charAt(i));
            {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + KyTu+"trong chuỗi"+chuoi+"="+ count);
    }
}
