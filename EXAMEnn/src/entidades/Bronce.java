package entidades;

import java.util.Scanner;

public class Bronce {

	private long id;
	private float pureza;

	public Bronce() {
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
		return "Bronce [id=" + id + ", pureza=" + pureza + "]";
	}

	public static Bronce nuevoBronce() {
		Bronce ret = new Bronce();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca la pureza:");
		ret.setPureza(sc.nextFloat());

		sc.close();
		return ret;
	}
}
