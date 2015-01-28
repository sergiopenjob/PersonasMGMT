package personasmgmt;

public abstract class Persona {
    private String  dni;
    private String  nombre;
    private int     edad;

    public Persona(String dni, String nombre) {
        this.dni    = dni;
        this.nombre = nombre;
        this.edad   = 0;
    }
    public Persona(String dni, String nombre, int edad) {
        this(dni, nombre);
        
        if(edad < 120)
            this.edad = edad;
        else
            this.edad = 0;
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
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        String info = "\n"
                    + "[INFO PERSONA]\n"
                    + "Nombre: " + getNombre() + "\n"
                    + "DNI: " + getDni() + "\n";        
        if(getEdad() == 0)
            return info;
        else
            return info + "Edad: " + getEdad() + "\n";
    }
}
