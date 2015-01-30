package personasmgmt;

public class Estudiante extends Persona{
    private String estudios;
    
    public Estudiante(String dni, String nombre, String estudios) {
        super(dni, nombre);
        this.setEstudios(estudios);
    }

    public Estudiante(String dni, String nombre, String estudios, int edad) {
        this(dni, nombre, estudios);
        this.setEdad(edad);
    }
    
    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
    
    @Override
    public void setEdad(int edad){
        try {
            super.setEdad(edad);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
