package personasmgmt;

public class Trabajador extends Persona{
    private int salario;

    public Trabajador(String dni, String nombre) {
        super(dni, nombre);
        this.salario = 0;
    }

    public Trabajador(String dni, String nombre, int salario) {
        super(dni, nombre);

        if(salario > 0)
            this.salario = salario;
    }
    
    public Trabajador(int edad, String dni, String nombre) {
        this(dni, nombre);
        
        if(edad >= 18){
            super.setEdad(edad);
        }
    }

    public Trabajador(String dni, String nombre, int salario, int edad) {
        this(dni, nombre, salario);
        
        if(edad >= 18){
            super.setEdad(edad);
        }
    }
}
