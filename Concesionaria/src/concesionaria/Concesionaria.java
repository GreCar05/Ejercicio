/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

import controllers.VehiculoController;
import java.util.ArrayList;
import java.util.List;
import models.Auto;
import models.Moto;
import models.Vehiculo;

/**
 *
 * @author gdeveloper
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
   
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoController vc = new VehiculoController();
        vc.MostarVehiculo();
        vc.VehiculoMasCaro();
        vc.VehiculoMasBarato();
        vc.buscarPorLetra("Y");
        vc.OrdenarVehiculosDesc();
        
    }
    
}
