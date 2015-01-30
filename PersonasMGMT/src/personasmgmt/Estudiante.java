package personasmgmt;

public class Estudiante extends Persona{
    private String estudios;
    
    public Estudiante(String dni, String nombre, String estudios) {
        super(dni, nombre);
        this.setEstudios(estudios);
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
}
