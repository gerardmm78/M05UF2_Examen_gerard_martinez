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
public class AvaluadorTestPar3 {
    
    private Avaluador instance;
    
    @Parameterized.Parameter(0)
    public Estudiant estudiant1;
    @Parameterized.Parameter(1)
    public Estudiant estudiant2;
    @Parameterized.Parameter(2)
    public Estudiant bestEstudiant;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][] {
            {
                new Estudiant("Gerard", 10, 10, 10),
                new Estudiant("Martina", 5, 6, 10),
                new Estudiant("Gerard", 10, 10, 10)
            },
            {
                new Estudiant("Alex", 10, 7, 10),
                new Estudiant("Berta", 5, 4, 6),
                new Estudiant("Alex", 10, 7, 10)
            },
            {
                new Estudiant("Carles", 3, 10, 8),
                new Estudiant("Dani", 0, 0, 3),
                new Estudiant("Carles", 3, 10, 8)
            },
            {
                new Estudiant("Elisa", 10, 8, 9),
                new Estudiant("Ferran", 0, 0, 0),
                new Estudiant("Elisa", 10, 8, 9)
            },
            {
                new Estudiant("Gerard", 10, 10, 10),
                new Estudiant("Hug", 3, 10, 8),
                new Estudiant("Gerard", 10, 10, 10)
            },
            {
                new Estudiant("Iliana", 3, 10, 8),
                new Estudiant("Joana", 5, 5, 5),
                new Estudiant("Iliana", 3, 10, 8)
            },
            {
                new Estudiant("Karen", 0, 0, 0),
                new Estudiant("Leslie", 5, 5, 5),
                new Estudiant("Leslie", 5, 5, 5)
            },
            {
                new Estudiant("Monica", 1, 1, 10),
                new Estudiant("Nerea",  9, 10, 8),
                new Estudiant("Nerea",  9, 10, 8)
            },
            {
                new Estudiant("Omar", 5, 4, 6),
                new Estudiant("Palutena", 10, 7, 10),
                new Estudiant("Palutena", 10, 7, 10)
            },
            {
                new Estudiant("Qinx", 5, 4, 6),
                new Estudiant("Roy", 3, 10, 8),
                new Estudiant("Roy", 3, 10, 8)
            },
            {
                new Estudiant("Serena", 0, 0, 3),
                new Estudiant("Truman", 10, 8, 9),
                new Estudiant("Truman", 10, 8, 9)
            },
            {
                new Estudiant("Uma", 0, 0, 0),
                new Estudiant("Victoria", 10, 10, 10),
                new Estudiant("Victoria", 10, 10, 10)
            },
            {
                new Estudiant("Willy", 3, 10, 7),
                new Estudiant("Xenophilius", 3, 10, 8),
                new Estudiant("Xenophilius", 3, 10, 8)
            },
            {
                new Estudiant("Yzi", 5, 5, 5),
                new Estudiant("Zora", 0, 0, 0),
                new Estudiant("Yzi", 5, 5, 5)
            },
            {
                new Estudiant("Ñordo", 5, 5, 5),
                new Estudiant("Lluis", 1, 1, 10),
                new Estudiant("Ñordo", 5, 5, 5)
            }  
        };
        
        return Arrays.asList(data);
        
    }
    
    public AvaluadorTestPar3() {
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
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    //@Ignore
    public void testMillorEstudiantPerNotaMitjana() {
        Estudiant bestMitjana[] = new Estudiant[2];
        bestMitjana[0] = estudiant1;
        bestMitjana[1] = estudiant2;
        
        assertEquals(bestEstudiant, instance.millorEstudiantPerNotaMitjana(bestMitjana));
    }
    
}
