/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package projetomed;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Wesley
 */
public class ClasseValoresTest {
    
    public ClasseValoresTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcMedia method, of class ClasseValores.
     */
    @Test
    public void testCalcMedia() {
        System.out.println("calcMedia");
        int valor1 = 2;
        int valor2 = 2;
        int valor3 = 2;
        int valor4 = 2;
        int valor5 = 2;
        int valor6 = 2;
        ClasseValores instance = new ClasseValores();
        int expResult = 2;
        int result = instance.calcMedia(valor1, valor2, valor3, valor4, valor5, valor6);
        assertEquals(expResult, result);
        
    }
    
}
