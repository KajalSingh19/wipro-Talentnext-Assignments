import java.util.*;
public class ArrayAssign {


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       int arr[] = {12, 123,34,67,1};

   Arrays.sort(arr);

            System.out.println("Min ele in the array "+ arr[0] );
            System.out.println("Max ele in the array "+arr[arr.length -1]);

sc.close();
    }
}
