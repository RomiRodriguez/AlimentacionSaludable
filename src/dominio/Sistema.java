package dominio;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.ImageIcon;

public class Sistema implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    ArrayList<Alimento> listaAlimentos;
    ArrayList<Usuario> listaUsuarios;
    ArrayList<Profesional> listaProfesionales;
    tipoUsuario[] listaTiposDeUsuario;
    tipoUsuario usuarioActivo;

    public Sistema(ArrayList<Alimento> listaAlimentos,
            ArrayList<Usuario> listaUsuarios,
            ArrayList<Profesional> listaProfesionales,
            tipoUsuario usuarioActivo) {
        this.listaAlimentos = listaAlimentos;
        this.listaUsuarios = listaUsuarios;
        this.listaProfesionales = listaProfesionales;
        this.usuarioActivo = usuarioActivo;
        this.listaTiposDeUsuario = inicializoListaTiposDeUsuario();
    }

    public Sistema() {
        this.listaAlimentos = new ArrayList();
        this.listaUsuarios = new ArrayList();
        this.listaProfesionales = new ArrayList();
        this.usuarioActivo = tipoUsuario.NoSeleccionado;
        this.listaTiposDeUsuario = inicializoListaTiposDeUsuario();
    }

    public tipoUsuario[] getListaTiposDeUsuario() {
        tipoUsuario[] lista = listaTiposDeUsuario;
        return lista;
    }

    public void setListaTiposDeUsuario(tipoUsuario[] listaTiposDeUsuario) {
        this.listaTiposDeUsuario = Optional
                .ofNullable(listaTiposDeUsuario)
                .orElse(null);
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return listaAlimentos;
    }

    public void setListaAlimentos(ArrayList<Alimento> listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Profesional> getListaProfesionales() {
        return listaProfesionales;
    }

    public void setListaProfesionales(ArrayList<Profesional> listaProfesionales) {
        this.listaProfesionales = listaProfesionales;
    }

    public tipoUsuario getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(tipoUsuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    public enum tipoUsuario {
        Profesional, Usuario, NoSeleccionado
    }

    tipoUsuario[] inicializoListaTiposDeUsuario() {
        tipoUsuario[] listaPivot = {tipoUsuario.Profesional,
            tipoUsuario.Usuario};
        return listaPivot;
    }

    public void cargarSistema() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("sis.ser"));
            ArrayList<Alimento> listAlimentos = (ArrayList<Alimento>) in.readObject();
            listaAlimentos = listAlimentos;
            ArrayList<Usuario> listUsuarios = (ArrayList<Usuario>) in.readObject();
            listaUsuarios = listUsuarios;
            ArrayList<Profesional> listProfesionales = (ArrayList<Profesional>) in.readObject();
            listaProfesionales = listProfesionales;
            in.close();
        } catch (Exception ex) {
            listaAlimentos = new ArrayList<>();
            listaUsuarios = new ArrayList<>();
            listaProfesionales = new ArrayList<>();
        }
    }

    public void guardarSistema() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sis.ser"));
            out.writeObject(listaAlimentos);
            out.writeObject(listaUsuarios);
            out.writeObject(listaProfesionales);
            out.flush();
            out.close();
        } catch (IOException ex) {
        }
    }

    public boolean pidoDatoNumerico(int dato, int min, int max) {
        boolean pidiendo = false;
        if (dato >= min && dato <= max) {
            pidiendo = true;
        }
        return pidiendo;
    }

    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width,
            Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height,
                BufferedImage.TRANSLUCENT);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();
        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }

    void registroUsuario(String unNombre, String unApellido, String unUsuario,
            String unaContrasenia, String unSexo, String unaFechaNacimiento,
            double unaAltura, ImageIcon unaFotoPerfil, double unPeso,
            Usuario.Nacionalidades unaNacionalidad) {
        Usuario usuario = new Usuario();
        usuario.setNombre(unNombre);
        usuario.setApellidos(unApellido);
        usuario.setNombreUsuario(unUsuario);
        usuario.setNacionalidad(usuario.getListaEnumNac()[unaNacionalidad.ordinal()]);
        usuario.setFechaNacimiento(unaFechaNacimiento);
        usuario.setSexo(unSexo);
        usuario.setAlturaCm(unaAltura);
        usuario.setPesoKg(unPeso);
        usuario.setFotoPerfil(unaFotoPerfil);
        if (!this.getListaUsuarios().contains(usuario)) {
            this.getListaUsuarios().add(usuario);
        }
    }

    public void registroProfesional(String unNombre, String unApellido,
            String unaContrasenia, String unNombreUsuario,
            String unNombreTitulo, Profesional.Pais unPais,
            ImageIcon unaFotoPerfil, String unaFechaNacimiento,
            String unaFechaGraduacion, Profesional.Pais unPaisTitulo) {
        Profesional profesional = new Profesional();
        profesional.setNombre(unNombre);
        profesional.setApellidos(unApellido);
        profesional.setNombreUsuario(unNombreUsuario);
        profesional.setFechaNacimiento(unaFechaNacimiento);
        profesional.setNombreTituloProf(unNombreTitulo);
        profesional.setFechaGraduacion(unaFechaGraduacion);
        profesional.setPaisObtuvoTitulo(unPaisTitulo);
        profesional.setFotoPerfil(unaFotoPerfil);
        if (!this.getListaProfesionales().contains(profesional)) {
            this.getListaProfesionales().add(profesional);
        }
    }

    public void registroAlimento(String nombreAlim,
            Alimento.TipoAlimento unTipo,
            boolean[] unaListaNutrientes) {
        Alimento alimento = new Alimento();
        alimento.setNombre(nombreAlim);
        alimento.setTipo(alimento.getListaEnumTipoAlimento()[unTipo.ordinal()]);
        alimento.setListaNutrientesSeleccionados(unaListaNutrientes);
        if (!this.getListaAlimentos().contains(alimento)) {
            this.getListaAlimentos().add(alimento);
        }
    }
}
