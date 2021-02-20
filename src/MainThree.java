import java.util.Scanner;

public class MainThree {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("a= ");
        int a = s.nextInt();
        Scanner x = new Scanner(System.in);
        System.out.println("b= ");
        int b = x.nextInt();
        Scanner g = new Scanner(System.in);
        System.out.println("c= ");
        int c = g.nextInt();
        if ((a - b) * (c - a) >= 0) {
            System.out.print(a);
        } else if ((b - a) * (c - b) >= 0) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }
}