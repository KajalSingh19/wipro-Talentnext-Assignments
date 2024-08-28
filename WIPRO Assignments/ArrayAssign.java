import java.util.*;
public class ArrayAssign {

public static void findElement(int[]  arr, int key){
    boolean found = false;
    for(int i = 0; i < arr.length; i++){
    
        if(arr[i] == key){
            found = true;
            System.out.println(i);
            break;
        }
        
    }
    if(!found){
        System.out.println("-1");

    }
}

public static void NoDuplicate(int[] arr){
    List<Integer> distinctArr = new ArrayList<>() ;
    for(int ele : arr){
        if( !distinctArr.contains(ele)){
            distinctArr.add(ele);
        }
    }
    System.out.println(Arrays.toString(distinctArr.toArray()));
}

    public static void  evenOdd(int[] arr){
    int countE = 0; 
    int countO = arr.length -1;
    int[] array = new int[arr.length];
    for(int j = 0; j < arr.length; j++){
        if(arr[j] % 2 == 0){
           array[countE] = arr[j];
           countE++;
        }
        else{
            array[countO] = arr[j];
            countO--;
        }
    }
    for(int i = 0; i < array.length; i++)
    System.out.print(array[i] + "  ");
}
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       int arr[] = {12, 123,34,67,1,1,34};
        //Assign 3
System.out.println("the index of the element to be found is ");  
  findElement(arr, 12);

        //Assign 7
  NoDuplicate(arr);
        
///Assign 10
        int[] arr1 = {3,3,2,1,0};
evenOdd(arr1);
             

             ///Assign 2
        Arrays.sort(arr);
             System.out.println("Min ele in the array "+ arr[0] );
            System.out.println("Max ele in the array "+arr[arr.length -1]);

            
  
  
sc.close();
    }
}
