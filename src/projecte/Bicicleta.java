/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

/**
 *
 * @author alumne
 */
public class Bicicleta {
     // TODO code application logic here
        int polzades = 0;
        int pes = 0;
        double preu = 0.0;
        char talla = ' ';
        String marca = null;
        String model = null;
        String tipus = null;
        boolean extres = false;
        boolean omplit = false;

  
        
    public int getPolzades() {
        return polzades;
    }

    public void setPolzades(int polzades) {
        this.polzades = polzades;
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public boolean isExtres() {
        return extres;
    }

    public void setExtres(boolean extres) {
        this.extres = extres;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }
        
}
