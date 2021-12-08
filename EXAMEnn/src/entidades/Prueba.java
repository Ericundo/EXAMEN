package entidades;

import java.util.Scanner;

import java.util.Date;

public class Prueba {

	private long id;
	private String nombre;
	private Date fecha;
	private boolean individual;

	public Prueba() {
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isIndividual() {
		return individual;
	}

	public void setIndividual(boolean individual) {
		this.individual = individual;
	}

	@Override
	public String toString() {
		return "Prueba [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", individual=" + individual + "]";
	}
	public static Prueba nuevaPrueba() {
		Prueba ret = new Prueba();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca su nombre:");
		ret.setNombre(sc.nextLine());
		System.out.println("Introduca la fecha:");
		ret.setFecha(sc.nextDouble());
		System.out.println("Introduca si es una prueba individual:");
		ret.setIndividual(sc.nextBoolean());
		
		sc.close();
		return ret;
	}

	private void setFecha(double nextDouble) {
		
		
	}
}
