package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComidaPorDiaTest {
    
    public ComidaPorDiaTest() {
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

    @Test
    public void testGetComidasIngeridas() {
        System.out.println("getComidasIngeridas");
        
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> expResult = new ArrayList<Alimento>();
        ArrayList<Alimento> result = instance.getComidasIngeridas();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testConstructor() {
        ComidaPorDia cpd = new ComidaPorDia();
       assertNotNull(cpd);
    }
    
    @Test
    public void testToString() {       
        ArrayList<Alimento> lista = new ArrayList<Alimento>();
         ComidaPorDia cpd = new ComidaPorDia(lista,"8-10-2010");
        String toString = cpd.toString();
       assertNotNull(toString);
    }
    
    
     @Test
    public void testSetFecha() {
       ComidaPorDia cpd = new ComidaPorDia();
       String fecha = "10/10/2010";
       cpd.setFecha(fecha);
         assertEquals(fecha, cpd.getFecha());
    }
    
     @Test
    public void testSetComidasIngeridas() {
         ComidaPorDia cpd = new ComidaPorDia();
         
        ArrayList<Alimento> comidas = new ArrayList<>();
      Alimento alimento = new Alimento();
      comidas.add(alimento);
      cpd.setComidasIngeridas(comidas);
         assertEquals(comidas, cpd.getComidasIngeridas());
    }
    
}
