package entidades;

import java.util.Scanner;


public class Colegiado {

	private long id;
	private String categoria;

	public Colegiado() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Colegiado [id=" + id + ", categoria=" + categoria + "]";
	}
	public static Colegiado nuevoColegiado() {
		Colegiado ret = new Colegiado();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca su categoria:");
		ret.setCategoria(sc.nextLine());

		sc.close();
		return ret;
}
}
