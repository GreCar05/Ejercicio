/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import models.Auto;
import models.Moto;
import models.Vehiculo;

/**
 *
 * @author gdeveloper
 */
public class VehiculoController {
    
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    public VehiculoController(){
        vehiculos.add(new Auto("Peugeot","206",200000.00,4));
        vehiculos.add(new Moto("Honda","Titan",60000.00,125));
        vehiculos.add(new Auto("Peugeot","208",250000.00,5));
        vehiculos.add(new Moto("Yamaha","YBR",80500.00,160));
    }
    
    public void MostarVehiculo(){
        
        for(int i=0; i < this.vehiculos.size() ; i++){
            vehiculos.get(i).mostrar();
        }
        
        System.out.print("\n===============================\n");   
        
    }
    
    public void VehiculoMasCaro(){
        Vehiculo VmasCaro= null; 
        
        
        for(int i=0; i < this.vehiculos.size() ; i++){
            if(i==0){
                VmasCaro = vehiculos.get(i);
            } else if (vehiculos.get(i).getPrecio() > VmasCaro.getPrecio()){
                VmasCaro = vehiculos.get(i);
            }
     
        }
        System.out.print("\nVehiculo Mas Caro: "+VmasCaro.getMarca()+" "+VmasCaro.getModelo());
        
        
    }
    
    public void VehiculoMasBarato(){
        
        Vehiculo VmasBarato= null; 
        
        
        for(int i=0; i < this.vehiculos.size() ; i++){
            if(i==0){
                VmasBarato = vehiculos.get(i);
            } else if (vehiculos.get(i).getPrecio() < VmasBarato.getPrecio()){
                VmasBarato = vehiculos.get(i);
            }
     
        }
        System.out.print("\nVehiculo Mas Barato: "+ VmasBarato.getMarca()+" "+VmasBarato.getModelo());
        
    }
    
    public void buscarPorLetra(String letra){
        
        System.out.print("\nVehículo que contiene en el modelo la letra '"+letra+"': ");
        for(int i=0; i < this.vehiculos.size() ; i++){
            if(this.vehiculos.get(i).getModelo().indexOf(letra) == 0) {
                System.out.print("\n "+vehiculos.get(i).getMarca()+" "+vehiculos.get(i).getModelo()+" $"+vehiculos.get(i).getPrecio());
                
            }
            
        }
        
    }
    
    public void OrdenarVehiculosDesc(){
        
        List<Vehiculo> orderVehiculo = this.vehiculos;
        Vehiculo Aux=null;
        System.out.print("\n====================================\n");
        System.out.print("Vehículos ordenados por precio de mayor a menor:\n");
        for (int x = 0; x < orderVehiculo.size(); x++) {
            for (int i = 0; i < orderVehiculo.size()-x-1; i++) {
                if(orderVehiculo.get(i).getPrecio() < orderVehiculo.get(i+1).getPrecio()){
                    Aux = orderVehiculo.get(i+1);
                   orderVehiculo.set(i+1, orderVehiculo.get(i));
                   orderVehiculo.set(i, Aux);
                }
            }
        }
        
        
        for(int i=0; i < orderVehiculo.size();i++){
            System.out.print(" "+orderVehiculo.get(i).getMarca()+" $"+orderVehiculo.get(i).getPrecio()+"\n");
        }
        
        System.out.print("===============================\n");
        
        
        
    }
}
