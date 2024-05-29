package usuarios;

import java.util.ArrayList;
import java.util.List;

public class Gestor_Usuarios {

    private List<Usuarios> usuarios;

    public Gestor_Usuarios() {
        this.usuarios = new ArrayList<>();
    }
    public void agregarUsuario(Usuarios usuario){
        usuarios.add(usuario);
    }
    public List<Usuarios> obtenerUsuarios(){
        return usuarios;
    }
}
