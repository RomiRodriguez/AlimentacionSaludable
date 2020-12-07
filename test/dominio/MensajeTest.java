package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MensajeTest {
    
    public MensajeTest() {
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
    public void testGetOrigen() {
        System.out.println("getOrigen");
        Mensaje msj = new Mensaje();
       Persona p = new Usuario();
        Persona result = msj.getOrigen();
        assertEquals(p, result);
    }
    
    @Test
    public void testSetOrigen(){
     System.out.println("setOrigen");
        Mensaje msj = new Mensaje();
       Persona p = new Usuario();
       p.setNombre("ejemplo");
       msj.setOrigen(p);
        Persona result = msj.getOrigen();
        assertEquals(p.getNombre(), result.getNombre());
    }
    
     @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Mensaje msj = new Mensaje();
       Persona p = new Usuario();
        Persona result = msj.getDestino();
        assertEquals(p, result);
    }
    
    @Test
    public void testSetDestino(){
     System.out.println("setDestino");
        Mensaje msj = new Mensaje();
       Persona p = new Usuario();
       p.setNombre("ejemplo");
       msj.setDestino(p);
        Persona result = msj.getDestino();
        assertEquals(p.getNombre(), result.getNombre());
    }
    
     @Test
    public void testGetAsunto() {
        System.out.println("getAsunto");
        Mensaje msj = new Mensaje();
       String exp = "no tiene texto";
       String result = msj.getAsunto();
        assertEquals(exp, result);
    }
    
    
      @Test
    public void testSetAsunto() {
        System.out.println("getAsunto");
        Mensaje msj = new Mensaje();
        String example = "AsuntoEjemplo";
       msj.setAsunto(example);
       String result = msj.getAsunto();
        assertEquals(example, result);
    }
    
     @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        Mensaje msj = new Mensaje();
       String exp = "no tiene texto";
       String result = msj.getMensaje();
        assertEquals(exp, result);
    }
    
     @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        Mensaje msj = new Mensaje();
        String example = "MensajeEjemplo";
       msj.setMensaje(example);
       String result = msj.getMensaje();
        assertEquals(example, result);
    }
    
    
     @Test
    public void testToString() {
        System.out.println("setMensaje");
        Mensaje msj = new Mensaje();
        String exp = "Mensaje de: " + "no ingreso usuario"
                + " con Asunto: " + "no tiene texto";
        
        assertEquals(msj.toString(),"hola");
    }
}
