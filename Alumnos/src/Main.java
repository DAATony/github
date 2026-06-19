import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Grupo grupo = new Grupo();
        Profesor profesor = new Profesor();
        Alumnos alumnos = new Alumnos();
        Catalogo catalogo = new Catalogo();
        Universidad universidad=new Universidad("Unicersidad Tecnologica de Torreon","Calle matamoros");
        Scanner sc = new Scanner(System.in);
        int opc, opcG, grado, N=0, Edad;
        String Turno,seccion, Nombre, Apellidos, Sexo, Correo, Telefono, Materia, Matricula, NumEmpleado;

        profesor.AgregarProfesor(new Profesor("ramiro","esquivel duran",32,"H",
                "ramiro@uttcampus.edu.mx", "8715651168","028"));
        profesor.AgregarProfesor(new Profesor("marcos israel","aguilar caldera",35,"H",
                "israel@uttcampus.edu.mx","8711551651","043"));

        grupo.getCatalogo();
        grupo.getCatalogo();
        grupo.getCatalogo();
        grupo.getCatalogo();

        grupo.AgregarAlumno(new Alumnos("luis alejandro","galvan gonzales",18,"H",
                "luis@uttcampus.edu.ms","8412684612","25420062"));
        grupo.AgregarAlumno(new Alumnos("gregorio","reyes botello",18,"H",
                "gregorio@uttcampus.edu.ms","8711949651","25420054"));
        grupo.AgregarAlumno(new Alumnos("angel gabriel","fernandez lopez",18,"H",
                "gabriel@uttcampus.edu.ms","8415496151","25420098"));

        alumnos.AgregarMateria(new Materia("Programacion Orientada a Objetos"));
        alumnos.AgregarMateria(new Materia("Calculo Integral"));
        alumnos.AgregarMateria(new Materia("Base de Datos"));

        boolean repetir = true;

        do{

            System.out.println("---Bienvenidos a UTT---");
            System.out.println("1- Grupos");
            System.out.println("2-Alumnos");
            System.out.println("3-Maestros");
            System.out.println("4-Materias");
            System.out.println("0- Salir");

            try{

                opc = sc.nextInt();

                switch (opc){

                    case 1:

                        System.out.println("----Grupos----");
                        System.out.println("1- Crear grupo");
                        System.out.println("2- Lista de grupos");
                        System.out.println("3- Agregar grupo a la universidad");
                        System.out.println("0- Salir");

                        opcG = sc.nextInt();

                        switch (opcG){

                            case 1:
                                System.out.println("Ingresar grado");
                                grado = sc.nextInt();
                                System.out.println("Ingresar seccion");
                                seccion = sc.next();
                                System.out.println("Turno");
                                Turno = sc.next();
                                catalogo.AgregarGrupoCatalogo(new Grupo(grado,seccion,Turno));
                                break;

                            case 2:
                                System.out.println("Los grupos existentes son:");
                                if (catalogo.getCatalogo() > 0) {
                                    for (Grupo p : catalogo.getCatalogo) {
                                        N++;
                                        System.out.println("Grupo " + N);
                                        System.out.println(p);
                                    }
                                }else {
                                    System.out.println("No hay grupos");
                                }
                                break;

                            case 3:
                                if(catalogo.getCatalogo() > 0) {
                                    for (Grupo p : catalogo.getCatalogo) {
                                        N++;
                                        System.out.println("Cual grupo quieres agregar a la universidad?");
                                        System.out.println("Grupo " + N);
                                        System.out.println(p);
                                    }
                                }else{
                                    System.out.println("no hay grupos");
                                }

                                break;

                            case 0:
                                System.out.println("saliendo");
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }break;

                    case 2:

                        System.out.println("----Alumnos----");
                        System.out.println("1- Ingresar alumno");
                        System.out.println("2- Lista de alumnos");
                        System.out.println("0- Salir");

                        opcG = sc.nextInt();

                        switch (opcG){

                            case 1:
                                System.out.println("Nombre del alumno");
                                Nombre = sc.next();
                                System.out.println("Apellido del alumno");
                                Apellidos = sc.next();
                                System.out.println("Edad del alumno");
                                Edad = sc.nextInt();
                                System.out.println("Sexo");
                                Sexo = sc.next();
                                System.out.println("Correo del alumno");
                                Correo = sc.next();
                                System.out.println("Numero de telefono");
                                Telefono = sc.next();
                                System.out.println("Matricula del alumno");
                                Matricula = sc.next();

                                grupo.AgregarAlumno(new Alumnos(Nombre,Apellidos,Edad,Sexo,Correo,Telefono,Matricula));
                                break;

                            case 2:
                                System.out.println("Los alumnos existentes son:");
                                      if(grupo.getAlumnos() > 0) {
                                          for (Alumnos p : grupo.getAlumnos) {
                                              N++;
                                              System.out.println("Alumnos " + N);
                                              System.out.println(p);
                                          }
                                      }else{
                                          System.out.println("No hay alumnos");
                                      }
                                break;

                            case 0:
                                System.out.println("saliendo");
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }break;

                    case 3:

                        System.out.println("----Maestros----");
                        System.out.println("1- Ingresar maestro");
                        System.out.println("2- Lista de maestros");
                        System.out.println("0- Salir");

                        opcG = sc.nextInt();

                        switch (opcG){

                            case 1:
                                System.out.println("Nombre del maestro");
                                Nombre = sc.next();
                                System.out.println("Apellido del maestro");
                                Apellidos = sc.next();
                                System.out.println("Edad del maestro");
                                Edad = sc.nextInt();
                                System.out.println("Sexo");
                                Sexo = sc.next();
                                System.out.println("Correo del maestro");
                                Correo = sc.next();
                                System.out.println("Numero de telefono");
                                Telefono = sc.nextLine();
                                System.out.println("Numero de empleado");
                                NumEmpleado = sc.next();
                                System.out.println("Especialidad del maestro");
                                Materia = sc.nextLine();

                                profesor.AgregarProfesor(new Profesor(Nombre,Apellidos,Edad,Sexo,Correo,Telefono,NumEmpleado));
                                break;

                            case 2:
                                System.out.println("Los profesores existentes son:");
                                if(profesor.getProfesores() > 0) {
                                    for (Profesor p : profesor.getProfesores) {
                                        N++;
                                        System.out.println("Profesores " + N);
                                        System.out.println(p);
                                    }
                                }else {
                                    System.out.println("No hay profesores");
                                }
                                break;


                            case 0:
                                System.out.println("saliendo");
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }break;

                    case 4:

                        System.out.println("----Materias----");
                        System.out.println("1- Crear materia");
                        System.out.println("2- Lista de materias");
                        System.out.println("0- Salir");

                        opcG = sc.nextInt();

                        switch (opcG){

                            case 1:
                                System.out.println("Ingresar nombre de la materia");
                                Materia = sc.next();
                                alumnos.AgregarMateria(new Materia(Materia));
                                break;

                            case 2:
                                System.out.println("Los grupos existentes son:");
                                if (alumnos.getMaterias() > 0) {
                                    for (Materia p : alumnos.getMaterias) {
                                        N++;
                                        System.out.println("Grupo " + N);
                                        System.out.println(p);
                                    }
                                }else {
                                    System.out.println("No hay materias");
                                }
                                break;


                            case 0:
                                System.out.println("saliendo");
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }break;


                    case 0:
                        System.out.println("Saliendo del sistema");
                        repetir = false;
                        break;

                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            }catch (Exception e){
                System.out.println("Error: Opcion invalida");
                sc.nextLine();
            }
        }while (repetir);

    }
}