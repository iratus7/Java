
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HAYATE
 */
public class Erg2Askisi2 {
    public static void main(String args[]) {
        int[] numbers = {10,91,35,23,86};
        for (int i : numbers) {
           System.out.print( i + ",");  
        }
        System.out.println();
        for ( int i = 0; i < numbers.length; i++) {
           System.out.print( numbers[i] + ",");  
        }
        System.out.println();
        for (int i : numbers) {
           if(i%2==0)
            System.out.print( i + ",");  
        }
        System.out.println("to mikos toy pinaka einai: "+numbers.length);
    
        int count = 0;
        for (int i : numbers) {
            while (i != 0) {
                i /= 10;
                ++count;
            }
              
        }System.out.println( "sto array υπαρχουν "+count+ " ψηφία");
        
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("to min einai: "+min+" to max einai: "+max);
    }
}
