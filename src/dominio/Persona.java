package dominio;

import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Persona implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private String nombre;
    private String apellidos;
    private String nombreUsuario;
    private String fechaNacimiento;
    private ImageIcon fotoPerfil;
    private String contrasenia;

    public Persona(String nombre, String apellidos, String nombreUsuario,
            String fechaNacimiento, ImageIcon fotoPerfil, String contrasenia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.fotoPerfil = fotoPerfil;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ImageIcon getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(ImageIcon fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getContrsenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //Redefino el equals
    @Override
    public boolean equals(Object obj) {
        boolean retorno = true;
        if (obj == null) {
            retorno = false;
        }
        if (obj.getClass() != this.getClass()) {
            retorno = false;
        }
        if (retorno == true) {
            Persona p = (Persona) obj;
            retorno = this.getNombreUsuario()
                    .equalsIgnoreCase(p.getNombreUsuario());
        }
        return retorno;
    }
}
