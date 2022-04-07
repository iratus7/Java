/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HAYATE
 */
public class Erg2Askisi1 {
     public static void main(String args[]) {
        String s ="Περιφέρεια Κεντρικής Μακεδονίας";
        System.out.println( s.length() );
        for( int i = 0; i < s.length(); i++) {          
            System.out.print( s.charAt(i)+" ");
        }
        System.out.println();
        for( int i = 0; i < s.length(); i++) {          
            System.out.println( s.charAt(i));    
        }
        char[] schar = s.toCharArray();
        
        for (char c : schar) {
           System.out.print( c + "|");  
        }
        System.out.println();
        String[] strArray = s.split(" ");
        for (String str: strArray){
            System.out.println(str+" ");
           }
        for (String str: strArray){
            System.out.print(str+" ");
           }
        System.out.println();
        String artikolexo="";
        for (String str: strArray){
            artikolexo += str.substring(0,2)+".";
            
           }System.out.println(artikolexo+" ");
        strArray[1]="Δυτικής"; 
        for (String str: strArray){
            System.out.print(str+" ");
           }
        System.out.println();

        for (String str: strArray){
            if(str.contains("ικής"))
                System.out.println("η λέξη "+str+" περιέχει <<ικής>>");
            else
                System.out.println("η λέξη "+str+" δέν περιέχει <<ικής>>");
           }
     }
}
