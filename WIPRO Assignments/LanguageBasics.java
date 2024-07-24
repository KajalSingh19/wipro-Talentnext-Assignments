public class LanguageBasics {

    public static void SumOfArguments(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);  
    }
    public static void main(String[] args) {
        //Assignment 3
       try{
        if(args[0].charAt(0)  >= 48 && args[0].charAt(0) <= 57 )
        {
            
              SumOfArguments(args);
            return ;
        } 
      if(args.length == 0){
        System.out.println("No Values is entered");
    }
        else if(args.length == 2)
        System.out.println(args[0]+" Technologies "+ args[1]); //Assign 1
     
        else if(args.length == 1){
            System.out.println("Welcome "+ args[0]);//Assign 2
      }    } 
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Enter value on the command line");
      }
       }
}
