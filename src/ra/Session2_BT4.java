package ra;

public class Session2_BT4 {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        while (count < 20) {
            int dem = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    dem = dem + 1;
                }
            }
            if (dem == 1) {
                // là số nguyên tố
                count++;
                System.out.println("Số nguyên tố thứ "+(count)+": " + n);
            }
            n++;
        }
    }
}
