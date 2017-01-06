/*
 * Strings and numbers homeworks
 */
package javahomeworksstefanescuana;

/**
 *
 * @author Lenovo
 */
public class StringsAndNumbersHomework {
    public static void main(String[] args){
            
    String hannah = "Did Hannah see bees? Hannah did.";
    int len = hannah.length();
    char result = hannah.charAt(12);
        System.out.println("The value displayed is: " + len);
        System.out.println("The value returned is: " + result);
        System.out.println("The index of the letter \"b\" is: " +hannah.indexOf('b'));
        
    String expression = "Was it a car or a cat I saw";
        System.out.println(expression.substring(9, 12));
        
    String hi = "Hi, ";

    String mom = "mom.";
        System.out.println("1st method: "+ hi.concat(mom));
        System.out.println("2nd method: "+hi+mom);
    
    String myName = "Ana Eliza";
    for (int i = 0; i <= myName.length(); i++){
        char name = myName.charAt(i);
        System.out.println(name);
    }
        
}
}
