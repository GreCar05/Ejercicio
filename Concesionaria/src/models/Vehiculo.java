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
public class Vehiculo implements interfaz{
    private String Marca;
    private String Modelo;
    private Double Precio;

    public Vehiculo(){
        
    }
    
    public Vehiculo(String Marca, String Modelo, Double Precio){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }
    
    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Precio
     */
    public Double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
