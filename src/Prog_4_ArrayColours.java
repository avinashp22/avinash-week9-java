/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
import java.util.ArrayList;

public class Prog_4_ArrayColours {

    public static void main(String[] args)  //main method
        {colours(); }                   //call method into main method

    public static void colours() {

        ArrayList<String> coloursList = new ArrayList<>(); //create list
        //add items to list
        coloursList.add("Red");
        coloursList.add("Yellow");
        coloursList.add("Blue");
        coloursList.add("Green");

        //for each syntax with print statement
    for (  String colour :  coloursList  ){System.out.println(colour);}
    }
}
