
import java.util.Scanner;


public class Hallowrectangle{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for(int i =1 ; i<=rows; i++){
            for(int j = 1 ; j<=cols; j++){
                if (i == 1 || i == rows || j == 1 || j == cols ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
} 


public class Hallowrectangle{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc .nextInt();
        int b = sc .nextInt();
        int midRow = a/2 +1;
        int midCols = a/2 +1;
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=b; j++){
                if (i==midRow || j==midCols ){
                    System.out.print("* ");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}