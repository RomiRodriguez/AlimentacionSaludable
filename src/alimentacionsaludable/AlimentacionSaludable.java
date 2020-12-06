package alimentacionsaludable;

import dominio.Sistema;
import interfaz.PanelIngresar;
import interfaz.PanelPrincipal;

public class AlimentacionSaludable {

    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.cargarSistema();
        PanelPrincipal p = new PanelPrincipal(s);
        PanelIngresar comienzo = new PanelIngresar(p, p.getSistema());
        p.add(comienzo);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
