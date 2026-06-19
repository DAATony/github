import java.util.ArrayList;
import java.util.List;

public class Universidad {
    String Nombre;
    String direccion;

    public Universidad(String nombre, String direccion) {
        Nombre = nombre;
        this.direccion = direccion;
    }

    public List<Grupo> getGrupos = new ArrayList<>();
    public void AgregarGrupos(Grupo grupo){
        getGrupos.add(grupo);
    }
    public Integer getGrupos(){
        return getGrupos.size();
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
