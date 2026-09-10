import java.util.Scanner;
public class unit_4_pra_setQ1 {
    public static void main(String[] args){
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of maths:");
        m1 = sc.nextInt();
        
        System.out.println("enter marks of chemistry:");
        m2 = sc.nextInt();

         System.out.println("enter marks of biology:");
         m3 = sc.nextInt();

         float avg = (m1 + m2 +m3)/3.0f;
         System.out.println("your over all percentage is :" + avg);

         if (avg>=40 && m1>=30 && m2>=30 && m3>=30 ){

             
             System.out.println("congratulations you are promoted ");
         }
         else{
            System.out.println("you are failed not promoted");
         }










        

    }
    
}
