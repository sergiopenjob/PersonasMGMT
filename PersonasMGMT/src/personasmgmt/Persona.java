package personasmgmt;

public abstract class Persona {
    private String  dni;
    private String  nombre;
    private int     edad;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public Persona(String dni, String nombre, int edad) {
        this(dni, nombre);
        this.edad = edad;
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
}
