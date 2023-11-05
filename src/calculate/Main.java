
package calculate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char ch;
        Calculator calculator = new Calculator();
            do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter First number: ");
            int a = scanner.nextInt();
            System.out.print("Enter Second number: ");
            int b = scanner.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Please enter one of symbol +,-,*,/: ");
            String str = scanner2.nextLine();

            char symbol = str.charAt(0); // Converting string to char

            calculator.calculateResult(a, b, symbol);
            System.out.print("Would you like to do more calculation please enter \"y\" or \"n\": ");
            String str1 = scanner2.nextLine();
            ch = str1.charAt(0);

        } while (ch == 'y');
    }
}