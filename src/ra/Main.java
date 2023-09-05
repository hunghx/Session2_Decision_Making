package ra;

public class Main {
    public static void main(String[] args) {
        // Cú pháp if

        boolean check = 4 % 2 == 0; // kiểm tra xem 5 có chia hết cho 2 không
//        if(check){
//            // thực thi câu lệnh khi biểu thức điều kiện đúng
//            System.out.println("Thực thi biểu thức trong if");
//        }

        // cú pháp if ... else

        if(false){
            // thực thi khối lệnh nếu điều kiện đúng
            System.out.println("Thực thi khối code trong if");
        }else {
            // thực thi khối lệnh nếu điều kiện sai
            System.out.println("Thực thi khối code trong else");

        }

        // if else lồng nhau và if else bậc thang
        // if else lồng nhau
        // Bài toán ứng dụng , kiểm tra xem 1 số có chia hết cho 2,3 không
        int number = 10;
        if(number%2==0){
            // số đó chia hết cho 2
            if(number%3==0){
                // chia hết cho 3 và chia hết cho 2
                System.out.println("Vừa chia hết cho 2 vừa chia hết cho 3");
            }else {
                // không chia hết cho 3 nhưng vẫn chia hết cho 2
                System.out.println("chia hết cho 2 nhưng không chia hết cho 3");
            }
        }else {
            // không chia hết cho 2
            if (number%3==0){
                // chia hết cho 3
                System.out.println("Không chia hết cho 2 nhưng chia hết cho 3");
            }else {
                // không chia hết cho 3
                System.out.println("Vừa không chia hết cho 2 lại vừa không chia hết cho 3");
            }
        }
        // if else bậc thang
        if (number%2==0 && number%3==0){
            System.out.println("Vừa chia hết cho 2 vừa chia hết cho 3");
        }else if (number%2==0 && number%3!=0){
            System.out.println(" chia hết cho 2 nhưng không chia hết cho 3");
        } else if (number%2!=0 && number%3==0) {
            System.out.println("không chia hết cho 2 nhưng lại chia hết cho 3");
        }else {
            System.out.println("Vừa không chia hết cho 2 vừa không chia hết cho 3");
        }
        // ví dụ đánh giá điểm trung bình
        float diem = 8.0f;
        if(diem<5){
            // yếu
        }else if (diem<6.5){
            // trung binh
        }else if(diem<8){
            // khá
        }else{
            // giỏi
            System.out.println("Giỏi");
        }
        // bài toán số dư khi chia cho 3
        // Cú pháp switch case : so sánh giá trị  (==)
        int n = 27;
        switch (n%3){
            case 0:
                System.out.println(n+" chia hết cho 3");
                break;
            case 1:
                System.out.println(n+" chia 3 dư 1");
                break;
            case 2:
                System.out.println(n+" chia 3 dư 2");
                break;
        }
    }
}
