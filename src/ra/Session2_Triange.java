package ra;

public class Session2_Triange {
    public static void main(String[] args) {
        System.out.println("      *      ");
        System.out.println("    * * *    ");
        System.out.println("  * * * * *  ");
        System.out.println("* * * * * * *");
//        1 , 1
//        2 , 3  // y = ax + b
//        3 , 5


        // 0,4 (i,j)  i+j = 4
        // 4,8        j-i = 4
        int h = 7;
        int w = 2*h -1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(i+j>=h-1 && j-i<=h-1) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
