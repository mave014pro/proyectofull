package logica;

import java.util.ArrayList;

public class Arraylistclientes {

	private ArrayList<ClienteVO>arrayCli;
	
	public Arraylistclientes() {
		arrayCli=new ArrayList<>();
	}
	
	public void agregar(ClienteVO reCl) {
		arrayCli.add(reCl);
	}
	
	public ClienteVO devolver(int i) {
		return(arrayCli.get(i));
	}
	
	public String toString() {
		String lista="cedula\tnombreC\tnombre\tdireccion\tcontraseña\ttarjeta\tpin\tplan\n";
		
		for(int i=0; i<arrayCli.size(); i++) {
			lista=lista+arrayCli.get(i).toString()+"\n";
		}
		return lista;
	}

	public int cantidad() {
		return 0;
}

}
