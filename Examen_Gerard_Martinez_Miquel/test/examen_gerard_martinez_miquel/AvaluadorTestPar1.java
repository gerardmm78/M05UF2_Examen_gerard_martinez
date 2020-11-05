/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_gerard_martinez_miquel;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Usuario
 */
@RunWith(Parameterized.class)
public class AvaluadorTestPar1 {
    
    private Avaluador instance;
    
    public Estudiant estudiant;
    public double resultat;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][] {
            {(new Estudiant("Alex", 10, 7, 10)), 9.0},
            {(new Estudiant("Berta", 5, 4, 6)), 0.0},
            {(new Estudiant("Carles", 3, 10, 8)), 0.0},
            {(new Estudiant("Dani", 0, 0, 1)), 0.0},
            {(new Estudiant("Elisa", 10, 8, 9)), 9.0},
            {(new Estudiant("Ferran", 0, 0, 0)), 0.0},
            {(new Estudiant("Gerard", 10, 10, 10)), 10.0},
            {(new Estudiant("Hug", 3, 10, 8)), 0.0},
            {(new Estudiant("Iliana", 3, 10, 8)), 0.0},
            {(new Estudiant("Joana", 5, 5, 5)), 5.0},
            {(new Estudiant("Karen", 0, 0, 0)), 0.0},
            {(new Estudiant("Leslie", 5, 5, 5)), 5.0},
            {(new Estudiant("Monica", 1, 1, 10)), 0.0},
            {(new Estudiant("Nerea",  9, 10, 8)), 9.0},
            {(new Estudiant("Omar", 5, 4, 6)), 0.0},
        };
        
        return Arrays.asList(data);
        
    }
    
    public AvaluadorTestPar1(Estudiant estudiant, double resultat) {
        this.estudiant = estudiant;
        this.resultat = resultat;
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
        instance = new Avaluador();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    //@Ignore
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(resultat, instance.mitjanaSiSupera(estudiant), 1.0E-3);
    }
    
}
