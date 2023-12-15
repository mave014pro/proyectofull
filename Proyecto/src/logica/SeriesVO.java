package logica;

public class SeriesVO {
    private int pin;
    private String nombre;
    private String clasificacion;
    private int temporadas;
    private int duracion;
    private int capitulos;

    public SeriesVO(int pin, String nombre, String clasificacion, int temporadas, int duracion, int capitulos) {
        super();
        this.pin = pin;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.temporadas = temporadas;
        this.duracion = duracion;
        this.capitulos = capitulos;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
}