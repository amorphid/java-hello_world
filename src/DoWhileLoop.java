import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number:");
            number = scanner.nextInt();
        } while (number != 5);

        System.out.println("You finally entered 5!");
    }
}
