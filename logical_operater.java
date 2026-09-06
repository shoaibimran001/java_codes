public class logical_operater {
    public static void main(String[] args){
        System.out.println("===logical AND===");
        boolean a = true;
        boolean b = false;
         boolean c = true;

        if(a && b && c){    // both as to be true then the final result will be true  
            System.out.println("true = 1");
        }else{
            System.out.println("false = 0");

        }


        System.out.println("===logical OR===");
        boolean a1 = true;
        boolean b2 = true;
    

        if(a1 || b2) {    // both as to be true then the final result will be true  
            System.out.println("true = 1");
        }else{
            System.out.println("false = 0");

        }




        System.out.println("===logical NOT===");

        boolean a3 = true;
        boolean b3 = false;
    
        System.out.print("Not a() is ");
        System.out.println(!a3);
        System.out.print("Not b() is ");
        System.out.println(!b3);
        


        

    }
    
}
