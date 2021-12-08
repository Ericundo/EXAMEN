package entidades;

import java.util.Scanner;

public class Lugar {

	private String nombre;
	private String ubicacion;
	private boolean airelibre;

	public Lugar() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public boolean isAirelibre() {
		return airelibre;
	}

	public void setAirelibre(boolean airelibre) {
		this.airelibre = airelibre;
	}

	@Override
	public String toString() {
		return "Lugar [nombre=" + nombre + ", ubicacion=" + ubicacion + ", airelibre=" + airelibre + "]";
	}
	public static Lugar nuevoLugar() {
		Lugar ret = new Lugar();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca su nombre:");
		ret.setNombre(sc.nextLong());
		System.out.println("Introduca la ubicacion:");
		ret.setUbicacion(sc.nextLine());
		System.out.println("Introduca si es al aire libre:");
		ret.setAirelibre(sc.nextBoolean());
		
		sc.close();
		return ret;
	}

	private void setNombre(long nextLong) {
		
		
	}

	
	}

