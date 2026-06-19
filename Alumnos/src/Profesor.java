import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    String num_empleado;
    public Materia materia;

    public Profesor(String nombre, String apellidos, int edad, String sexo, String correo, String telefono, String num_empleado) {
        super(nombre, apellidos, edad, sexo, correo, telefono);
        this.num_empleado = num_empleado;
    }

    public Profesor() {
    }

    @Override
    public String toString() {
        return
                "num_empleado= " + num_empleado + '\n' +
                "Nombre= " + Nombre + '\n' +
                "Apellidos= " + Apellidos + '\n' +
                "edad= " + edad + '\n';
    }

    public String getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(String num_empleado) {
        this.num_empleado = num_empleado;
    }

    public List<Profesor> getProfesores = new ArrayList<>();
    public void AgregarProfesor(Profesor profesor){
        getProfesores.add(profesor);
    }
    public Integer getProfesores(){
        return getProfesores.size();
    }


}
