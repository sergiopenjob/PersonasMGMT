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
    }

    public void ejecutarMenu(int menu) {
        int ini, fin;

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
