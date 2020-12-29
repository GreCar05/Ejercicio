/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author gdeveloper
 */
public class Auto extends Vehiculo{
    private int puertas;
    
    public Auto(String Marca, String Modelo, Double Precio, int puertas){
        super(Marca,Modelo,Precio);
        this.puertas = puertas;
    }
    
    
     @Override
     public void mostrar(){
         System.out.print(" \n Marca: "+this.getMarca());
         System.out.print(" // Modelo: "+this.getModelo());
         System.out.print(" // Puertas: "+this.getPuertas());
         System.out.print(" // Precio: $"+this.getPrecio());
         
     }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
}
