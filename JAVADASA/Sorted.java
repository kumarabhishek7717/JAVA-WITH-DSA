
import java.util.Arrays;
 
public class Sorted  {

    public static void main(String[] args) {
       int arr [] = {10,50,20,30,40};
       boolean found = true;

       for(int i = 0 ; i<arr.length-1; i++){
        if (arr[i] > arr[i+1]){
            found= false;

        }
       }
       System.out.print(found);
    }
    
}

 
public class Sorted {
    public static void main(String[] args) {

    int arr [] = {10,20,30,40,59};

    boolean found = true;

    for(int i =0 ; i< arr.length-1; i++){
        if (arr[i] > arr[i+1]){
            found = false;
             

        }
        
    }
     System.out.print(found);
  

} 
}



public class Sorted {

    public static void main(String[] args) {
        int arr [] = {-2,-1,3,6,5,-6,-5,8};

        Arrays.sort(arr);

        for (int ele : arr) {
            System.out.print(ele+ " ");
            
        }
               

            }
        }


        public class Sorted {

            public static void main(String [] args){

            

            int arr [] = {20,30,50,30,10,50,-1};

            Arrays.sort(arr);

            for (int ele : arr) {
                System.out.print(ele+ " ");
                
            }
        
        } 
        }
            
        


