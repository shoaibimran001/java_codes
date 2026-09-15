public class array_01 {
    public static void main(String[] args){
        // float[] marks = {20.5f, 30.5f, 40.5f, 60.5f, 70.5f};
        // String[] student ={"shoaib", "kathik", "manoj"};
        // System.out.println(student[0]);
        
        
        // int[] marks ={20, 30, 40, 60, 70};
        // System.out.println(marks.length);
        // System.out.println(marks[1]);



        int[] marks ={20, 30, 40, 60, 70};

        // displaying the array (naive way)

        // System.out.println("printing using Naive way");
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);



        //Displaying the Array (for loop)

        // System.out.println("printing using for loop");
        // for(int i=0;i<marks.length;i++){ 
        //     System.out.println(marks[i]);


        //Display the array in reverse order 

        System.out.println("printing using for loop in reverse order");
        for(int i=marks.length-1; i>=0 ; i--){
            System.out.println(marks[i]);
        }


        // for each loop {this is Introduce new in java  }
        for(int element : marks){
            System.out.println(element);
        }
        
    }
    }
 

