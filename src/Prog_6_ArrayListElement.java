import java.util.ArrayList;
import java.util.Scanner;

public class Prog_6_ArrayListElement {

    public static void main(String[] args) {
        car(); //call method into main method
    }


    public static void car() {
        ArrayList<String> carBrand = new ArrayList<>(); //create list
        // add names to list
        carBrand.add("Ford");
        carBrand.add("Kia");
        carBrand.add("BMW");
        carBrand.add("Audi");
        carBrand.add("Mercedes");

        Scanner scn = new Scanner(System.in); // start scanner
        System.out.println("Please enter index number :");
        int index = scn.nextInt();
        if(index < carBrand.size()){
            // System.out.println(carBrand); - print full list
            System.out.println(carBrand.get(index));
        }else {
            System.out.println("Enter valid index number : ");
        }

    }


}
