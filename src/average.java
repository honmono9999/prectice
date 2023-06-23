import java.util.Scanner;
public class average {
    public static double am(double a,double b){
        return (a+b)/2;
    }
    public static double gm(double a,double b){
        return Math.sqrt(a*b);
    }
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        double c=a.nextDouble();
        double d=b.nextDouble();
        System.out.println("산술평균:"+am(c,d));
        System.out.println("기하평균"+gm(c,d));
    }
}
