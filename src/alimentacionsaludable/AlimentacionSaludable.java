package alimentacionsaludable;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import interfaz.PanelIngresar;
import interfaz.PanelPrincipal;
import java.util.ArrayList;

public class AlimentacionSaludable {

    public static void main(String[] args) {
        Sistema s = new Sistema();
        Usuario usuario = new Usuario();
        usuario.setNombre("Romina");
        usuario.setNombreUsuario("rr202202");
        usuario.setContrasenia("ort2020");
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        Profesional prof = new Profesional();
        prof.setNombre("Diego");
        prof.setNombreUsuario("da202202");
        prof.setContrasenia("ort2020");
        ArrayList<Profesional> profesionales = new ArrayList<>();
        profesionales.add(prof);
        s.cargarSistema();
        s.setListaUsuarios(usuarios);
        s.setListaProfesionales(profesionales);
        PanelPrincipal p = new PanelPrincipal(s);
        PanelIngresar comienzo = new PanelIngresar(p, p.getSistema());
        p.add(comienzo);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
