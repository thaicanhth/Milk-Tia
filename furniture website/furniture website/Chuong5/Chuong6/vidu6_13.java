package Chuong6;

public class vidu6_13 {
    public static void main(String[] args) {
        String string1 = new String("Happy new year!");
        // kí tự thay thế 'l'không có trong chuỗi sting1
        System.out.println(string1.replace('l','r'));
        // thay thế kí tự 'y' trong string1 thành'r'
        System.out.println("Chuỗi sau khi thay thế là " +string1.replace('y','r'));
    }
}
