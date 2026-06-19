import java.util.ArrayList;
import java.util.List;

public class Grupo {
    public int Grado;
    public String Seccion;
    public String Turno;

    public Grupo(int grado, String seccion, String turno) {
        Grado = grado;
        Seccion = seccion;
        Turno = turno;
    }

    public Grupo() {
    }

    @Override
    public String toString() {
        return
                "Grado=" + Grado + '\n' +
                "Seccion='" + Seccion + '\n' +
                "Turno='" + Turno + '\n' ;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int grado) {
        Grado = grado;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String seccion) {
        Seccion = seccion;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    public List<Grupo> getCatalogo = new ArrayList<>();
    public void AgregarGrupoCatalogo(Grupo grupo){
        getCatalogo.add(grupo);
    }
    public Integer getCatalogo(){
        return getCatalogo.size();
    }

    public List<Alumnos> getAlumnos = new ArrayList<>();
    public void AgregarAlumno(Alumnos alumno){
        getAlumnos.add(alumno);
    }
    public Integer getAlumnos(){
        return getAlumnos.size();
    }

}
