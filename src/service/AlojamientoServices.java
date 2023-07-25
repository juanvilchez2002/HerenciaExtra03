
package service;

import entidad.Camping;
import entidad.ExtraHotelero;
import entidad.Hotel;
import entidad.Hotel4;
import entidad.Hotel5;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class AlojamientoServices {
    
    ArrayList<Hotel> h = new ArrayList();
    ArrayList<ExtraHotelero> eh = new ArrayList();
    Scanner consola = new Scanner(System.in);
    
    public void crearAlojamiento(){
    
        h.add(new Hotel4('A', "Patita Frita", 69, 50, 150, 3, 50.0, "Hotel 3", "Direccion 1", "Santa Fe", "Luciano"));
        h.add(new Hotel4('B', "Presa Fresa", 60, 40, 100, 2, 50.0, "Arruga Maruja", "Direccion 2", "San Juan", "Amilcar"));
        h.add(new Hotel5(2, 3, 5, 'A', "Moño Rojo", 50, 60, 120, 3, 50.0, "NetFlix", "Direccion 3", "Buenos Aires", "Pablo"));
        h.add(new Hotel5(1, 5, 3, 'A', "Pio Chicken", 30, 30, 80, 2, 50.0, "Huachin", "Direccion 4", "Cordova", "Bananero"));
        
        precioHabitacion(h);        
                
        Collections.sort(h, Hotel.ordenarPrecioCaroBarato);
        
//        for(Hotel hh: h){
//            System.out.println(hh.toString());
//        }
        
        eh.add(new Camping(45, 10, false, false, 500, "Viento Frio", "Direccion 5", "Huaral", "Pablo"));
        eh.add(new Camping(30, 5, true, false, 650, "Gota Gorda", "Direccion 6", "Huacho", "Luisiana"));
        eh.add(new Residencia(35, true, false, true, 750, "Muerto Tuerto", "Direccion 7", "Lima", "Juan Alberto"));
        eh.add(new Residencia(15, true, false, false, 450, "Al Filo", "Direccion 8", "Campiña", "Carolina"));
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
    
    public void menu(){
        
        int op=0;
        
        System.out.println("---- System Hotel ----");
        
        do{
            
            System.out.println(" 1. Todos los Alojamientos.");
            System.out.println(" 2. Ordenar Hoteles Caros a Barato.");
            System.out.println(" 3. Camping con Restaurante.");
            System.out.println(" 4. Residencias con Descuento.");
            System.out.println("Elija una Opción: ");
            
            op = consola.nextInt();
            
            switch(op){
                
                case 1:
                    System.out.println("Hoteles: \n");
                    for(Hotel hh: h){
                        System.out.println(hh.toString());
                    }
                    System.out.println("ExtraHoteleros: \n");
                    for(ExtraHotelero ex: eh){
                        System.out.println(ex.toString());
                    }
                    break;
                case 2:
                    System.out.println("Hoteles Ordenados: \n");
                    for(Hotel hh: h){
                        System.out.println(hh.toString());
                    }
                    break;
                case 3:
                    for(ExtraHotelero ex: eh){
                        if(ex instanceof Camping){
                            Camping obj = (Camping) ex;    
                            if(obj.getRestaurante()){
                                System.out.println(obj.toString());
                            }
                        }
                    }
                    break;
                case 4:
                    for(ExtraHotelero ex: eh){
                        if(ex instanceof Residencia){
                            Residencia obj = (Residencia) ex;    
                            if(obj.getDescGremios()){
                                System.out.println(obj.toString());
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Error en la OPCION");
            }
        }while(true);
    }
    
}
