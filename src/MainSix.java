public class MainSix {
    public static void main(String[] args) {
        System.out.println((MainSix.pow(2, 16))-(MainSix.pow(2,4))+(MainSix.pow(2,2))-2);
    }

    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
