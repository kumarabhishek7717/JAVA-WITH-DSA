
public class Rotate {

    public static void main(String[] args) {
        int arr [] = {30, 40, 50, 60, 70, 80};
        int i = 0;
        int j = arr.length - 2;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
    
}



public class Rotate {

    public static void main(String[] args) {
        int arr [] = {20, 30, 40, 50, 60, 70};
         int i = 2;
         int j = arr.length-1;

         while (i < j) {
            int temp =  arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;  
         }
         for (int ele : arr) {
            System.out.print(ele + " ");
            
         }
    }
}


public class Rotate {

    public static void main(String[] args) {
        int arr[] ={0,0,0,1,0,1,0,0,1};

        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (i < j) {
            if (arr[i] == 0) i++;

           else if (arr[j] == 1) j--;

          else  if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr [j] = 1;

                i++;
                j--;
                
            } 
               
            }
            for (int ele : arr) {
             System.out.print(ele+ " " );
          
                
            }
            
                
            }
        }
           
        

        public class Rotate {
        
            public static void main(String[] args) {
                int [] arr = {1,1,1,0,0,0,1,0,1};

                int i =0;
                int j = arr.length-1;

                while (i < j) {

                    if (arr[i] == 0) i++;

                    else if (arr[j] == 1) j--;

                    else if (arr[i] == 1 && arr[j] == 0){
                        arr[i] = 0;
                        arr[j] = 1;

                        i++;
                        j--;
                    }

                }

                for (int ele : arr) {
                    System.out.print(ele + " " );
                    
                }
            }
                    
                }
            
        

       
 