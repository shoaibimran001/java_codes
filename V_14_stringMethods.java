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
        
        System.out.println(nonTrimmedString);
        String trimmedString =nonTrimmedString.trim();
        
        System.out.println(trimmedString); //removed all white space;

        System.out.println(name.substring(3));

        System.out.println(name.substring(1,4));
        
        System.out.println(name.replace("ho" , "oh").replace('b' , 'l'));
        
       






    }
    
}
