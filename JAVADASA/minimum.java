
public class NegativeEven {
    public static void main(String args[]) {
        int[] arr = {1,-2,-3,-4,-5,-6,-7,8,-9,10,11,12,13,-14,-15,-16,-17,-18,-19,20};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


 
public class minimum {
    public static void main(String args[]) {

        int[] arr = {-1, -4, -2, -10};

        int min = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Index: " + index);
    }
}


public class minimum {

    public static void main(String[] args) {
        int [] arr = {-3, -1, 4, -8, 6};

        for(int i = 0; i<arr.length; i++){
            if (arr[i] < 0){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}


public class minimum {

    public static void main(String[] args) {
        int [] arr = {-3, -1, 4, -8, 6};

        for(int i =arr.length-1; i>=0; i--){
            if(arr[i] < 0){
                System.out.print(arr[i]);
                break;
            }
        }
    }

    

    
}