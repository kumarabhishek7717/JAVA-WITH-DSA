import java.util.Scanner;

 
public class Star{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mid = a/4+1;
        int cols = b/4+1;
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=b+1-i; j++){
                if (i==mid || j==cols){
                    System.out.print("* ");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
} */

 
public class Star{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc .nextInt();
        int b = sc.nextInt();
        for(int i = 1; i<=a; i++){
            for(int j = 1 ; j<=b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    

     