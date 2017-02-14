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

    private static final int MAX_BICICLETES = 2;
    //Array on guardarem la inforamació de les bicicletes
    private static Bicicleta[] array = new Bicicleta[MAX_BICICLETES];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int polzades = 0, pes = 0, menu;
        double preu = 0.0;
        char extra = ' ', talla = ' ', esS = ' ';
        String marca = null, model = null, tipus = null;
        boolean extres = false, omplit = false;

        do {
            System.out.println("Menú de l'aplicació:\n");
            System.out.println("0. Sortir:");
            System.out.println("1. Afegir Bicicleta:");
            System.out.println("2. Eliminar Bicicleta:");
            System.out.println("3. Modificar Bicicleta:");
            System.out.println("4. Llistar Bicicleta:");
            System.out.println("5. Recuperar Bicicleta:\n");
            menu = entrada.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Sortint...");
                    break;

                case 1:
                    if (!omplit) {
                        System.out.println("Introducció de dades:\n");
                        System.out.println("Marca:");
                        marca = entrada.skip("[\r\n]*").nextLine();
                        System.out.println("Model:");
                        model = entrada.skip("[\r\n]*").nextLine();
                        System.out.println("Tipus:");
                        tipus = entrada.skip("[\r\n]*").nextLine();
                        System.out.println("Talla:");
                        talla = entrada.skip("[\r\n]*").nextLine().charAt(0);
                        System.out.println("Polzades:");
                        polzades = entrada.skip("[\r\n]*").nextInt();
                        System.out.println("Pes:");
                        pes = entrada.skip("[\r\n]*").nextInt();
                        System.out.println("Preu:");
                        preu = entrada.skip("[\r\n]*").nextDouble();
                        System.out.println("Extres (Si/No):");
                        do {
                            extra = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (extra != 'S' && extra != 'N');
                        extres = (extra == 'S');

                        omplit = true;
                    } else {
                        System.out.println("\nJa has introduït dades, si vols omplir-lo esborra'l primer!");
                    }
                    break;

                case 2:
                    if (omplit == true) {
                        System.out.println("\nVols vore les dades? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("\nMarca:" + marca);
                            System.out.println("Model:" + model);
                            System.out.println("Tipus:" + tipus);
                            System.out.println("Talla:" + talla);
                            System.out.println("Polzades:" + polzades);
                            System.out.println("Pes:" + pes);
                            System.out.println("Preu:" + preu);
                            System.out.println("Extres (Si/No):" + extra);
                        }
                        System.out.println("\nVols esborrar les dades? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            omplit = false;
                            System.out.println("\nDades esborrades correctament");
                        } else {
                            System.out.println("\nNo s'han esborrat les Dades");
                        }
                    } else {
                        System.out.println("\nNo hi han dades Introduïdes!");
                    }
                    break;

                case 3:
                    if (omplit == true) {
                        System.out.println("\nVols vore les dades? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("\nMarca:" + marca);
                            System.out.println("Model:" + model);
                            System.out.println("Tipus:" + tipus);
                            System.out.println("Talla:" + talla);
                            System.out.println("Polzades:" + polzades);
                            System.out.println("Pes:" + pes);
                            System.out.println("Preu:" + preu);
                            System.out.println("Extres (Si/No):" + extra);
                        }
                        System.out.println("\nVols Modificar les dades? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("\nMarca: " + marca);
                        }
                        System.out.println("\nVols canviar la Marca? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("Marca: ");
                            marca = entrada.skip("[\r\n]*").nextLine();
                        }
                        System.out.println("\nModel: " + model);
                        System.out.println("\nVols canviar de Model? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("Model: ");
                            model = entrada.skip("[\r\n]*").nextLine();
                        }
                        System.out.println("\nTipus: " + tipus);
                        System.out.println("\nVols canviar de Tipus? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("Tipus: ");
                            tipus = entrada.skip("[\r\n]*").nextLine();
                        }
                        System.out.println("\nTalla: " + talla);
                        System.out.println("\nVols canviar de Talla? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("Talla: ");
                            talla = entrada.skip("[\r\n]*").nextLine().charAt(0);
                        }
                        System.out.println("\nPolzades: " + polzades);
                        System.out.println("\nVols canviar de Polzades? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("Polzades: ");
                            polzades = entrada.skip("[\r\n]*").nextInt();
                        }
                        System.out.println("\nPes: " + pes);
                        System.out.println("\nVols canviar de Pes? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("Pes: ");
                            pes = entrada.skip("[\r\n]*").nextInt();
                        }
                        System.out.println("\nPreu: " + preu);
                        System.out.println("\nVols canviar el Preu? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("Preu: ");
                            preu = entrada.skip("[\r\n]*").nextDouble();
                        }
                        System.out.println("\nExtres (Si/No): " + extra);
                        System.out.println("\nVols ficar Extres? (Si/No)");
                        do {
                            esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esS != 'S' && esS != 'N');
                        if (esS == 'S') {
                            System.out.println("Extres: ");
                            do {
                                extra = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                            } while (extra != 'S' && extra != 'N');
                            extres = (extra == 'S');

                            omplit = true;
                        }
                    } else {
                        System.out.println("\nNo hi han dades Introduïdes!\n");
                    }
                    break;

                case 4:
                    if (omplit == true) {
                        System.out.println("\nMarca:" + marca);
                        System.out.println("Model:" + model);
                        System.out.println("Tipus:" + tipus);
                        System.out.println("Talla:" + talla);
                        System.out.println("Polzades:" + polzades);
                        System.out.println("Pes:" + pes);
                        System.out.println("Preu:" + preu);
                        System.out.println("Extres (Si/No):" + extra);
                    } else {
                        System.out.println("\nNo hi han dades Introduïdes!\n");
                    }
                    break;

                case 5:
                    if (!omplit) {

                        char siNo;
                        do {
                            System.out.println("\nVols vore el Bici?(S/N):");
                            siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            System.out.println("\nMarca: " + marca);
                            System.out.println("Model: " + model);
                            System.out.println("Preu: " + preu);
                        }

                        do {
                            System.out.println("\nVols recuperar la Bici?(S/N):");
                            siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            omplit = true;
                            System.out.println("Bici recuperada correctament.");
                        } else {
                            System.out.println("La Bici no s'ha recuperat.");
                        }

                    } else {
                        System.out.println("\nNo hi ha bicis per recuperar, si vols primer borra'n.");
                    }

                    break;
                default:
                    System.out.println("\nOpció incorrecta!\n");
            }
        } while (!(menu == 0));
    }

}
