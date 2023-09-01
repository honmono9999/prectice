import java.util.Scanner;
//아잉
public class Test3 {
    public static  void main(String[]args) {
        Scanner awesome = new Scanner(System.in);
        /*
        awesome은 사용자 입력값
        b는 사용자의 입력값을 정수로 변환
        c는 밑에 만들때 쓰는놈
        d는 버퍼
        f도 버퍼
        g는 다야모양을 만들기 위해 대칭

         */
        int b = awesome.nextInt();
        int c = b;
        int d = 0;
        int f=0;
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
