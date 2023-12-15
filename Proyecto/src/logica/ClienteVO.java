package logica;

public class ClienteVO {
    private int cedula;
    private String nombreC;
    private String nombre;
    private String direccion;
    private String contraseña;
    private int tarjeta;
    private int pin;
    private int plan;

    public ClienteVO() {
    	
    }
    
    
    public ClienteVO(int cedula, String nombreC, String nombre, String direccion, String contraseña, int tarjeta, int pin, int plan) {
        this.cedula = cedula;
        this.nombreC = nombreC;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contraseña = contraseña;
        this.tarjeta = tarjeta;
        this.pin = pin;
        this.plan = plan;
    }



	public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }


	@Override
	public String toString() {
		return  cedula + "\t" + nombreC + "\t" + nombre + "\t" + direccion
				+ "\t" + contraseña + "\t" + tarjeta + "\t" + pin + "\t" + plan;
	}
    
}