
package entidad;


public class ExtraHotelero extends Alojamiento {
    
    protected Boolean privado;
    protected Integer mtCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(Boolean privado, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mtCuadrados = mtCuadrados;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getMtCuadrados() {
        return mtCuadrados;
    }

    public void setMtCuadrados(Integer mtCuadrados) {
        this.mtCuadrados = mtCuadrados;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", mtCuadrados=" + mtCuadrados + '}';
    }    
}
