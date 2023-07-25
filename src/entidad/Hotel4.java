
package entidad;


public class Hotel4 extends Hotel {
    
    protected Character tipoGimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(Character tipoGimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer nroHabitaciones, Integer nroCamas, Integer cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nroHabitaciones, nroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Character getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(Character tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "tipoGimnasio=" + tipoGimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", nroHabitaciones=" + nroHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }
    
    public Double precioHabitacion(Integer cantidadRestaurante, Character gimnasio, Integer cantidadHabitacion){
        
        Double precio =0.0;
        
        //valor restaurante
        if(cantidadRestaurante<30){
            precio +=10;
        }if(cantidadRestaurante<50){            
            precio +=30;
        }else{               
            precio +=50;
        }
        
        //valor gimnasio
        if(gimnasio.equals('A')){
            precio+=50;
        }else{
            precio+=30;
        }
        
        precio+=cantidadHabitacion;
        
        return precio;
    }
    
}
