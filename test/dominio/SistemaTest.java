package dominio;

import static datechooser.beans.pic.Pictures.getResource;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {
    
    public SistemaTest() {
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
    public void testGetListaTiposDeUsuario() {
        System.out.println("getListaTiposDeUsuario");
        Sistema instance = new Sistema();
        Sistema.tipoUsuario[] expResult = {Sistema.tipoUsuario.Profesional, Sistema.tipoUsuario.Usuario};
        Sistema.tipoUsuario[] result = instance.getListaTiposDeUsuario();
        assertArrayEquals(expResult, result);
    }
    
    
    @Test
    public void testGetListaAlimentos() {
        Sistema instance = new Sistema();
        ArrayList<Alimento> result = instance.getListaAlimentos();
       assertNotNull(result);
    }
   
     @Test
    public void testGetListaUsuarios() {
        Sistema instance = new Sistema();
        ArrayList<Usuario> result = instance.getListaUsuarios();
       assertNotNull(result);
    }
   
      @Test
    public void testSetListaUsuarios() {
        Sistema instance = new Sistema();
         ArrayList<Usuario> result = instance.getListaUsuarios();
        ArrayList<Usuario> use = new ArrayList<>();
        Usuario u = new Usuario();
        u.setNombre("Ejemplo");
        use.add(u);
        
        instance.setListaUsuarios(use);
       ArrayList<Usuario> newResult = instance.getListaUsuarios();
          assertNotEquals(result, newResult);
    }
    
    @Test
     public void testGetListaprofesionales() {
        Sistema instance = new Sistema();
        instance.cargarSistema();
        ArrayList<Profesional> result = instance.getListaProfesionales();
       assertNotNull(result);
    }
     
    @Test
      public void testSetListaProfesionales() {
        Sistema instance = new Sistema();
         ArrayList<Profesional> result = instance.getListaProfesionales();
        ArrayList<Profesional> use = new ArrayList<>();
        Profesional u = new Profesional();
        u.setNombre("Ejemplo");
        use.add(u);        
        instance.setListaProfesionales(use);
       ArrayList<Profesional> newResult = instance.getListaProfesionales();
          assertNotEquals(result, newResult);
    }
      
      @Test
      public void testGetUsuarioActivo() {
          Sistema instance = new Sistema();
        Sistema.tipoUsuario result = instance.getUsuarioActivo();
       assertNotNull(result);
    }
     
      @Test
      public void testSetUsuarioActivo() {
          Sistema instance = new Sistema();
        Sistema.tipoUsuario prof = Sistema.tipoUsuario.Profesional;       
        
        instance.setUsuarioActivo(prof);
        
        Sistema.tipoUsuario result = instance.getUsuarioActivo();
        instance.guardarSistema();
       assertEquals(result,prof);
    }
      
      
    @Test
    public void testPidoDatoNumericoInvalido() {
        System.out.println("pidoDatoNumericoInvalido");
        int dato = -1;
        int min = 0;
        int max = 2;
        Sistema instance = new Sistema();
        boolean result = instance.pidoDatoNumerico(dato, min, max);
        assertFalse(result);
    }
    
    @Test
    public void testPidoDatoNumericoInvalido2() {
        System.out.println("pidoDatoNumericoInvalido2");
        int dato = 3;
        int min = 0;
        int max = 2;
        Sistema instance = new Sistema();
        boolean result = instance.pidoDatoNumerico(dato, min, max);
        assertFalse(result);
    }

    @Test
    public void testResizeImageIconTrue(){
        System.out.println("resizeImageIcon");
        Sistema instance = new Sistema();
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        Integer width = 100;
        Integer height = 100;
        ImageIcon result = instance.resizeImageIcon(imageIcon, width, height);
        boolean heightCorrectas = result.getIconHeight() == height;
        boolean widthCorrectas = result.getIconWidth() == width;
        assertTrue(heightCorrectas && widthCorrectas);
    }
    
    @Test
    public void testResizeImageIconFalse(){
        System.out.println("resizeImageIcon");
        Sistema instance = new Sistema();
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        Integer width = 100;
        Integer height = 100;
        Integer heightMal = 50;
        ImageIcon result = instance.resizeImageIcon(imageIcon, width, height);
        boolean heightCorrectas = result.getIconHeight() == heightMal;
        boolean widthCorrectas = result.getIconWidth() == width;
        assertFalse(heightCorrectas && widthCorrectas);
    }
    
    @Test
    public void testValuesTipoUsuario(){
        Sistema.tipoUsuario[] listaNac = Sistema.tipoUsuario.values();
    }
    
    @Test
    public void testSistemaPorParametro(){
        ArrayList<Usuario> listaU = new ArrayList<Usuario>();
        ArrayList<Profesional> listaP = new ArrayList<Profesional>();
        ArrayList<Alimento> listaA = new ArrayList<Alimento>();
        Sistema.tipoUsuario usuarioActivo = Sistema.tipoUsuario.NoSeleccionado;
        Sistema s = new Sistema(listaA,listaU,listaP,usuarioActivo);
    }
    
}
