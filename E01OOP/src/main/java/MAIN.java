
public class MAIN {
         
    public static void main(String args[]) {
        // Δημιουργία ενός φοιτητή f1
        Foititis f1 = new Foititis("20177", 2020, "Πολυκάρπου Κλέων"); 
        Foititis f2 = new Foititis("20001", 1999, "Πολυκάρπου Κλέων"); 
        Foititis f3 = new Foititis("20002", 1998, "Γεωργίου Αριστέα"); 
        Foititis f4 = new Foititis("20005",0, "Πετρίδου Δανάη");         

        // Προβολή στοιχείων φοιτητή f1
        System.out.println(f1.getAM() + " " + f1.getOnomatEpwnymo());
        System.out.println(f2.getAM() + " " + f2.getOnomatEpwnymo());
        System.out.println(f3.getAM() + " " + f3.getOnomatEpwnymo());
        System.out.println(f4.getAM() + " " + f4.getOnomatEpwnymo());
        
        
       }
}
