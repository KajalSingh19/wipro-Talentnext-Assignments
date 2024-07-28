import java.util.Scanner;
//Hands on Assignments on FLOW CONTROLS
public class FlowControls1 {
//assign 1(A)
   public static void checkInteger(int no){
    if( no == 0 ){
        System.out.printf("Number  %d is  Zero.\n", no);
    }
    else if(no < 0){
        System.out.printf("Number  %d is Negative.\n", no);
    }
    else{
        System.out.printf("Number  %d is Positive.\n", no);
    }
   }

   //assign 5
     public static void CharValue( char ch)
{
    if(ch >= 48 && ch <= 57){
        System.out.printf("%c is a Digit\n", ch); 
    }
    else if((ch >= 65 && ch <= 90) ||(ch >= 97 && ch <= 122))
    {
        System.out.printf("%c is an Alphabet\n",ch); 
    }
    else if((ch >= 32 && ch <= 47) || (ch >= 58  && ch  <= 64) || (ch>= 91 && ch <= 96 )|| (ch >= 123 && ch <= 126 ) )
    {
        System.out.printf("%c is a Special Character\n", ch); 
    }
}  

   //assign 1(B)
  public static void SameLastDigits(int a, int b){
        int lastDigit1  = a%10;
        int lastDigit2 =  b % 10;
        if( lastDigit1 == lastDigit2){
            System.out.printf("Number  %d and %d has same unit digit. ",a,b);
        }else{
        System.out.printf("Number  %d and %d dont have same unit digit. ",a,b);
        }
    }

   //assign 2
    public static void isEvenOrOdd(int n){
        if((n & 1) == 0){
            System.out.printf("Number  %d is Even", n);
        }
        else{
            System.out.printf("Number %d is Odd", n);
        }
    }
    public static void main(String args[])
    {  Scanner sc = new Scanner(System.in);
     System.out.println("\nEnter any interger to check wheather it is positive, negative or zero : "); // assign 1(A)
        int d = sc.nextInt();
        checkInteger(d);
System.out.println("\nEnter two integers : ");   // assign 1(B)
        int a = sc.nextInt();
        int b = sc.nextInt();
        SameLastDigits(a, b);
System.out.println("\nEnter any interger to check wheather it is even or odd : "); //assign 2
        int c = sc.nextInt();
        isEvenOrOdd(c);
System.out.println("\nEnter any character : ");          // assign 5
        char ch = sc.next().charAt(0);
        CharValue(ch);



sc.close();
    }
}
