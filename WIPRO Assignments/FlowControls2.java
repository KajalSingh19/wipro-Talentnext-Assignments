import java.util.Scanner;
// Assignments Flow Control
public class FlowControls2 {

    public static void ColorCodes(char ch){
        switch (ch) {
            case 'R':
                System.out.println("The color is Red.");
                break;
            case 'B':
                System.out.println("The color is Blue.");
                break;
            case 'G':
                System.out.println("The color is Green.");
                break;
            case 'W':
                System.out.println("The color is White.");
                break;    
            case 'Y':
                System.out.println("The color is Yellow.");
                break; 
            case 'O':
                System.out.println("The color is Orange.");
                break;                   
            default:
            System.out.println("Not a valid color code...");
                break;
        }
    }
    static int evenPrime = 2;
    public static void isPrime(int n){
         
        if(n == 0 || n ==1 ){
            System.out.printf("%d is not a prime number.\n", n);
            return;
        }
        if(n== evenPrime){
            System.out.printf("%d is a prime number.\n", n);
            return;
        }
        if(n % evenPrime  == 0){
            System.out.printf("%d is not a prime number.\n", n);
            return;
        }
        evenPrime++;
        isPrime(n);
    }

    public static boolean IsPrime(int n){
        if(n < 2){
           // System.out.printf("%d is not a prime number.", n);
           return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                //System.out.printf("%d is not a prime number.", n);
                return false;
            }
        }
       // System.out.printf("%d is  a prime number.", n);
        return true;

    }
    public static void PrimeInRange(int lower, int upper){
for(int i = lower; i < upper; i++){
    if(IsPrime(i)){
        System.out.println(i);
    }
}
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.println("\nEnter a Color Code : ");   // Assign 8
         char chr = sc.nextLine().charAt(0);
         
         ColorCodes(chr);
    
    System.out.println("\nEnter a number : ");      // Assign 12
        int p = sc.nextInt();
        isPrime(p); 
    System.out.println("\nEnter the range to print prime numbers ");   //Assign 11
       int a = sc.nextInt();
       int b = sc.nextInt();
        PrimeInRange(a, b);
        sc.close();
    }
}

   
