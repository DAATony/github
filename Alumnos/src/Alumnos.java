import java.util.ArrayList;
import java.util.List;

public class Alumnos extends Persona{
    String matricula;

    public Alumnos(String nombre, String apellidos, int edad, String sexo, String correo, String telefono, String matricula) {
        super(nombre, apellidos, edad, sexo, correo, telefono);
        this.matricula = matricula;
    }

    public Alumnos() {
    }

    @Override
    public String toString() {
        return
                "matricula= " + matricula + '\n' +
                "Nombre= " + Nombre + '\n' +
                "Apellidos= " + Apellidos + '\n' +
                "Edad= " + edad + '\n';
    }

    public List<Materia> getMaterias = new ArrayList<>();
    public void AgregarMateria(Materia materia){
        getMaterias.add(materia);
    }
    public Integer getMaterias(){
        return getMaterias.size();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return Nombre;
    }
}
