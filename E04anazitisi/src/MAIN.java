
import static java.lang.Integer.parseInt;
import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class MAIN {

    private static Foititis[] pinFoitites;

    public static void main(String args[]) {

        // Ασκηση 3: Δημιουργία αντικειμένων 
        pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(2015, "MAKRIS GIANNIS");
        pinFoitites[1] = new Foititis(2021, "MANOU LOUIZA");
        pinFoitites[2] = new Foititis(2020, "PATSIS STAVROS");
        pinFoitites[3] = new Foititis(2012, "AMELIS TOLIS");
        pinFoitites[4] = new Foititis(2019, "BAKOYRAS TASOS");
        pinFoitites[5] = new Foititis(2018, "SEMOS LAZAROS");
        pinFoitites[6] = new Foititis(2017, "SALTAS DIMITRIS");
        pinFoitites[7] = new Foititis(2017, "NOYSIAS PETROS");
        pinFoitites[8] = new Foititis(2016, "FALIDOU ANNA");
        pinFoitites[9] = new Foititis(2016, "ZAMANI LIA");
        System.out.println("O PINAKAS PINFOITITES : ");
        for (Foititis foit : pinFoitites) {
            System.out.println(foit.toString());
        }
        pinFoitites[5].setHmeromGennisis(convertStrToDate("03/02/2001"));
        pinFoitites[6].setHmeromGennisis(convertStrToDate("03/05/2003"));
        pinFoitites[7].setHmeromGennisis(convertStrToDate("06/06/2002"));
        System.out.println("O PINAKAS PINFOITITES : ");
        for (Foititis foit : pinFoitites) {
            System.out.println(foit.toString());
        }
        // Ασκηση 5: Σειριακή αναζήτηση
        // (1)   Δημιουργία μενού

        int epilogi;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\n\tΜενού");
            System.out.println("1) Αναζήτηση με Επώνυμο");
            System.out.println("2) Αναζήτηση με έτος γέννησης");
            System.out.println("3) Αναζήτηση με ΑΜ (δυαδική)");
            System.out.println("4) Αναζήτηση με ΑΜ (Αναδρομική)");
            System.out.println("0) Εξοδος");
            System.out.print("Επιλογή: ");
            epilogi = sc.nextInt();
            if (epilogi < 0 || epilogi > 4) {
                System.out.println("Λάθος επιλογή");
            }

            switch (epilogi) {
                case 0:
                    break;
                case 1:
                    anazitisiMeEpwnymo();
                case 2:
                    anazitisiMeEtos();
                case 3: {
                    insertSort(pinFoitites);
                    emfanisiFoititwn();
                    binarySearchAm(pinFoitites, 0, pinFoitites.length - 1);
                }
                case 4: {
                    insertSort(pinFoitites);
                    emfanisiFoititwn();
                    System.out.print("\n DWSE AM : ");
        //Scanner sc = new Scanner(System.in, "utf8");
                    int x = sc.nextInt();
                    int result = binarySearchRecursive(pinFoitites, 0, pinFoitites.length - 1, x);

                    // Element present
                    if (result == -1) // Print statement
                    {
                System.out.println("O FOITITIS ME TO AM : "+x+" DEN YPARXEI");
                    } // Element not present
                    else // Print statement
                    {
                        System.out.println("O FOITITIS ME AM " + x + " EXEI TA STOIXEIA");
                                            System.out.println(pinFoitites[result].toString());

                    }

                }
            }

        } while (epilogi != 0);

    }

    public static void emfanisiFoititwn() {
        for (int i = 0; i < pinFoitites.length; i++) {
            System.out.println("AM : " + pinFoitites[i].getAm() + " ONOMA : " + pinFoitites[i].getOnomatEpwnymo() + " ETOS EISAGWGIS : " + pinFoitites[i].getEtosEisagwgis() + " HMEROMINIA GENNISIS : " + pinFoitites[i].getHmeromGennisis());
        }
    }

    public static void anazitisiMeEpwnymo() {
        System.out.print("\n1) Δώσε επώνυμο: ");
        Scanner sc = new Scanner(System.in, "utf8");
        String keyStr = sc.nextLine();
        int count = 0;
        for (Foititis foit : pinFoitites) {
            int i = foit.getOnomatEpwnymo().indexOf(' ');
            if (foit.getOnomatEpwnymo().substring(0, i).equals(keyStr)) {
                System.out.println("O FOITITIS ME TO EPITHETO " + keyStr + " EXEI TA STOIXEIA");
                System.out.println(foit.toString());
                count++;
            }

        }
        if (count == 0) {
            System.out.println("O FOITITIS ME TO EPITHETO : " + keyStr + " DEN YPARXEI");
        }
    }

    public static void anazitisiMeEtos() {
        System.out.print("\n1) DWSE ΗΜΕΡΟΜΗΝΙΑ ΓΕΝΝΗΣΗΣ: ");
        Scanner sc = new Scanner(System.in, "utf8");
        String keyStr = sc.nextLine();
        int count = 0;
        for (Foititis foit : pinFoitites) {
            if (foit.getHmeromGennisis() != null) {
                if (foit.getHmeromGennisis().equals(convertStrToDate(keyStr))) {
                    System.out.println("O FOITITIS ME HMEROMINIA GENNISIS " + keyStr + " EXEI TA STOIXEIA");
                    System.out.println(foit.toString());
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("O FOITITIS ME HMEROMINIA GENNISIS : " + keyStr + " DEN YPARXEI");
        }
    }

    public static void binarySearchAm(Foititis[] arr, int first, int last) {
        {
            System.out.print("\n1) DWSE AM : ");
            Scanner sc = new Scanner(System.in, "utf8");
            int key = sc.nextInt();
            int mid = (first + last) / 2;
            while (first <= last) {
                if (parseInt(arr[mid].getAm()) < key) {
                    first = mid + 1;
                } else if (parseInt(arr[mid].getAm()) == key) {
                    System.out.println("O FOITITIS ME AM : " + key + " EXEI TA STOIXEIA");
                    System.out.println(pinFoitites[mid].toString());

                    //System.out.println("Element is found at index: " + mid);
                    break;
                } else {
                    last = mid - 1;
                }
                mid = (first + last) / 2;
            }
            if (first > last) {
                System.out.println("O FOITITIS ME AM " + key + " DEN YPARXEI");
            }
        }
    }

    private static Date convertStrToDate(String hmeromStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hmerom = null;
        try {
            hmerom = df.parse(hmeromStr);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return hmerom;
    }

    public static void insertSort(Foititis[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Foititis temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getAm().compareTo(temp.getAm()) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    private static int binarySearchRecursive(Foititis[] arr, int l, int r,int x) {
        
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (r >= l && l <= arr.length - 1) {

            int mid = l + (r - l) / 2;

            // If the element is present
            // at the middle itself
            if (parseInt(arr[mid].getAm()) == x) {
                return mid;
            }

            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (parseInt(arr[mid].getAm()) > x) {
                return binarySearchRecursive(arr, l, mid - 1, x);
            }

            // Else the element can only be present
            // in right subarray
            return binarySearchRecursive(arr, mid + 1, r,x);
        }
        // We reach here when element is not present in
        // array
        return -1;
    }
}
