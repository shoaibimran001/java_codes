public class Methode_overloading {
    // static void telljoke(){
    //     System.out.println("shoaib is a full stack web developer and a problem solver programer ");
    // }

    static void change(int a){
        a =98;
    }

    static int change1(int a, int b){
        int sum = a+b;
        return sum;
    }


    static void change2(int [] arr){
        arr[0] = 88;
    }

        //method overloading 

    static void foo(){
        System.out.println("good morning broo");
    }

    static void foo(int a){
        System.out.println("good morning "  + a +" broo");
    }


    public static void main(String[] args){
        // telljoke();
        // int x =45;
        // change(x);
        // System.out.println("The value of x ofter running change is :" + x);


        // int x = 50;
        // int y = 40;

        // int z = change1(x ,y);

        // System.out.println("The value of the z is :" + z);



        // in case of arrays 

        int []marks = {58, 78, 68, 48, 56};
        change2(marks);

        for(int i=0; i<marks.length; i++){
        System.out.println("The value of the z is :" + marks[i]); 
        }


        // method overloading 
        foo();
        foo(300);






      


       
       





    }

    }
    

