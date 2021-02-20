import java.util.Scanner;

public class MainFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Масть карты : ");
        int suit= s.nextInt();
        Scanner x = new Scanner(System.in);
        System.out.println("Порядковый номер : ");
        int number= x.nextInt();
        switch (suit){
            case 1 :
                System.out.println("пики");
                break;
            case 2 :
                System.out.println("трефы");
                break;
            case 3 :
                System.out.println("бубны");
                break;
            case 4 :
                System.out.println("черви");
                break;
            default:
                System.out.println("не подошло");
        }

                switch (number){
                    case 6 :
                        System.out.println("шестерка");
                        break;
                    case 7 :
                        System.out.println("семерка");
                        break;
                    case 8 :
                        System.out.println("восьмерка");
                        break;
                    case 9 :
                        System.out.println("девятка");
                        break;
                    case 10 :
                        System.out.println("десятка");
                        break;
                    case 11 :
                        System.out.println("валет");
                        break;
                    case 12 :
                        System.out.println("дама");
                        break;
                    case 13 :
                        System.out.println("король");
                        break;
                    case 14 :
                        System.out.println("туз");
                        break;
                    default:
                        System.out.println("не подошло");



                }







        }
    }

