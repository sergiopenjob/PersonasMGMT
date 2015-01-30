package personasmgmt;

public abstract class Persona {
    private String  dni;
    private String  nombre;
    private int     edad = -1;

    public Persona(String dni, String nombre) {
        this.setDni(dni);
        this.setNombre(nombre);
    }
    public Persona(String dni, String nombre, int edad) throws Exception {
        this(dni, nombre);
        this.setEdad(edad);
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws Exception{
        if(edad < 120)
            this.edad = edad;
        else
            throw new Exception("La edad debe ser menor de 120");
    }
    
    public void setNuevoEstudiante(Estudiante e){
        // Aqui se añadirá el estudiante al arraylist
    }
    
    public void setNuevoTrabajador(Trabajador t){
        // Aqui se añadirá el trabajador al arraylist
    }
    
    @Override
    public String toString(){
        String info = "\n"
                    + "[INFO PERSONA]\n"
                    + "Nombre: " + getNombre() + "\n"
                    + "DNI: " + getDni() + "\n";   
        
        if(getEdad() == -1)
            return info;
        else
            return info + "Edad: " + getEdad() + "\n";
    }
}
