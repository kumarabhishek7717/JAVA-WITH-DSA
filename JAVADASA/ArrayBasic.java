

public class ArrayBasic {

    public static void main(String[] args) {
        int [] arr = {2,3,4,56,77,44};
        for(int i= 0; i<=arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}  

//Given an array,print negative element only

 
public class ArrayBasic {
    public static void main(String[] args) {
        int arr [] = {4,-2,7,-9,0,-1};
        for(int i = 0; i<=arr.length; i++){
            if (arr[i]<0){
                System.out.print(arr[i]);
            }
        }
        
    }

    
}



public class ArrayBasic {
    public static void main(String args []){
        int arr [] = {4,-2,7,-9,0,-1};
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i]);
            }
        }
    }

    
}   

 
public class ArrayBasic {

    public static void main(String[] args) {
        int [] arr = {1,-3,-5,6,-2};
        int count = 0;
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i] < 0){
                
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println("\nTotal negative numbers: " + count);
    }
} 
public class ArrayBasic {

    public static void main(String[] args) {
        int[] arr = {10, -5, -2, 7};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }

        System.out.println("\nSum of negative numbers: " + sum);
    }
}
