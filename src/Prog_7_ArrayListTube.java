/**
 * 7. Write a Java program to test if an array list is empty or not
 */
import java.util.ArrayList;

public class Prog_7_ArrayListTube {

    public static void main(String[] args) {
       Prog_7_ArrayListTube obj = new Prog_7_ArrayListTube();
       obj.tube();
    }

    public void tube() {
        //create list
        ArrayList<String> name=new ArrayList<>();
        // add names to list
        name.add("Alperton");
        name.add("Oxford Circus");
        name.add("Wembley Central");
        name.add("Sudbury Town");
        name.add("Hammersmith");

        //Checking list is not empty
        System.out.println(" Is this list empty? " + name.isEmpty());



        //Declare empty list
        ArrayList<String> name2=new ArrayList<>();
        //Checking list is empty
        System.out.println(" Is this list empty? " + name2.isEmpty() );
    }
}
