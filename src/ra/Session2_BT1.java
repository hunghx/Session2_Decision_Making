package ra;

import java.util.Scanner;

public class Session2_BT1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // khai báo 2 biến a và b giới hạn khoảng tìm kiếm
        System.out.println("Nhập vào giá trị bắt đầu");
        int a = sc.nextInt();
        System.out.println("Nhập vào giá trị kết thúc");
        int b = sc.nextInt();

        // tính tổng các số chẵn trong khoảng a b
        int sum = 0;
        for (int i = a; i <=b; i++) {
            if(i%2==0){
                // thực hiện tính tổng
                sum = sum+i;
            }
        }
        // hiển thị  kết quả
        System.out.printf("Tổng các số chẵn trong khoảng [%d,%d] là : %d",a,b,sum);
    }
}
