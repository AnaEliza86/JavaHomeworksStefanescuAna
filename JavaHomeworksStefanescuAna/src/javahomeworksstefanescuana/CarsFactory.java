/*
 *CarsFactory will implement first Class with status and behavior
 */
package javahomeworksstefanescuana;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CarsFactory {
        /**
     * Will test the implementation of all involved classes
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Create a new car with attributes: Mercedes, RED
    Car firstCar = new Car("Mercedes ", Car.Color.RED);
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your request ");
    String s = sc.nextLine();
    System.out.println("A red Mercedes was delivered");


    //Create a new car with attributes: Renault, YELLOW
    Car secondCar = new Car("Renault ", Car.Color.YELLOW);
    
    
    //Create a new car with attributes: Dacia, RED
    Car thirdCar = new Car("Dacia ", Car.Color.RED);
   
    //Create a new car with attributes: Dacia, White
    Car fourthCar = new Car ("Dacia ", Car.Color.WHITE);
    
    //Create a new car with attributes: Mercedes, WHITE
    Car fifthCar = new Car ("Mercedes ", Car.Color.WHITE);
   
    ArrayList<String> obj = new ArrayList<>(5);
         obj.add("1 RED Mercedes");
	  obj.add("2 YELLOW RENAULT");
	  obj.add("3 RED DACIA");
	  obj.add("4 WHITE DACIA");
	  obj.add("5 WHITE MERCEDES");
          
        PrintStream printf = System.out.printf("No. Car name\tCar colour\n");
        PrintStream printf1 = System.out.printf("------------------\n");
        obj.set(0, "1 Mercede RED");
        obj.forEach((value) -> {
            System.out.println(value);
        });
        
        
    }
}



        

