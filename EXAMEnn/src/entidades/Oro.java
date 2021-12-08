package entidades;

import java.util.Scanner;

public class Oro {

	private long id;
	private float pureza;

	public Oro() {
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
		return "Oro [id=" + id + ", pureza=" + pureza + "]";
	}
	public static Oro nuevoOro() {
		Oro ret = new Oro();
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
