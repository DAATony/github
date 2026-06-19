public class Persona {
    String Nombre;
    String Apellidos;
    int edad;
    String Sexo;
    String Correo;
    String Telefono;

    public Persona(String nombre, String apellidos, int edad, String sexo, String correo, String telefono) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
        Sexo = sexo;
        Correo = correo;
        Telefono = telefono;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
}
