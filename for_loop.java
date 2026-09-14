import java.util.Scanner;

public class for_loop {
    public static void main(String[] args){
        System.out.println("Enter n number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    //     for(int i=0; i<n; i++){
    //         System.out.println("prime:"+ 2*i);
    //         System.out.println("odd:" + ((2*i)+1));
    //     }

                // decrement in for loop;

        // for(int i=0; n>0; i--){                     // int i = 0 is starts form ;
        //  System.out.println(i);                    //n>0 condition ; and decrement ; 
        // n--;
        // }



        //print n natural numbers .

        for(int i=1; i<n; i++){
            System.out.println(i);
        }
    }
}
