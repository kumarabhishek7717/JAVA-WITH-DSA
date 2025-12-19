 
public class SumofArray {
    public static void main(String[] args) {
        int arr [] = {2, 4, 6, 7, 8, 9};
         int sum = 0;
         for(int i = 0; i<arr.length;i++){
             sum += arr[i];
         }
          System.out.println(sum);
       
    }
     
} 

public class Arrayproduct {
    public static void main(String[] args) {
        int arr [] = {2, 4, 5, 6, 7};
        int mul = 1;
        for(int i = 0; i<arr.length; i++){
            mul *= arr[i];

        }
        System.out.print(mul);
    }

   

    
} 
 
public class Maximum {
    public static void main(String[] args) {
        int arr [] = {3, 4, 9, 5, 6, 7,8};
        int max = arr[0];

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];     
            }  
        }
         System.out.print(max);  
    }  
} 

public class Minimumarray {
    public static void main(String[] args) {
        int arr [] = {4,2,3,4,5,6};
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }

    
}