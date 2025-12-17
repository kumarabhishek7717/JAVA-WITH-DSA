
import java.util.Scanner;
 
public class Pattern1{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
            int a= sc.nextInt();
            int n = a;
            for(int i = 1; i<=a; i++){
                for(int j = 1; j<=n; j++){
                    System.out.print(j);
                }
                n--;
                System.out.println();
            }
        }
    } 

     
public class Pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = a ;
        for(int i = 1 ; i<=a; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)+ (j+(96)) );
            }
            n--;
            System.out.println();
        }
    }
}

   
public class Pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = a ;
        for(int i = 1 ; i<=a; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)+ (j+(64)) );
            }
            n--;
            System.out.println();
        }
    }
}  

public class Pattern1{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int a = n;

        for(int i = 1; i<=n; i++){
            for (int j =1 ; j<=a; j++){
                System.out.print((char)+ (i+(64)));
            }
            a--;
            System.out.println();
        }
    }
}



public class Pattern1{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int a = n;

        for(int i = 1; i<=n; i++){
            for (int j =1 ; j<=a; j++){
                System.out.print((char)+ (i+(96)));
            }
            a--;
            System.out.println();
        }
    }
}