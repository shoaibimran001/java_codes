import java.util.Scanner;

public class p04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter v :");
        double v = sc.nextDouble();

         System.out.println("enter u :");
         double u = sc.nextDouble();


          System.out.println("enter a :");
         double a = sc.nextDouble();

          System.out.println("enter s :");
         double s = sc.nextDouble();

         double result =(v * v - u * u) / (2 * a * s);

         System.out.println("Result :"+ result);
        
    }


    
}
