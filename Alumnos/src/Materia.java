public class Materia {
    String Nombre;

    public Materia(String nombre) {
        Nombre = nombre;

    }

    @Override
    public String toString() {
        return
                "Nombre='" + Nombre + '\n' +
                '\n';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
