package entidades;

import java.util.Scanner;

public class Competicion {

	private long id;
	private String nombre;
	private int anio;

	public Competicion() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Competicion [id=" + id + ", nombre=" + nombre + ", anio=" + anio + "]";
	}

	public static Equipo nuevoEquipo() {
		Equipo ret = new Equipo();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca su nombre:");
		ret.setNombre(sc.nextLine());
		System.out.println("Introduca el año:");
		ret.setAnio(sc.nextInt());
		
		sc.close();
		return ret;
	}

	public void setAnioinscripcion(int nextInt) {
		
		
	}
}
