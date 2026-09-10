import java.util.Scanner;

public class unit_4_PR_5 {
    public static void main(String[] args){
        int day = 1 ;

        System.out.println("enter day in (1 -7) :");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

       switch(day){
           case 1 ->  System.out.println("monday");
           case 2 ->  System.out.println("tuesday");
           case 3 ->  System.out.println("wednesday");
           case 4 ->  System.out.println("Thursday ");
           case 5 ->  System.out.println("Friday");
           case 6 ->  System.out.println("saturday");
           case 7 ->  System.out.println("sunday");

           
           
           
        }
        
        
        
        sc.close();
    }
    
}
