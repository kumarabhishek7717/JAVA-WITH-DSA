
 
public class Reverse2 {
    public static void main(String[] args) {

        int arr [] = {3, 19, 56, 9, 83, 24, 85, 14};
        int i = 2;
        int j = 5;

        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    
} 
 
public class Reverse2 {

    public static void main(String[] args) {
        int arr [] = {30, 40, 50, 60, 70, 80, 90};
        int i = 0;
        int j = 6;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }

        for (int ele : arr) {
            System.out.print(ele +  " ");
            
        }
    }
}


public class InnerReverse2 {

    
}  


public class Reverse2 {

    public static void main(String[] args) {
        int arr [] = {40, 50, 60, 70, 80, 90};

        int i = 0;
        int j = arr.length/2-1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

            
        }
         for (int ele : arr) {
        System.out.print(ele+ " ");
    }
}
}



