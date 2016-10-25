/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int polzades = 0, pes = 0, menu;
        double preu = 0.0;
        char talla = ' ';
        String marca = null, model = null, tipus = null;
        boolean extres = false;

        do {
            System.out.println("Menú de l'aplicació:\n");
            System.out.println("0. Sortir:");
            System.out.println("1. Afegir Bicicleta:");
            System.out.println("2. Eliminar Bicicleta:");
            System.out.println("3. Modificar Bicicleta:");
            System.out.println("4. Llistar Bicicleta:");
            menu = entrada.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Sortint...");
                    break;

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opció incorrecta!\n");
            }
        } while (!(menu == 0));
    }
}
