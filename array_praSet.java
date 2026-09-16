public class array_praSet {
    public static void main(String[] args) {
        // //practice Problem -1
        // float [] marks ={20.5f, 30.6f , 40.5f , 50.9f, 60.9f};
        // float sum=0;
        // for(float element:marks){
        // sum = sum + element;
        // }
        // System.out.println(sum);

        // practice Problem -2
        // float [] marks ={30.6f , 40.5f ,20.5f, 50.9f, 60.9f};
        // float num = 20.5f;
        // boolean isinArray = false;

        // for(float element : marks){
        // if(num == element){
        // isinArray = true;

        // }
        // }
        // if(isinArray){

        // System.out.println("yes the value is present in the array");
        // }
        // else{
        // System.out.println("no the value is not present in the array");
        // }

                    // practice problem -3

        // int[] marks = { 40, 50, 30, 48, 20 };
        // float sum = 0;

        // for (float element : marks) {
        // sum += element;
        // }
        // float avg = sum / marks.length;
        // System.out.println(avg); //average
        // System.out.println(sum); //total

                  //<< practice problem - 4

        // int[][] mat1 = { { 1, 2, 3 },
        //         { 2, 3, 4 } };

        // int[][] mat2 = { { 1, 5, 3 },
        //         { 6, 3, 9 } };

        // int[][] result = { { 0, 0, 0 },
        //                  { 0, 0, 0 } };

        // for (int i = 0; i < mat1.length; i++) {
        //     for (int j = 0; j < mat1[i].length; j++) {
        //         System.out.format("setting the for i=%d and j=%d\n", i, j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }

        // }//printing the values of 2-D array 
    
        // for (int i = 0; i < mat1.length; i++) {
        //     for (int j = 0; j < mat1[i].length; j++) {
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println("");
        // 





                 //practice problem - 5

        /* 
        int [] arr={1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for(int i =0; i<n;i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for(int element:arr){
            System.out.print(element + " ");

        }System.out.println("");
        */



            //practice problem - 6

    //    int [] arr={1, 2, 3, 4, 10, 6,7};
    //    int max = 0;
    //    for(int e:arr){
    //     if(e>max){
    //         max = e;

    //     }
    // }
    // System.out.println(max);


    // practice problem -7
    /*

    int [] arr={1, 2, 3, 4, 10, 6,7};
      int max = arr[0];
      for(int e:arr){
       if(e<max){
           max = e;
       }
   }
   System.out.println(max);
     */

            //practice problem -8

    int [] arr={1, 2, 3, 4, 6,7};
    boolean isSorted = true;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            isSorted = false;
            break;
        }
    }
    if(isSorted){
        System.out.println("The array is sorted");
    }
    else{
        System.out.println("The array is not sorted ");
    }

    
    }
}


