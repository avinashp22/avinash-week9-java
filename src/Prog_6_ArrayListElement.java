import java.util.ArrayList;
import java.util.Scanner;

public class Prog_6_ArrayListElement {

    public static void main(String[] args) {
        car(); //call method into main method
    }


    public static void car() {
        ArrayList<String> carBrand = new ArrayList<>(); //create list
        // add names to list
        carBrand.add("Honda");
        carBrand.add("KTM");
        carBrand.add("Harly");
        carBrand.add("Ninja");
        carBrand.add("Kawasaki");

        Scanner scanner = new Scanner(System.in); // start scanner
        System.out.println("Please enter index number :");
        int index = scanner.nextInt();
        if(index < carBrand.size()){
            // System.out.println(carBrand); - print full list
            System.out.println(carBrand.get(index));
        }else {
            System.out.println("Enter valid index number");
        }

    }


}
