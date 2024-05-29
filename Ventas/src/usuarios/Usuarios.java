package usuarios;

public class Usuarios {

    private final String contrasena;
    private String nombre;
    private String IdUsuario;

    private String password;

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuarios(String nombre, String IdUsuario, String contrasena) {

        this.nombre = nombre;
        this.IdUsuario = IdUsuario;
        this.contrasena = contrasena;


    }
}
