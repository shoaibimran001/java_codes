public class V_14_stringMethods {
    public static void main(String[] args){
        String nonTrimmedString = "     shoaib.     ";
        String name = "shoaib";

        int value = name.length();
        System.out.println(value);

        String ucase = name.toUpperCase();
        System.out.println(ucase);

        String lcase = name.toLowerCase();
        System.out.println(lcase);
        
        System.out.println(nonTrimmedString);              // Trim = remove unwanted spaces from the beginning and end of a string.
        String trimmedString =nonTrimmedString.trim();
        
        System.out.println(trimmedString); //removed all white space;

        System.out.println(name.substring(3));           // starts from 3 to till end 

        System.out.println(name.substring(1,4));  // starts from 1 and ends at 4 . (start and 1 exclude);
        
        System.out.println(name.replace("ho" , "oh").replace('b' , 'l'));   // change b ----> to l . in the string 
        
       System.out.println(name.startsWith("s"));   // it defines weather it is starts with s or not 

       System.out.println(name.charAt(3));   // to know the string induce value 

       System.out.println(name.equals("shoaib"));  // equel or not string 

       System.out.println(name.equalsIgnoreCase("SHOaib"));



       // escape sequence 

       System.out.println("iam escape sequence character \n and iam vary good at this "); //next line 
       System.out.println("hello! \t hi");  // one tab space 
     








    }
    
}
