package dominio;

import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {
    
    public PersonaTest() {
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
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Usuario();
        String expResult = "no ingreso nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    
     @Test
    public void testSetFechaNacimiento() {
        Persona instance = new Usuario();
       instance.setFechaNacimiento("14/01/2020");
        String result = instance.getFechaNacimiento();
        assertEquals("14/01/2020", result);
    }

    
     @Test
    public void testSetFechaApellidos() {
        Persona instance = new Usuario();
       instance.setApellidos("Ejemplo");
        String result = instance.getApellidos();
        assertEquals("Ejemplo", result);
    }
    
     @Test
    public void testSetContrasenia() {
        Persona instance = new Usuario();
        String contraEx = instance.getContrsenia();
        instance.setContrasenia("12345678");
    String contra = instance.getContrsenia();
        assertEquals(contraEx,contra);
    }
    
    
    @Test
    public void testEqualsFalse() {
        System.out.println("equalsFalse");
        Persona obj = new Usuario();
        obj.setNombreUsuario("pruebaFalse");
        Persona instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test//(expected = Exception.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        Persona obj = null;
        Persona instance = new Usuario();
        assertFalse(instance.equals(obj));
    }
    
    @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equalsDistintoTipo");
        Persona instance = new Usuario();
        boolean test = instance.equals("soy string");
        assertFalse(test);
    }

    public class PersonaImpl extends Persona {

        public PersonaImpl() {
            super("", "", "", "", null,"");
        }
    }
    
}
