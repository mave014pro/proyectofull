package logica;

public class PeliculasVO {
private int pin;
private String nombre;
private String clasificacion;
private int duracion;
private String director;
private String estreno;
public PeliculasVO(int pin, String nombre, String clasificacion, int dur, String director, String estreno) {
	super();
	this.pin = pin;
	this.nombre = nombre;
	this.clasificacion = clasificacion;
	this.duracion = dur;
	this.director = director;
	this.estreno = estreno;
}
public PeliculasVO(String nomP, int pinP, String dirP, String clasiP, int dur) {
	// TODO Auto-generated constructor stub
}


public void apeliculas1(int pinP, String nomP, String clasiP, int dur, String dirP, String est) {
	// TODO Auto-generated constructor stub
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
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getEstreno() {
	return estreno;
}
public void setEstreno(String estreno) {
	this.estreno = estreno;
}
@Override
public String toString() {
	return "PeliculasVO [pin=" + pin + ", nombre=" + nombre + ", clasificacion=" + clasificacion + ", duracion="
			+ duracion + ", director=" + director + ", estreno=" + estreno + "]";
}




}
