

public class Reverse {
    public static void main(String[] args) {
        int arr [] = {6, 8, 1, 2, 4, 9};
        int temp;

        int start = 0;
        int end = arr.length-1;

              while(start < end){

              
            temp=arr [start];
             arr[start]=arr [end];
             arr[end] = temp;

             start++;
             end--;
              }

              for(int i=0; i< arr.length; i++){
                System.out.print(arr[i] + " ");
              }
        }
    }
    


public class Reverse {

    public static void main(String[] args) {
        int arr [] = {3,19,56,9,83,18,24,85,14};
        int i = 0;
        int j = arr.length-1;

        while (i<j) {
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


public class HalfSwap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[i + mid];
            arr[i + mid] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class EvenIndexReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (left % 2 == 0 && right % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 2;
                right -= 2;
            } else {
                right--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
