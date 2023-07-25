
package entidad;

public class Camping extends ExtraHotelero {
    
    protected Integer cantMaxCarpas;
    protected Integer cantBanios;
    protected Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer cantMaxCarpas, Integer cantBanios, Boolean restaurante, Boolean privado, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mtCuadrados, nombre, direccion, localidad, gerente);
        this.cantMaxCarpas = cantMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public Integer getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(Integer cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantMaxCarpas=" + cantMaxCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + '}';
    }
    
    
}
