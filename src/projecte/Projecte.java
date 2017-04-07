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

    private static final int MAX_BICICLETES = 20;
    //Array on guardarem la inforamació de les bicicletes
    private static Bicicleta[] array = new Bicicleta[MAX_BICICLETES];

    private static int opcio;

    private static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inicialitzarVariables();
        do {
            demanarOpcio();
            tractarOpcio();
        } while (!opcioFinal());
        tractamentFinal();

    }

    public static void tractamentFinal() {
        entrada.close();
    }

    public static void inicialitzarVariables() {

        for (int i = 0; i < array.length; i++) {
            array[i] = new Bicicleta();
            array[i].setOmplit(false);
        }
    }

    public static void demanarOpcio() {
        //Scanner ent = new Scanner(System.in);

        System.out.println("\n\nMenú de l'aplicació.");
        System.out.println("0. Sortir.");
        System.out.println("1. Introduïr Bicicleta.");
        System.out.println("2. Modificar Bicicleta.");
        System.out.println("3. Borrar Bicicleta.");
        System.out.println("4. Llistar Bicicleta.");
        System.out.println("5. Recuperar Bicicleta borrada.");
        opcio = entrada.skip("[\r\n]*").nextInt();
        //ent.close();
    }

    public static void tractarOpcio() {

        switch (opcio) {
            case 0:
                System.out.println("Adéu!!");
                break;
            case 1:
                introduirBicicleta();
                break;
            case 2:
                modificarBicicleta();
                break;
            case 3:
                borrarBicicleta();
                break;
            case 4:
                llistarBicicletes();
                break;
            case 5:
                recuperarBicicleta();
                break;
            default:
                System.out.println("\nOpció incorrecta!!");
        }

    }

    public static boolean opcioFinal() {
        return opcio == 0;
    }

    public static void introduirBicicleta() {
        Scanner entrada = new Scanner(System.in);
        int i;
        for (i = 0; i < array.length && array[i].isOmplit(); i++);

        if (i < array.length) {
            System.out.println("Introducció de dades:\n");
            System.out.println("Marca:");
            array[i].setMarca(entrada.skip("[\r\n]*").nextLine());
            System.out.println("Model:");
            array[i].setModel(entrada.skip("[\r\n]*").nextLine());
            System.out.println("Tipus:");
            array[i].setTipus(entrada.skip("[\r\n]*").nextLine());
            System.out.println("Talla:");
            array[i].setTalla(entrada.skip("[\r\n]*").nextLine().charAt(0));
            System.out.println("Polzades:");
            array[i].setPolzades(entrada.skip("[\r\n]*").nextInt());
            System.out.println("Pes:");
            array[i].setPes(entrada.skip("[\r\n]*").nextInt());
            System.out.println("Preu:");
            array[i].setPreu(entrada.skip("[\r\n]*").nextDouble());

            char esExtra;
            do {
                System.out.println("Extres (Si/No):");
                esExtra = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (esExtra != 'S' && esExtra != 'N');
            array[i].setExtres(esExtra == 'S');
            array[i].setOmplit(true);
        } else {
            System.out.println("\nJa has introduït dades, si vols omplir-lo esborra'l primer!");
        }
    }

    public static void modificarBicicleta() {
        Scanner entrada = new Scanner(System.in);
        char esS = 'N';
        int i;
        for (i = 0; i < array.length && esS != 'S' && esS != 'F'; i++) {
            if (array[i].isOmplit()) {
                System.out.println("\nVols vore les dades? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("\nMarca:" + array[i].getMarca());
                    System.out.println("Model:" + array[i].getModel());
                    System.out.println("Tipus:" + array[i].getTipus());
                    System.out.println("Talla:" + array[i].getTalla());
                    System.out.println("Polzades:" + array[i].getPolzades());
                    System.out.println("Pes:" + array[i].getPes());
                    System.out.println("Preu:" + array[i].getPreu());
                    System.out.println("Extres (Si/No):" + array[i].isExtres());
                }
                System.out.println("\nVols Modificar les dades? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("\nMarca: " + array[i].getMarca());
                }
                System.out.println("\nVols canviar la Marca? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("Marca: ");
                    array[i].setMarca(entrada.skip("[\r\n]*").nextLine());
                }
                System.out.println("\nModel: " + array[i].getModel());
                System.out.println("\nVols canviar de Model? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("Model: ");
                    array[i].setModel(entrada.skip("[\r\n]*").nextLine());
                }
                System.out.println("\nTipus: " + array[i].getTipus());
                System.out.println("\nVols canviar de Tipus? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("Tipus: ");
                    array[i].setTipus(entrada.skip("[\r\n]*").nextLine());
                }
                System.out.println("\nTalla: " + array[i].getTalla());
                System.out.println("\nVols canviar de Talla? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("Talla: ");
                    array[i].setTalla(entrada.skip("[\r\n]*").nextLine().charAt(0));
                }
                System.out.println("\nPolzades: " + array[i].getPolzades());
                System.out.println("\nVols canviar de Polzades? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("Polzades: ");
                    array[i].setPolzades(entrada.skip("[\r\n]*").nextInt());
                }
                System.out.println("\nPes: " + array[i].getPes());
                System.out.println("\nVols canviar de Pes? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("Pes: ");
                    array[i].setPes(entrada.skip("[\r\n]*").nextInt());
                }
                System.out.println("\nPreu: " + array[i].getPreu());
                System.out.println("\nVols canviar el Preu? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("Preu: ");
                    array[i].setPreu(entrada.skip("[\r\n]*").nextDouble());
                }
                System.out.println("\nExtres (Si/No): " + array[i].isExtres());
                System.out.println("\nVols ficar Extres? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("Extres: ");
                    char esExtra;
                    do {
                        System.out.println("Extres (Si/No):");
                        esExtra = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                    } while (esExtra != 'S' && esExtra != 'N');
                    array[i].setExtres(esExtra == 'S');
                    array[i].setOmplit(true);
                }
            } else {
                System.out.println("\nNo hi han dades Introduïdes!\n");
            }
        }
    }

    public static void borrarBicicleta() {
        Scanner entrada = new Scanner(System.in);
        char esS = 'N';
        int i;
        for (i = 0; i < array.length && esS != 'F'; i++) {
            if (array[i].isOmplit()) {
                System.out.println("\nVols vore les dades? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("\nMarca:" + array[i].getMarca());
                    System.out.println("Model:" + array[i].getModel());
                    System.out.println("Tipus:" + array[i].getTipus());
                    System.out.println("Talla:" + array[i].getTalla());
                    System.out.println("Polzades:" + array[i].getPolzades());
                    System.out.println("Pes:" + array[i].getPes());
                    System.out.println("Preu:" + array[i].getPreu());
                    System.out.println("Extres (Si/No):" + array[i].isExtres());
                }
                System.out.println("\nVols esborrar les dades? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
            }
            if (esS == 'S') {
                array[i].setOmplit(true);
                System.out.println("\nDades esborrades correctament");
            } else {
                System.out.println("\nNo s'han esborrat les Dades");
            }
        }

    }

    public static void llistarBicicletes() {
        Scanner entrada = new Scanner(System.in);
        char esS = 'N';
        int i;
        for (i = 0; i < array.length && esS != 'S' && esS != 'F'; i++) {
            if (array[i].isOmplit()) {
                System.out.println("\nVols vore les dades? (Si/No)");
                do {
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("\nMarca:" + array[i].getMarca());
                    System.out.println("Model:" + array[i].getModel());
                    System.out.println("Tipus:" + array[i].getTipus());
                    System.out.println("Talla:" + array[i].getTalla());
                    System.out.println("Polzades:" + array[i].getPolzades());
                    System.out.println("Pes:" + array[i].getPes());
                    System.out.println("Preu:" + array[i].getPreu());
                    System.out.println("Extres (Si/No):" + array[i].isExtres());
                }
            } else {
                System.out.println("\nNo hi han dades Introduïdes!\n");
            }
        }
    }

    public static void recuperarBicicleta() {
        Scanner entrada = new Scanner(System.in);
        char esS = 'N';
        int i;
        for (i = 0; i < array.length && esS != 'S' && esS != 'F'; i++) {

            if (!array[i].isOmplit()) {

                do {
                    System.out.println("\nVols vore el Bici?(S/N):");
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    System.out.println("\nMarca: " + array[i].getMarca());
                    System.out.println("Model: " + array[i].getModel());
                    System.out.println("Preu: " + array[i].getPes());
                }

                do {
                    System.out.println("\nVols recuperar la Bici?(S/N):");
                    esS = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esS != 'S' && esS != 'N');
                if (esS == 'S') {
                    array[i].isOmplit();
                    System.out.println("Bici recuperada correctament.");
                } else {
                    System.out.println("La Bici no s'ha recuperat.");
                }

            } else {
                System.out.println("\nNo hi ha bicis per recuperar, si vols primer borra'n.");
            }
        }
    }
}
