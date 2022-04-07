import java.text.*;
import java.util.Date;
import java.util.Scanner;


public class MAIN {
   
    static Foititis [] pinFoitites;
    
    public static void main(String args[]) {
        
        // Ασκηση 2.β: Δημιουργία αντικειμένων 
        pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis("12872","Γάλλος", 18, "6995557625");
        pinFoitites[1] = new Foititis("12435","Παπουτσής", 18, "6995056625");
        pinFoitites[2] = new Foititis("12865","Νούνης", 18, "6995559625");
        pinFoitites[3] = new Foititis("12765","Κόβες", 21, "6995558625");
        pinFoitites[4] = new Foititis("12551","Παπου", 19, "6995576625");
        pinFoitites[5] = new Foititis("12552","Νού", 21, "6995566625");
        pinFoitites[6] = new Foititis("12553","Αες", 18, "6995456625");
        pinFoitites[7] = new Foititis("12558","Λος", 18, "6995356625");
        pinFoitites[8] = new Foititis("12557","Παπτσής", 22, "6995256625");
        pinFoitites[9] = new Foititis("12556","Νούς", 21, "6995156625");
        
        // Ασκηση 4
        emfanisiFoititwn();
        SortingMethods.bubbleSort(pinFoitites);
        System.out.println("bublesorting : ");
        emfanisiFoititwn();
        System.out.println("emfanisi me toString");
        for (Foititis foit:pinFoitites)
        {
            System.out.println(foit.toString());
        }
        System.out.println("insert Sortimg by mobile: ");
        SortingMethods.insertSort(pinFoitites);
        emfanisiFoititwn();
        System.out.println("Selection Sortimg by MO: ");

        SortingMethods.selectionSort(pinFoitites);
        for (Foititis foit:pinFoitites)
        {
            System.out.println(foit.toString());
        }
        
    }   
       
    public static void emfanisiFoititwn() {
        for (int i=0; i<pinFoitites.length; i++ )
            System.out.println(pinFoitites[i]);            
    }
        
}
