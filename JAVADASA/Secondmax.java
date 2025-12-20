
 
public class Secondmax {
    public static void main(String[] args) {
        int arr [] = {4, 10, 10, 6, 3, 8};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }

        for(int i = 0 ; i<arr.length; i++){
            if (arr[i] > smax && arr[i] != max) smax= arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
    
} 


//Array me second minimum element print karo
 
public class Secondmax {

    public static void main(String[] args) {

        int arr [] = {4, 5, 6, 7, 8,9};

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] < smin &&  arr[i] != min){
                smin = arr[i];
            } 
        }
        
            System.out.println(min);
            System.out.println(smin);
    }
} 
    

 //Array me negative numbers ka maximum find karo
 
  
public class Secondmax {

    public static void main(String[] args) {

        int arr [] = {-4, -5, -6, -7, -8,-9};

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] < smin &&  arr[i] != min){
                smin = arr[i];
            } 
        }
        
            System.out.println(min);
            System.out.println(smin);
    }
}


 
public class Secondmax {

    public static void main(String[] args) {

        int arr [] = {-4, -5, -6, -7, -8,-9};

        int min = Integer.MIN_VALUE;
        int smin = Integer.MIN_VALUE;

        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] > min){
                min = arr[i];
            }
        }

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] > smin &&  arr[i] != min){
                smin = arr[i];
            } 
        }
        
            System.out.println(min);
            System.out.println(smin);
    }
}
