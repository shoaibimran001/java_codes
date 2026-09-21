public class methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
         else{
            z= (x+y)*5;
         }   
         return z;

    }
    public static void main(String[] args){
        int a =2;
        int b=3;
        int c ;

        c =logic(a,b);
    //    methods odj =new methods();      // methods can be called by creating the object 
    //    c =odj.logic(a,b);


        int a1 =2;
        int b1 =10;
        int c1;

        c1 = logic (a1,b1);


        System.out.println(c);
        System.out.println(c1);


    }
}
