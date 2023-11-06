/**
 * 5. Write a Java program to iterate through all elements in an array list using Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Prog_5_ArrayListIterator {

    public static void main(String[] args) {
        Prog_5_ArrayListIterator obj = new Prog_5_ArrayListIterator(); //object creation
        obj.colours();  //call method into main method
    }

    public void colours() {
        ArrayList<String> coloursList = new ArrayList<>(); //create list
        //add items to list
        coloursList.add("Red");
        coloursList.add("Yellow");
        coloursList.add("Blue");
        coloursList.add("Green");

        //iteration function with while loop and print statement
        Iterator itr = coloursList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
