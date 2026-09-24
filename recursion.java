public class recursion {

                                                    //recursion approach

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorial (n-1);
        }
    }
    

                                                    //iterative approach

static int fact(int x){
    int result =1;
    for(int i=1;i<=x;i++){
        result = result *i;
    }
    return result ;
}

public static void main(String [] args){
    int b =5;
      int a = 0;
      System.out.println("the factorial of x is :"+fact(a) + " by iterative method");
       System.out.println( "The factorial of x is :" +factorial(b));
}

}
