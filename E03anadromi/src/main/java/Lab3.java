
import java.util.InputMismatchException;
import java.util.Scanner;

class lab3
{
    public static void main(String[] args)
    {
     ///////////epilogi menu
        int selectedMenu;   
        Scanner aScanner = new Scanner(System.in);        
        do {
        try {
            System.out.println("1=Παραγοντικό,\n" + "2=Ακολουθία Fibonacci,\n" +"3=Παλίνδρομο,\n" +"4=Πρώτοι αριθμοί,\n" +"5=Πύργοι του Ανόϊ,\n" +"0=Εξοδος\n" +"ΔΩΣΕ ΑΡΙΘΜΟ:");
            selectedMenu = aScanner.nextInt();
            if(selectedMenu < 0 || selectedMenu > 5) {
                System.out.println("Input out of range \"" + selectedMenu + "\". Input..");
            }
        } catch(InputMismatchException e) {
            System.out.println("Catch blok begin.");
            System.out.println("Invalid input, please input a number between 0-5.");
            aScanner.nextLine();
            selectedMenu = 0;
        } 

        int input; 
        switch (selectedMenu) {
        case 0:
            break;
        case 1:
            System.out.println("Dwse arithmo gia paragotniko : ");
            input = aScanner.nextInt();
            System.out.println("To paragontiko tou "+input+" Einai : "+fact(input));
            break;
        case 2:
            System.out.println("Dwse arithmo gia fobonacci : ");
            input = aScanner.nextInt();
            System.out.println("O arithmos fobonacci tou "+input+" Einai : "+fibo(input));   
            break;
        case 3:
            int pallidromos;
        do
        {
            System.out.println("Dose arithmo gia palidromo");
            pallidromos = UserInput.getInteger();
        }
        while(pallidromos < 0 || pallidromos > 99999);
        int result = palindrome(pallidromos);
        System.out.println(pallidromos == result ? "Pallidromos" : "Mh Pallidromos");            
            break;
        case 4:
            System.out.println("Dose arithmo gia elegxo prime");
            int n = UserInput.getInteger();
            if (isPrime(n, 2))
            System.out.println("Yes "+n+" is prime");
        else
            System.out.println("No "+n+" is not prime");
            break;
        case 5:
            System.out.println("Dose arithmo twn diskwn gia tous purgous Hanoi");
            int m = UserInput.getInteger();// Number of disks             
            towerOfHanoi(m, 'A', 'C', 'B'); // A, B and C are names of rods
            break;       
        default:
            System.out.println("Dwse enan arithmo gia paragotniko : ");
        }
        
    } while(selectedMenu != 0);

        ///////////anadromi  
        
        
        
        
        
        

        
    }

    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }

    public static int fibo(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    static int parInt = 0;

    public static int palindrome(int n)
    {
        if(n > 0)
        {
            parInt = (parInt * 10) + (n % 10);
            palindrome(n / 10);
        }

        return parInt;
    }
    static boolean isPrime(int n, int i)
    {
 
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
      
        // Check for next divisor
        return isPrime(n, i + 1);
    }
    
    static void towerOfHanoi(int n, char from_rod,
                    char to_rod, char aux_rod)
{
    if (n == 0)
    {
        return;
    }
    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    System.out.println("Move disk "+ n + " from rod " +
                       from_rod +" to rod " + to_rod );
    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}
}