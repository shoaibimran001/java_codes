import java.util.Scanner;

public class bill_Generator {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer Name :");
        String name = sc.nextLine();
       
        int price1,price2,price3;
        String item1,item2,item3;
        System.out.println(" Item 1 Name and Price");
        item1 = sc.nextLine();
        price1 = sc.nextInt();
        sc.nextLine();  
       //  item 2 
    

         System.out.println(" Item 2 Name and Price");
         item2 = sc.nextLine();
         price2 = sc.nextInt();
         sc.nextLine();  
        //  item 3 
        
        
        System.out.println(" Item 3 Name and Price");
        item3 = sc.nextLine();
        price3 = sc.nextInt();
        sc.nextLine();  

         
        double total = price1+price2+price3;
        double gst = total * 18 / 100;
           



            System.out.println("========= Restaurant Bill Generator ==========");
            System.out.println("Customer Name : " + name);
            System.out.println("Total = " +total);
            System.out.println("Gst = " +gst);



            
            System.out.println(item1 + "="+ price1);
            System.out.println(item2 + "="+ price2);
            System.out.println(item3 + "="+ price3);



            System.out.println("Final Bill = " +(total +gst));
             sc.close();
    }

}
