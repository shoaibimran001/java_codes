import java.util.Scanner;
public class p3 {
    public static void main(String[] args){
        Scanner student = new Scanner( System.in);
        int sub1,sub2,sub3,sub4,sub5;
         System.out.println("enter marks :");
         sub1 = student.nextInt();
         sub2 = student.nextInt();
         sub3 = student.nextInt();
         sub4 = student.nextInt();
         sub5 = student.nextInt();
        int total  ;
         total = sub1 + sub2 + sub3 + sub4 + sub5 ;
         double percentage = (total / 500.0) * 100;
         double cgpa =(total /50.0);


         System.out.println("Total marks :" + total );
         System.out.println("Percentage :" + percentage );
         
         System.out.println("CGPA:" + cgpa);

         student.close();


         




    }

    
}
