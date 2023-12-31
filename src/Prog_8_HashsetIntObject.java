/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else
 */
import java.util.HashSet;
import java.util.Set;

public class Prog_8_HashsetIntObject {

    public static void main(String[] args) {
        Prog_8_HashsetIntObject obj = new Prog_8_HashsetIntObject(); //create object
        obj.hashset(); //call method into main method
    }

    public void hashset()
    {
        // Create a HashSet object called numbers
        Set<Integer> numbers = new HashSet<>();   // create set

        //add items to set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 0; i <= 10; i++)
        {
            if
            (numbers.contains(i))
            {System.out.println(" yes " + i + " is in the set");}
            else
            {System.out.println(" no " + i + " is not in the set");}
        }
    }
}
