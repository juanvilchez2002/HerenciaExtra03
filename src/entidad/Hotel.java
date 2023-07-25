/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Comparator;


public class Hotel extends Alojamiento{
    
    protected Integer nroHabitaciones;
    protected Integer nroCamas;
    protected Integer cantPisos;
    protected Double precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer nroHabitaciones, Integer nroCamas, Integer cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.nroHabitaciones = nroHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Integer getNroHabitaciones() {
        return nroHabitaciones;
    }

    public void setNroHabitaciones(Integer nroHabitaciones) {
        this.nroHabitaciones = nroHabitaciones;
    }

    public Integer getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(Integer nroCamas) {
        this.nroCamas = nroCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nroHabitaciones=" + nroHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }
    
    public static Comparator<Hotel> ordenarPrecioCaroBarato = new Comparator<>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o2.getPrecioHabitacion().compareTo(o1.getPrecioHabitacion());
        }
    };
    
    
    
}
