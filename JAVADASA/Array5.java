
//: Multiply odd indexed elements by 2 and add 10 to even indexed elements

 
public class Array5 {
    public static void main(String[] args) {

        int arr [] = {10, 20, 30, 40, 50, 60};

        for(int i = 0; i< arr.length; i++){
             
            if (i%2==0){
                arr[i] *= 2;

            } else {
                arr[i] += 10;
            }
            System.out.print(arr[i] + " ");
        }
        
    }
    
} 

//SEARCH IN ARRAY
 
public class Array5 {

    public static void main(String[] args) {
        int arr [] = {20, 30, 40, 50, 60,70};
        int  key = 40;

        for (int i = 0 ; i< arr.length; i++) {
            if (arr[i] == key){
                System.out.print("your index is " + i);
                break;
            }
            }
            
        }
    }


    
public class Array5 {

    public static void main(String[] args) {
        int arr [] = {20, 50, 40, 60, 90,70};
        int  key = 90;

        for (int i = 0 ; i< arr.length; i++) {
            if (arr[i] == key){
                System.out.print("your index is " + i);
                break;
            } else {

                System.out.print("your index is not found");

            }
            

            
            } 

            }
            
        }
    

           
public class Array5 {

    public static void main(String[] args) {
        int arr [] = {20, 50, 40, 60, 90,70};
        int  key = 99;

        for (int i = 0 ; i< arr.length; i++) {

            if (arr[i] == key){
                System.out.print("your index is " + i);
                break;

            } else {

                System.out.print("your index is not found");
                break;

            }
            

            
            } 

            }
            
        }
    

    
