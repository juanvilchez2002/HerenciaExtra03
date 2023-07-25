
package entidad;

public class Residencia extends ExtraHotelero {
    
    private Integer cantiHabitaciones;
    private Boolean descGremios;
    private Boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantiHabitaciones, Boolean descGremios, Boolean campoDeportivo, Boolean privado, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mtCuadrados, nombre, direccion, localidad, gerente);
        this.cantiHabitaciones = cantiHabitaciones;
        this.descGremios = descGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantiHabitaciones() {
        return cantiHabitaciones;
    }

    public void setCantiHabitaciones(Integer cantiHabitaciones) {
        this.cantiHabitaciones = cantiHabitaciones;
    }

    public Boolean getDescGremios() {
        return descGremios;
    }

    public void setDescGremios(Boolean descGremios) {
        this.descGremios = descGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantiHabitaciones=" + cantiHabitaciones + ", descGremios=" + descGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
}
