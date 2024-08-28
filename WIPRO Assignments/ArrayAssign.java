import java.util.*;
public class ArrayAssign {

public static void findElement(int[]  arr, int key){    //Assign 3
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == key){
            System.out.println(i);
            break;
            
        }
        else {
            System.out.println("-1");
        }
    }
}
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       int arr[] = {12, 123,34,67,1};

        //Assign 2
             Arrays.sort(arr);
             System.out.println("Min ele in the array "+ arr[0] );
            System.out.println("Max ele in the array "+arr[arr.length -1]);

            
  System.out.println("the index of the element to be found is ");  
  findElement(arr, 12);          
sc.close();
    }
}

