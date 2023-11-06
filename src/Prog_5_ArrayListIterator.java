import java.util.ArrayList;
import java.util.Iterator;

public class Prog_5_ArrayListIterator {

    public static void main(String[] args) {
Prog_5_ArrayListIterator obj = new Prog_5_ArrayListIterator();
obj.colours();  //call method into main method
        }

    public void colours() {
        ArrayList<String> coloursList = new ArrayList<>(); //create list
        //add items to list
        coloursList.add("Red");
        coloursList.add("Yellow");
        coloursList.add("Blue");
        coloursList.add("Green");
        //Iteration Function
        Iterator itr = coloursList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }



}
