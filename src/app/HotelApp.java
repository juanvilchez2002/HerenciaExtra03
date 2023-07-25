/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import entidad.Alojamiento;
import entidad.Camping;
import entidad.ExtraHotelero;
import entidad.Hotel;
import entidad.Hotel4;
import entidad.Hotel5;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import service.AlojamientoServices;


public class HotelApp {


    public static void main(String[] args) {
        
        AlojamientoServices as = new AlojamientoServices();
        as.crearAlojamiento();
        as.menu();
        
        
//        ArrayList<Hotel> h = new ArrayList();
//        
//        h.add(new Hotel4('A', "Patita Frita", 69, 50, 150, 3, 50.0, "Hotel 3", "Direccion 1", "Santa Fe", "Luciano"));
//        h.add(new Hotel4('B', "Presa Fresa", 60, 40, 100, 2, 50.0, "Arruga Maruja", "Direccion 2", "San Juan", "Amilcar"));
//        h.add(new Hotel5(2, 3, 5, 'A', "Moño Rojo", 50, 60, 120, 3, 50.0, "NetFlix", "Direccion 3", "Buenos Aires", "Pablo"));
//        h.add(new Hotel5(1, 5, 3, 'A', "Pio Chicken", 30, 30, 80, 2, 50.0, "Huachin", "Direccion 4", "Cordova", "Bananero"));
//        
//        precioHabitacion(h);        
//      
//        Collections.sort(h, new Comparator<Hotel>() {
//            public int compare(Hotel o1, Hotel o2) {
//                return o2.getPrecioHabitacion().compareTo(o1.getPrecioHabitacion());
//            }
//        });
//                
//        for(Hotel hh: h){
//            System.out.println(hh.toString());
//        }
//        
//        ArrayList<ExtraHotelero> eh = new ArrayList();
//        
//        eh.add(new Camping(45, 10, false, false, 500, "Viento Frio", "Direccion 5", "Huaral", "Pablo"));
//        eh.add(new Camping(30, 5, true, false, 650, "Gota Gorda", "Direccion 6", "Huacho", "Luisiana"));
//        eh.add(new Residencia(35, true, false, true, 750, "Muerto Tuerto", "Direccion 7", "Lima", "Juan Alberto"));
//        eh.add(new Residencia(15, true, false, false, 450, "Al Filo", "Direccion 8", "Campiña", "Carolina"));
//        
        
    }
    
    public static void precioHabitacion(ArrayList<Hotel> h){
        
        Double precioActualizado=0d;
        
        for(Hotel hh: h){
            
            if (hh instanceof Hotel5) {
                Hotel5 obj = (Hotel5) hh;      
                precioActualizado = obj.precioHabitacion(obj.getCapacidadRestaurante(), obj.getTipoGimnasio(), obj.getCantLimosinas() ,obj.getNroHabitaciones());
                obj.setPrecioHabitacion(obj.getPrecioHabitacion()+precioActualizado);                
            }else{                
                Hotel4 obj = (Hotel4) hh; 
                precioActualizado = obj.precioHabitacion(obj.getCapacidadRestaurante(), obj.getTipoGimnasio(), obj.getNroHabitaciones());
                obj.setPrecioHabitacion(obj.getPrecioHabitacion()+precioActualizado);  
            }            
        }
    }
    
}
