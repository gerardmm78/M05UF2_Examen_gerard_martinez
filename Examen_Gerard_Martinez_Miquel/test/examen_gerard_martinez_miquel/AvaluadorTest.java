/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_gerard_martinez_miquel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Usuario
 */
public class AvaluadorTest {
    
    public Avaluador avaluador;
    public Estudiant estudiant;
    public Estudiant[] estudiants;
    
    public AvaluadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.err.println("Inicialitzant tests...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.err.println("Finalitzant tests...");
    }
    
    @Before
    public void setUp() {
        avaluador = new Avaluador();
        
    }
    
    @After
    public void tearDown() {
        avaluador = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    //@Ignore
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(10.0, avaluador.mitjanaSiSupera(new Estudiant("gerard", 10, 10, 10)), 0.001);
        assertEquals(0.0, avaluador.mitjanaSiSupera(new Estudiant("Katrina", 1, 4, 3)), 0.001);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    //@Ignore
    public void testMitjana() throws Exception {
        assertEquals(10.0, avaluador.mitjana(new Estudiant("gerard", 10, 10, 10)), 0.001);
        assertEquals(5.0, avaluador.mitjana(new Estudiant("Katrina", 1, 4, 10)), 0.001);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    //@Ignore
    public void testMillorEstudiantPerNotaMitjana() {
        
        Estudiant estudiants[] = new Estudiant[2];
        estudiants[0] = new Estudiant("Gerard", 10.0, 10.0, 10.0);
        estudiants[1] = new Estudiant("Martí", 4.0, 5.0, 6.0);
        
        assertEquals(estudiants[0], avaluador.millorEstudiantPerNotaMitjana(estudiants));
    }
    
}
