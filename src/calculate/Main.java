
package calculate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Scanner declaration
        Scanner scn = new Scanner(System.in);

        Calculator calculator = new Calculator();
        char c;

        do {
            System.out.println("Enter First Number: ");
            int a = scn.nextInt();
            System.out.println("Enter Second Number: ");
            int b = scn.nextInt();
            System.out.println("Enter symbol to perform calculation : + , - , * , / ");
            char symbol = scn.next().charAt(0);
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you Like to Continue: y for yes, n for no:");
            c = scn.next().charAt(0);

        } while (c == 'y') ;


            scn.close();//close the scanner

        }
    }

