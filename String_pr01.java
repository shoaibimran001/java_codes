public class String_pr01 {
    public static void main(String[] args){

        // // Q1 : convert in to lower case 

        // String name = "SHOAIB";

        // System.out.println(name.toLowerCase());


        // // Q2 : replace space with "_"

        // String text = "my name is shoaib";
        // text = text.replace(" " , "_");
        // System.out.println(text);

        //Q3 : 

    //     String letter ="Dear <|name|>, \n   thanks a lot";
    //    letter = letter.replace("<|name|>" , "shoaib");
    //     System.out.println(letter);


        //4 :

        String myString = " this code has  double and triple spaces ";
        System.out.println(myString.indexOf("   "));   // it will shoe the index value of the string 
        System.out.println(myString.indexOf("  "));    // there is no triple space so output is -1
                                                         




    }
    
}
