package personasmgmt;

public class Trabajador extends Persona{
    private int salario;
    
    public Trabajador(String dni, String nombre, int edad) {
        super(dni, nombre);
        this.setEdad(edad);
    }
    
    public Trabajador(String dni, String nombre, int edad, int salario) {
        this(dni, nombre, edad);
        
        try {
            this.setSalario(salario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setSalario(int salario) throws Exception {
        if(salario > 0){
            this.salario = salario;
        }else{
            throw new Exception("El salario indicado no es correcto");
        }
    }
    
    @Override
    public void setEdad(int edad){
        if(edad >= 18){
            
            try {
                super.setEdad(edad);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
