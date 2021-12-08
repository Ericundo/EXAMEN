package entidades;

import java.util.Scanner;

public class Plata {

	private long id;
	private float pureza;

	public Plata() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPureza() {
		return pureza;
	}

	public void setPureza(float pureza) {
		this.pureza = pureza;
	}

	@Override
	public String toString() {
		return "Plata [id=" + id + ", pureza=" + pureza + "]";
	}
	public static Plata nuevaPlata() {
		Plata ret = new Plata();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca la pureza:");
		ret.setAltura(sc.nextFloat());

		sc.close();
		return ret;
	}

	private void setAltura(float nextFloat) {
		
		
	}
}
