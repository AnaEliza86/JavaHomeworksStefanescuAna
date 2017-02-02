/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebooksstore;

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
public class LibraryTest {
    
    public LibraryTest() {
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
     * Test of addBook method, of class Library.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book book = null;
        Library instance = new Library();
        instance.addBook(book);
        
        
    }

    /**
     * Test of toString method, of class Library.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Library instance = new Library();
        String expResult = "";
        String result = instance.toString();
        
        
     
    }
    
}
