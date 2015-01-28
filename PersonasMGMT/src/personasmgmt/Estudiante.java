package personasmgmt;

public class Estudiante extends Persona{
    private String estudios;
    
    public Estudiante(String dni, String nombre, String estudios) {
        super(dni, nombre);
        this.estudios = estudios;
    }

    public Estudiante(String dni, String nombre, int edad, String estudios) {
        super(dni, nombre, edad);
        this.estudios = estudios;
    }
    
    
}
