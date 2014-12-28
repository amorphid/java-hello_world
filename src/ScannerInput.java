import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type something: ");
        String line = input.nextLine();
        System.out.println("You typed " + line);
    }
}
