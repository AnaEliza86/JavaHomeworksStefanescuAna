/*
Variables Exercise
 */
package javahomeworksstefanescuana;

/**
 *
 * @author Lenovo
 */
public class WelcomeJava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = Integer.parseInt("12");
        int b = Integer.parseInt("13");
        int sum = a + b;
        int prod = a * b;
        int result = a - b;
        
       
        
        
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + "-" + b + " = " + result);
        System.out.println(a + "*" + b + " = " + prod);

       double first_number, second_number, answer;
       first_number = 10.5;
       second_number = 20.8;
       answer = first_number + second_number;
        System.out.println("Addition Total = " + answer);
        
        float c, d, divide;
        c = 10.5f;
        d = 20.8f;
        divide = c / d;
        System.out.println("Total = " + divide);
       
        char first_name = 'A';
        char family_name = 'S';
        
        System.out.println("A" + " " + "S");
    
        float f = 1.2f;
        Float fObj = new Float(f);
        System.out.println(fObj);
        
        double z = 1.4;
        Double dObj = new Double(z);
        System.out.println(dObj);
        
        char x = 'A';
        Character cObj = new Character (x);
        System.out.println(cObj);
        
        Boolean yObj = new Boolean("true");
        boolean y = yObj.booleanValue();
        System.out.println(y);
        
        long i = 100;
        Long I = new Long (i);
        System.out.println(I);
        
        short s = 1;
        Short sObj = new Short(s);
        System.out.println(sObj);
        
      Integer intObj1 = new Integer (25);
      Integer intObj2 = new Integer (35);
      Integer intObj3 = new Integer (45);
        System.out.println("Comparing using compareTo Obj1 and Obj2: " + intObj1.compareTo(intObj3));
        
                
      
        
        
        
    }
}