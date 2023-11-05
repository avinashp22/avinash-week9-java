import java.util.ArrayList;

public class Prog_4_ArrayColours {


    public static void main(String[] args) {
colours();  //call method into main method
    }


    public static void colours() {

        ArrayList<String> coloursList = new ArrayList<>(); //create list
        //add items to list
        coloursList.add("Red");
        coloursList.add("Yellow");
        coloursList.add("Blue");
        coloursList.add("Green");
    for (  String colour :  coloursList  ){System.out.println(colour);}

    }

}
