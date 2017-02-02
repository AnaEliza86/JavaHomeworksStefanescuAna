/*
 * Testing "Car" class
 */
package cars;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class CarTest {
    
    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setDailyRentingPrice method, of class Car.
     */
    @Test
    public void testSetDailyRentingPrice() {
        System.out.println("setDailyRentingPrice");
        int dailyRentingPrice = 0;
        Car instance = new Car();
        instance.setDailyRentingPrice(dailyRentingPrice);
        
        
    }

    /**
     * Test of setSalesPrice method, of class Car.
     */
    @Test
    public void testSetSalesPrice() {
        System.out.println("setSalesPrice");
        int salesPrice = 0;
        Car instance = new Car();
        instance.setSalesPrice(salesPrice);
        
       
    }

    /**
     * Test of getSalesPrice method, of class Car.
     */
    @Test
    public void testGetSalesPrice() {
        System.out.println("getSalesPrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getSalesPrice();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getDailyRentingPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentingPrice() {
        System.out.println("getDailyRentingPrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getDailyRentingPrice();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car();
        String expResult = "name";
        String result = instance.getName();
               
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Car instance = new Car();
        instance.setName(name);
        
        
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car();
        Car.Color expResult = null;
        Car.Color result = instance.getColor();
      
        
        
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Car.Color color = null;
        Car instance = new Car();
        instance.setColor(color);
        
        
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car();
        short expResult = 120;
        short result = instance.getSpeed();
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        short speed = 0;
        Car instance = new Car();
        instance.setSpeed(speed);
       
       
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.increaseSpeed(newSpeed);
        
        
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.decreaseSpeed(newSpeed);
        
        
    }
    
}
