import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Name a fruit: ");
        String fruit = input.nextLine();
        switch (fruit) {
            case "Banana":
                System.out.println("Mmm, bananas are the bomb!");
                break;

            case "Pear":
                System.out.println("Pears are pretty tasty!");
                break;

            default:
                System.out.println("I don't like " + fruit);
        }
    }
}
