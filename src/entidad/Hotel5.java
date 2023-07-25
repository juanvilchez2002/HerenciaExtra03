
package entidad;

public class Hotel5 extends Hotel4 {
    
    private Integer cantSalonesConferencia;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(Integer cantSalonesConferencia, Integer cantSuites, Integer cantLimosinas, Character tipoGimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer nroHabitaciones, Integer nroCamas, Integer cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(tipoGimnasio, nombreRestaurante, capacidadRestaurante, nroHabitaciones, nroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(Integer cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "cantSalonesConferencia=" + cantSalonesConferencia + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + ", nroHabitaciones=" + nroHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + "tipoGimnasio=" + tipoGimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", nroHabitaciones=" + nroHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }   

    public Double precioHabitacion(Integer cantidadRestaurante, Character gimnasio, Integer cantidadLimosna, Integer cantidadHabitacion) {
        return super.precioHabitacion(cantidadRestaurante, gimnasio,  cantidadHabitacion)+(cantidadLimosna*15); 
    }
    
    
}
