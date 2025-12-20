
 
public class twosum {
    public static void main(String[] args) {
        int arr [] = {1, 4, 45, 6, 10, 8};
        int target = 16;

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.print(i +   " " + j);

                }
                 
            }
           
        }
    }
    
}


public class twosum {

    public static void main(String[] args) {
        int arr [] =  {2, 7, 11, 15};
        int target = 9;

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print(arr[i]+ " " + arr[j]);
                }
                
            }
            
        }

}
    } 


    public class twosum {
    
        public static void main(String[] args) {
            int arr [] = {1, 5, 7, -1, 5};
            int target = 6;
            int count =0;
            for(int i = 0; i<arr.length; i++){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[i] + arr[j] == target){
                        System.out.println(arr[i] + " " + arr[j]);
                        count++;
                    }
                    
                }
                
            }
            System.out.println(count);
        }
    }


    
    public class twosum {
    
        public static void main(String[] args) {
            int arr [] = {1, 5, 7, -1, 5};
            int target = 6;
            int count =0;
            for(int i = 0; i<arr.length; i++){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[i] + arr[j] == target){
                        System.out.println(arr[i] + " " + arr[j]);
                        count++;
                    }
                    
                }
                
            }
            System.out.println(count);
        }
    }