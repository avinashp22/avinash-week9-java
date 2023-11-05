import java.util.HashMap;
import java.util.Map;

public class Prog_9_HashMapPeople {

    public static void main(String[] args) {
        Prog_9_HashMapPeople obj = new Prog_9_HashMapPeople(); //create object
        obj.people();//call method into main method
    }

    public void people() {
        Map<String, Integer> name = new HashMap<>(); // create map
        //add items to map
        name.put("Amy", 1);
        name.put("John", 2);
        name.put("Tony", 3);
        name.put("Randy", 4);
        name.put("Grace", 5);
        name.put("Italy", 6);

        for (Map.Entry<String, Integer> map : name.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}