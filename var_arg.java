public class var_arg {

    // static int sum(int a , int b){
    //     return a+b;
    // }


     static int sum(int ...arr){    //int ...arr      this is called variable argument 
    
        int result =0;
        for(int a :arr){
            result += a;
        }
        return result;
     }

    
    public static void main(String[] args){
        System.out.println("welcome to the varargs Tutorial ");

        System.out.println("sum of nothing is :"+ sum()); 
         System.out.println("the sum of 2 and 5 the is :"+ sum(2,5,5)); 
          System.out.println("the sum of 2 and 5 the is :"+ sum(2,5,6,7)); 
           System.out.println("the sum of 2 and 5 the is :"+ sum(2,5,7,8,9)); 
           System.out.println("the sum of 2 and 5 the is :"+ sum(2,5,7,8,9,10,6,7)); 


    }
    
}
