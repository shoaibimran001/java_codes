public class break_and_continue {
    public static void main(String[] args){
        // break and continue using loops!
        // for(int i=0;i<5; i++){
        //     System.out.println(i);
        //     System.out.println("java is grate");
        //     if(i==2){                                                          // breaking the loop in the middle at 2 
        //         System.out.println("ending the loop ");
        //         break;
        //     }
        // }


        for(int i=0; i<5; i++){
            if(i==2){
                System.out.println("end the loop");   // here the continue is stopping the 2nd iteration and continue the another 
                continue;
            }
            System.out.println(i);
            System.out.println("java is grate");
        }


    }
}
