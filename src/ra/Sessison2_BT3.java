package ra;

public class Sessison2_BT3 {
    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {
            // viết thuật toans kiểm tra số nguyên tố
            int dem = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    dem = dem + 1;
                }
            }
            if (dem == 1) {
                // là số nguyên tố
                System.out.println("Số nguyên tố : " + n);
            }
        }

    }
}
