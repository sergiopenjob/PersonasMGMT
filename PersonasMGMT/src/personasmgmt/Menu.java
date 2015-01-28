package personasmgmt;

import java.util.Scanner;

public class Menu {

    private final Scanner scn       = new Scanner(System.in);
    private final int SALIR_MENU    = 0;

    public void menuMain() {
        int menu = 0;

        do {
            mostrarMenu();
            menu = scn.nextInt();
            ejecutarMenu(menu);
        } while (menu != SALIR_MENU);

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
                + "-----------------------------------"
                + "0.-\tSalir de la Aplicacion\n"
                + "\"===================================\n"
                + "Indice una Opcion: ");
        
        int opcion = scn.nextInt();
        ejecutarMenu(opcion);
    }

    public void ejecutarMenu(int menu) {
        limpiarPantalla();

        switch (menu) {
            // Ejecucion del programa
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
            continuar = scn.nextInt();
        } while (continuar != SALIR_MENU);

        limpiarPantalla();
    }
}
