package ra;

import java.util.Scanner;

public class Session2_BT7 {
    public static void main(String[] args) {
        // khai báo máy nhập
        Scanner sc = new Scanner(System.in);
        // khai báo biến choice
        double chuVi;
        double dienTich;
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật .\n" +
                    "2. Tính chu vi và diện tích hình tam giác\n" +
                    "3. Tính chu vi và diện tích hình tròn.\n" +
                    "4. Thoát");
            // yêu cầu người dùng nhập vào lựa chọn
            System.out.println("Vui lòng nhập lựa chọn 1-4");
            choice = sc.nextInt();
            // tiến hành so sánh giá tị nhập vào
            switch (choice) {
                case 1:
                    // hình chữ nhật
                    // khai báo các giá trị cần thiết yêu cầu người dùng nhập vaof
                    System.out.println("Hãy nhập chiều dài hình chữ nhật");
                    double cd = sc.nextDouble();
                    System.out.println("Hãy nhập chiều rộng hình chữ nhật");
                    double cr = sc.nextDouble();
                    // tính diện tích và chu vi
                    chuVi = 2 * (cd + cr);
                    dienTich = cd * cr;
                    // in kết quả
                    System.out.println("Chu vi HÌnh chữ nhật là : "+chuVi);
                    System.out.println("Diện tích HÌnh chữ nhật là : "+dienTich);
                    break;
                case 2:
                    // hình tam giác
                    // khai báo các giá trị cần thiết yêu cầu người dùng nhập vao
                    System.out.println("Hãy nhập cạnh a =");
                    double a = sc.nextDouble();
                    System.out.println("Hãy nhập cạnh b =");
                    double b = sc.nextDouble();
                    System.out.println("Hãy nhập cạnh c =");
                    double c = sc.nextDouble();
                    // tính diện tích và chu vi
                    chuVi = a+b+c;
                    double p = chuVi/2;
                    dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    // in kết quả
                    System.out.println("Chu vi hình tam giac là : "+chuVi);
                    System.out.println("Diện tích hình tâm giác là : "+dienTich);
                    break;
                case 3:
                    // hình tròn
                    // khai báo các giá trị cần thiết yêu cầu người dùng nhập vao
                    System.out.println("Hãy nhập bán kính của hình tròn");
                    double radius = sc.nextDouble();
                    // tính diện tích và chu vi
                    chuVi = 2*Math.PI*radius;
                    dienTich = Math.PI*Math.pow(radius,2);
                    // in kết quả
                    System.out.println("Chu vi hình tròn là : "+chuVi);
                    System.out.println("Diện tích hình tròn là : "+dienTich);
                    break;
                case 4:
                    // thoát
                    System.out.println("Thoát chương trình !");
                    break;
                default:
                    System.err.println("Số bạn nhập không hợp lệ , vui lòng nhập lại");
            }
        }
    }
}
