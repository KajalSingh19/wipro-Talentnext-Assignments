public class AsmetWipro {

   

     public static void CharValue( char ch)
   {
    if(ch >= 48 && ch <= 57){
        System.out.println("Digit"); 
    }
    else if(ch >= 65 && ch <= 90)
    {
        System.out.println("Alphabet"); 
    }
    else if((ch >= 32 && ch <= 47) || (ch >= 58  && ch  <= 64) || (ch>= 91 && ch <= 96 )|| (ch >= 123 && ch <= 126 ) )
    {
        System.out.println("Special Character"); 
    }
}  
  public static boolean SameLastDigits(int a, int b){
        int lastDigit1  = a%10;
        int lastDigit2 =  b % 10;
        if( lastDigit1 == lastDigit2){
            return true;
        }
        return false;

    }
    public static void main(String args[])
    { 
        
//System.out.println("same unit digits : "+SameLastDigits(6, 35));
CharValue('G');

    }
}
