package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanDeAlimentacionTest {
    
    public PlanDeAlimentacionTest() {
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
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuario p = new Usuario();
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);       
        Usuario result = pda.getUsuario();
        assertEquals(p, result);
    }
    
     @Test
    public void testSetUsuario(){
     System.out.println("getUsuario");
        Usuario p = new Usuario();
        p.setNombre("ejemplo");
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);   
              
       
       pda.setUsuario(p);
      Usuario result = pda.getUsuario();
        assertEquals(p.getNombre(), result.getNombre());
    }
    
     @Test
    public void testSetListaLunes(){
        Usuario p = new Usuario();
        Alimento alimento = new Alimento();
        alimento.setNombre("Banana");
        
        ArrayList<Alimento> lista = new ArrayList<>();
        lista.add(alimento);
    
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);
        pda.setListaLunes(lista);           
       
       
      ArrayList<Alimento> listaExp = pda.getListaLunes();
        assertEquals(lista,listaExp);
    }
    
     @Test
    public void testSetListaMartes(){
        Usuario p = new Usuario();
        Alimento alimento = new Alimento();
        alimento.setNombre("Banana");
        
        ArrayList<Alimento> lista = new ArrayList<>();
        lista.add(alimento);
    
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);
        pda.setListaMartes(lista);           
       
       
      ArrayList<Alimento> listaExp = pda.getListaMartes();
        assertEquals(lista,listaExp);
    }
    
     @Test
    public void testSetListaMiercoles(){
        Usuario p = new Usuario();
        Alimento alimento = new Alimento();
        alimento.setNombre("Banana");
        
        ArrayList<Alimento> lista = new ArrayList<>();
        lista.add(alimento);
    
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);
        pda.setListaMiercoles(lista);           
       
       
      ArrayList<Alimento> listaExp = pda.getListaMiercoles();
        assertEquals(lista,listaExp);
    }
    
     @Test
    public void testSetListaJueves(){
        Usuario p = new Usuario();
        Alimento alimento = new Alimento();
        alimento.setNombre("Banana");
        
        ArrayList<Alimento> lista = new ArrayList<>();
        lista.add(alimento);
    
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);
        pda.setListaJueves(lista);           
       
       
      ArrayList<Alimento> listaExp = pda.getListaJueves();
        assertEquals(lista,listaExp);
    }
    
     @Test
    public void testSetListaViernes(){
        Usuario p = new Usuario();
        Alimento alimento = new Alimento();
        alimento.setNombre("Banana");
        
        ArrayList<Alimento> lista = new ArrayList<>();
        lista.add(alimento);
    
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);
        pda.setListaViernes(lista);           
       
       
      ArrayList<Alimento> listaExp = pda.getListaViernes();
        assertEquals(lista,listaExp);
    }
    
     @Test
    public void testSetListaSabado(){
        Usuario p = new Usuario();
        Alimento alimento = new Alimento();
        alimento.setNombre("Banana");
        
        ArrayList<Alimento> lista = new ArrayList<>();
        lista.add(alimento);
    
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);
        pda.setListaSabado(lista);           
       
       
      ArrayList<Alimento> listaExp = pda.getListaSabado();
        assertEquals(lista,listaExp);
    }
    
     @Test
    public void testSetListaDomingo(){
        Usuario p = new Usuario();
        Alimento alimento = new Alimento();
        alimento.setNombre("Banana");
        
        ArrayList<Alimento> lista = new ArrayList<>();
        lista.add(alimento);
    
        PlanDeAlimentacion pda = new PlanDeAlimentacion(p);
        pda.setListaDomingo(lista);           
       
       
      ArrayList<Alimento> listaExp = pda.getListaDomingo();
        assertEquals(lista,listaExp);
    }
}
