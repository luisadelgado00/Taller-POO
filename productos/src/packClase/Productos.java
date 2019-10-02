/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packClase;

import javax.swing.JTextField;

/**
 *
 * @author Personal
 */
public class Productos {
    
    private int cant;
    private double iva ;
    private double prec;
    private int aux;
    private double tot;
    private int plus;
    private int men;
    
    
    public  Productos(){

}

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cant;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cant = cantidad;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the presio
     */
    public double getPresio() {
        return prec;
    }

    /**
     * @param presio the presio to set
     */
    
    public void setPresio(double presio) {
        this.prec = presio;
    }
    
    /**
     * @return the aux
     */
    public int getAux() {
        return aux;
    }

    /**
     * @param aux the aux to set
     */
    public void setAux(int aux) {
        this.aux = aux;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return tot;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.tot = total;
    }

    /**
     * @return the mas
     */
    public int getMas() {
        return plus;
    }

    /**
     * @param mas the mas to set
     */
    public void setMas(int mas) {
        this.plus = mas;
    }

    /**
     * @return the menos
     */
    public int getMenos() {
        return men;
    }

    /**
     * @param menos the menos to set
     */
    public void setMenos(int menos) {
        this.men = menos;
    }
    
    
}
