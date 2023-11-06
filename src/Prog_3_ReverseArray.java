/**
 * 3. Write a Java program to reverse an array of integer values
 */
import java.util.Arrays;

public class Prog_3_ReverseArray {

    public static void main(String[] args) {
        reverse();  //call method into main method
    }


    public static void reverse () {

        int a [] = {1,2,3,4,5,6,7,8,9,10}; //create array and add items to array
        System.out.println("Original array" + Arrays.toString(a));

        System.out.println("Array in Reverse order");

        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]+ " ");
        }
    }
}
