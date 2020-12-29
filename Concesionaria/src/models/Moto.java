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
public class Moto extends Vehiculo{
    private int Cilindradas;
    
    
     public Moto(String Marca, String Modelo, Double Precio, int Cilindradas){
        super(Marca,Modelo,Precio);
        this.Cilindradas = Cilindradas;
    }
     
    @Override
     public void mostrar(){
         System.out.print(" \n Marca: "+this.getMarca());
         System.out.print(" // Modelo: "+this.getModelo());
         System.out.print(" // Cilindrada: "+this.getCilindradas());
         System.out.print(" // Precio: $"+this.getPrecio());
         
     }
    
    

    /**
     * @return the Cilindradas
     */
    public int getCilindradas() {
        return Cilindradas;
    }

    /**
     * @param Cilindradas the Cilindradas to set
     */
    public void setCilindradas(int Cilindradas) {
        this.Cilindradas = Cilindradas;
    }
    
    
}
