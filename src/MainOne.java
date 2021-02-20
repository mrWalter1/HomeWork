import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("R1= ");
        int R1 = s.nextInt();
        Scanner x = new Scanner(System.in);
        System.out.println("R2= ");
        int R2 = x.nextInt();
        if (R1<R2){
            System.out.println("Неверно");
        }
        int S1 = (int) ((R1 * R1) * Math.PI);
        int S2 = (int) ((R2 * R2) * Math.PI);
        int S3 = S1 - S2;

        System.out.println("S1= "+S1);
        System.out.println("S2= "+S2);
        System.out.println("S3= "+S3);



    }
}



