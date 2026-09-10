import java.util.Scanner;

public class if_else {
    public static void main(String[] args){

        System.out.println("Enter price to know the discount:");
        Scanner sc = new Scanner(System.in);
         double price = sc.nextDouble();

        if(price <= 1000 && price < 100){
            System.out.println();
        }



    }  
}
