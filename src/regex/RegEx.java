/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lenovo
 */
public class RegEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scannerRegex = new Scanner(System.in);
 System.out.println("Insert regex or pattern to be searched: ");
 // read the regular expresion
 String regex = scannerRegex.next();
 // create a pattern using introduced regular expresion
 
 Pattern pattern = Pattern.compile(regex);
 // read the source string using a new Scanner object
 Scanner scannerSourceString = new Scanner(System.in);
 System.out.println("CNP:2862019550235 ");
 String source = scannerSourceString.nextLine();
 // create the matcher as result of applying regex on source string
 Matcher matcher = pattern.matcher(source);
 boolean found = false;
 // if the regular expression or pattern was found
 while (matcher.find()) {
 String result;
 result = String.format("I found text \"%s\" starting at " +
 "index %d until index %d.",
 matcher.group(),
 matcher.start(),
 matcher.end());
 System.out.println(result);
 found = true;
 }
 // if regular expression or pattern was not found in source string
 if (!found) {
 System.out.println("No match found :("); 
        
        
        
    }
    
}
}
