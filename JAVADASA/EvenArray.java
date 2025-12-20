//Array me even numbers ka second maximum print karo

 
public class EvenArray {

    public static void main(String[] args) {
        int arr [] ={2,4,6,8,10};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0 ; i< arr.length; i++){
            if (arr[i] > max){
                max= arr[i];
            }
        }
        for(int i = 0 ; i<arr.length; i++){
            if (arr[i] % 2 == 0 && arr[i] > smax && arr[i] !=max){
                smax= arr[i];
               
                    
                }
            }
        

        System.out.println(max);
        System.out.println(smax);
    }

    
}
 

//Array me even numbers ka second maximum print karo

public class EvenArray {

    public static void main(String[] args) {

        int arr [] = {2,3,4,5,6,7,89,90};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0 ; i< arr.length; i++){
            if (arr[i]%2==1 && arr[i] > max){
                    max= arr[i];
            }
           
        }

        for(int i = 0 ; i<arr.length; i++){
            if (arr[i] > smax && arr[i] !=max && arr[i] %2 == 1){
                smax= arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }

    
}