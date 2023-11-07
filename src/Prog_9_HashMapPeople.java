/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
import java.util.HashMap;
import java.util.Map;

public class Prog_9_HashMapPeople {

    public static void main(String[] args) {
        Prog_9_HashMapPeople obj = new Prog_9_HashMapPeople(); //create object
        obj.people();//call method into main method
    }

    public void people() {
        Map<String, Integer> people = new HashMap<>(); // create map
        //add items to map
        people.put("Amy", 1);
        people.put("John", 2);
        people.put("Tony", 3);
        people.put("Randy", 4);
        people.put("Grace", 5);
        people.put("Italy", 6);

        for (Map.Entry<String, Integer> map : people.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}