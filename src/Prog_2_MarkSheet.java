/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between, 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between, 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________
 * Write programme with if else and while loop.
 */
import java.util.Scanner;

public class Prog_2_MarkSheet {

    public static void main(String[] args) {    //main method
        Scanner scn = new Scanner(System.in);  //scanner declaration

        char calculate = 'y';
        while (calculate == 'y')
        {
            System.out.println("Enter Student Name: ");
            String studentName = scn.nextLine();
            System.out.println("Enter Roll Number: ");
            int rollNumber = scn.nextInt();
            System.out.println("Enter Maths Marks: ");
            double mathsMarks = scn.nextDouble();
            System.out.println("Enter Science Marks: ");
            double scienceMarks = scn.nextDouble();
            System.out.println("Enter English Marks: ");
            double englishMarks = scn.nextDouble();

            results(studentName,rollNumber, mathsMarks, scienceMarks, englishMarks );
            System.out.println("Do you want to enter data for another student? (y/n only):  ");
            calculate = scn.next().charAt(0);
            scn.nextLine();
        }
        System.out.println("Thank you, Goodbye");
        scn.close(); // close the scanner

    }


    public static void results(String studentName, int rollNumber, double Math, double Science, double English  ) {
        if (Math < 0 || Math > 100 || Science < 0 || Science > 100 || English < 0 || English > 100) {
            System.out.println("Invalid input, Marks should between 0 and 100"); // print a statement if input is invalid
        } else {
            //calculate results
            double totalMarks = Math + Science + English;
            double percentage = (totalMarks / 300) * 100;
            String result = (percentage >= 35 && Math >= 35 && Science >= 35 && English >= 35) ? "Pass" : "Fail"; // used ternary operator

            //calculate grade
            String Grade = "-";
            if (Math >= 35 && Science >= 35 && English >= 35) {
                if (percentage <= 100 && percentage >= 80) {
                    Grade = "A+";
                } else if (percentage < 80 && percentage >= 60) {
                    Grade = "A";
                } else if (percentage < 60 && percentage >= 50) {
                    Grade = "B";
                } else if (percentage < 50 && percentage >= 35) {
                    Grade = "C";
                } else {
                    Grade = "Fail";
                }

                System.out.println("Pass");
                System.out.println("Percentage: " + percentage);
                System.out.println("Grade: " + Grade);
            } else {
                System.out.println("Fail");
            }

            //print statement for mark sheet
            System.out.println(" ______________________________");
            System.out.println("|                               |");
            System.out.println("|            Mark Sheet         |");
            System.out.println("|_______________________________|");
            System.out.println("|   Name      : " + studentName + "         |");
            System.out.println("|   Roll No.  : " + rollNumber + "             |");
            System.out.println("|_______________________________|");
            System.out.println("|   Subjects  :  Marks          |");
            System.out.println("|_______________________________|");
            System.out.println("|   Math      : " + Math + "          |");
            System.out.println("|   Science   : " + Science + "          |");
            System.out.println("|   English   : " + English + "          |");
            System.out.println("|_______________________________|");
            System.out.println("|    Total : " + totalMarks + "             | ");
            System.out.println("|________________________________|");
            System.out.println("|    Percentage  :" + percentage +  "|");
            System.out.println("|    Result      :" + result + "          |");
            System.out.println("|    Grade       : " + Grade + "             |");
            System.out.println("|_______________________________|");

        }
    }
}




