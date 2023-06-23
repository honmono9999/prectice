import java.util.Scanner;
public class test3 {
    public static  void main(String[]args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = 1;
        int d = 0;
        int f=1;
        int g=b;
        while (b > 0) {
            d = b;
            while (d > 0) {
                d = d - 1;
                System.out.print(" ");
            }
            b=b-1;
            f=g-b;
            while (f > 0) {
                f=f-1;
                System.out.print("a");
            }
            f=g-b;
            while (f > 0) {
                f=f-1;
                System.out.print("a");
            }
            System.out.println("");
        }
    }
}
