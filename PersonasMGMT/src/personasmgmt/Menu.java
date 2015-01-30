package personasmgmt;

import java.util.Scanner;

public class Menu {

    private final Scanner scn       = new Scanner(System.in);
    private final int SALIR_MENU    = 0;

    public void menuMain() {
        int opcion = -1;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(scn.nextLine());
            
            ejecutarMenuPrincipal(opcion);
        } while (opcion != SALIR_MENU);

        System.out.println("Hasta luego!");
    }

    public void mostrarMenu() {
        limpiarPantalla();
        
        // Menu del programa
        System.out.println(
                "===================================\n"
                + "\tGestión de Personas\n"
                + "===================================\n"
                + "1.-\tAñadir Persona\n"
                + "2.-\tModificar Persona\n"
                + "3.-\tBorrar Persona\n"
                + "4.-\tMostrar Persona\n"
                + "5.-\tListar Persona\n"
                + "-----------------------------------\n"
                + "0.-\tSalir de la Aplicación\n"
                + "\"===================================\n"
                + "Indique una Opción: ");
    }
    
    public void mostrarMenuAnadirPersona() {
        limpiarPantalla();
        
        // Menu del programa
        System.out.println(
                "===================================\n"
                + "\tAñadir Persona\n"
                + "===================================\n"
                + "1.-\tEstudiante\n"
                + "2.-\tTrabajador\n"
                + "-----------------------------------\n"
                + "0.-\tVolver al Menú Principal\n"
                + "\"===================================\n"
                + "Indique una Opción: ");
    }

    public void ejecutarMenuPrincipal(int menu) {
        limpiarPantalla();

        switch (menu) {
            // Ejecucion del programa
            case 1:
                int accion;
                
                do {
                    mostrarMenuAnadirPersona();
                    accion = Integer.parseInt(scn.nextLine());
                    ejecutarFormularioAnadirPersona(accion);
                } while (accion != SALIR_MENU);
                
                
                break;
        }
    }

    public void limpiarPantalla() {
        for (int i = 0; i <= 25; i++) {
            System.out.println();
        }
    }

    public void continuar() {
        int continuar;

        do {
            System.out.println("\n\nPulse 0 para volver al menú principal...");
            continuar = Integer.parseInt(scn.nextLine());
        } while (continuar != SALIR_MENU);

        limpiarPantalla();
    }

    private void ejecutarFormularioAnadirPersona(int accion) {
        limpiarPantalla();
        
        switch(accion){
            // AÑADIR LAS EXCEPCIONES PARA LOS TRY CATCHes CORRESPONDIENTES
            case 1: // Estudiante
                System.out.println(
                "===================================\n"
                + "\tFORMULARIO ESTUDIANTE\n"
                + "===================================\n");

                System.out.println("Indique su Nombre: ");
                String nombre = scn.nextLine();
                
                System.out.println("\nIndique su DNI: ");
                String dni = scn.nextLine();
                
                System.out.println("\nIndique sus Estudios: ");
                String estudios = scn.nextLine();
                
                System.out.println("\n¿Quiere indicar su edad?\nSi(1) / No(0)");
                int acepto = Integer.parseInt(scn.nextLine());;
                
                boolean salir = false;
                
                do{
                    Persona p;
                    
                    switch(acepto){
                        case 1:
                            System.out.println("\nIndique su edad: ");
                            int edad = Integer.parseInt(scn.nextLine());;
                            
                            // Aqui se guardará el estudiante CON EDAD
                             p.setNuevoEstudiante(new Estudiante(dni, nombre, estudios, edad));
                             
                             salir = true;
                            break;
                            
                        case 0:
                            // Aqui se guardará el estudiante SIN EDAD
                            p.setNuevoEstudiante(new Estudiante(dni, nombre, estudios));
                            
                            salir = true;
                            break;
                    }
                }while(!salir);
                
                System.out.println("\n (+) UN NUEVO ESTUDIANTE HA SIDO AGREGADO! (+)");
                continuar();
                break;
            
            case 2: // Trabajador
                System.out.println("\nEN CONSTRUCCION\n");
                continuar();
                break;
        }
    }
}
