public class ForLoop {
    public static void main(String[] args) {
        int[] anArray = { 1,2,3,4,5,6,7,8,9,10 };

        for (int i = 0; i < 10; i += 1 ) {
            System.out.printf("The value of anArray[i] is %d\n", anArray[i]);
        }
    }
}