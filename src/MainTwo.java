import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("x = ");
        int x= s.nextInt();
        int a;
        int b;
        int c;
        int p;
        a=x/100;
        b=(x/10)%10;
        c=x%10;
        p=b*100+a*10+c;
        System.out.println("Ответ"+p);

    }
}
