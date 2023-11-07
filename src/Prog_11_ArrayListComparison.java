/**
 * 11.	Declare following two arraylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1
 * .add("Red");
 * c1
 * .add("Green");
 * c1
 * .add("Black");
 * c1
 * .add("White");
 * c1
 * .add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2
 * .add("Red");
 * c2
 * .add("Green");
 * c2
 * .add("Black");
 * c2
 * .add("Pink");
 */import java.util.ArrayList;

public class Prog_11_ArrayListComparison {

    public class Programme_11_ArrayListComparison {
        public static void main(String[] args) {

            compareArrayList();// calling method to main method directly
        }

        public static void compareArrayList() {
            ArrayList<String> c1 = new ArrayList<String>();
            c1.add("Red");
            c1.add("Green");
            c1.add("Black");
            c1.add("White");
            c1.add("Pink");

            ArrayList<String> c2 = new ArrayList<String>();
            c2.add("Red");
            c2.add("Green");
            c2.add("Black");
            c2.add("Pink");

            // using if else statement to compare
            if (c1.equals(c2)) {
                System.out.println("The ArrayList are equal");
            } else {
                System.out.println("The ArrayList are not equal");
            }
        }
    }



}
