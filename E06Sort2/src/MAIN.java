import java.text.*;
import java.util.Date;
import java.util.Scanner;


public class MAIN {
   
    static Foititis [] pinFoitites;
    
    public static void main(String args[]) {
        
        // Ασκηση 2.β: Δημιουργία αντικειμένων 
        pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis("12872","Γάλλος", 2018, "6995557625");
        pinFoitites[1] = new Foititis("12435","Παπουτσής", 2018, "6995056625");
        pinFoitites[2] = new Foititis("12865","Νούνης", 2018, "6995559625");
        pinFoitites[3] = new Foititis("12765","Κόβες", 2021, "6995558625");
        pinFoitites[4] = new Foititis("12551","Παπου", 2019, "6995576625");
        pinFoitites[5] = new Foititis("12552","Νού", 2021, "6995566625");
        pinFoitites[6] = new Foititis("12553","Αες", 2018, "6995456625");
        pinFoitites[7] = new Foititis("12558","Λος", 2018, "6995356625");
        pinFoitites[8] = new Foititis("12557","Παπτσής", 2022, "6995256625");
        pinFoitites[9] = new Foititis("12556","Νούς", 2021, "6995156625");
        printWithGetters();
        ////////////Sorting Quicksort
        System.out.println("QuickSorting by etos eisagwgis: ");        
        int n = pinFoitites.length;     
        QuickSorting.quickSort(pinFoitites, 0, n - 1); 
        printWithGetters();
        /////////Sorting Merge sort
        System.out.println("Merge Sorting by name: ");
        MergerSort.mergeSort(pinFoitites);        
        printWithGetters();  
    }   
       
    public static void emfanisiFoititwn() {
        for (int i=0; i<pinFoitites.length; i++ )
            System.out.println(pinFoitites[i]);            
    }
    public static void printWithGetters(){
    for (Foititis foit:pinFoitites)
        {
            System.out.println("AM : "+foit.getAm()+", ONOMA : "+foit.getOnomatEpwnymo()+", Date Birth : "+foit.gethmeromGennisis()+", etos eisagwgis : "+foit.getEtosEisagwgis()+", Phone : "+foit.getMobile()+", MO : "+foit.getMo());
        }
    }
}
