package entidades;

import java.util.Scanner;

public class Atleta extends Participante {

	private long id;
	private float altura;
	private float peso;

	public Atleta() {
		super();
	}

	public Atleta(long id, int dorsal, char calle, float altura, float peso) {
		this.id = id;
		this.dorsal = dorsal;
		this.calle = calle;
		this.altura = altura;
		this.peso = peso;
	}

	public Atleta(Participante p, long id, float altura, float peso) {
		super(p);
		this.id = id;
		this.altura = altura;
		this.peso = peso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Atleta [id=" + id + ", altura=" + altura + ", peso=" + peso + ", dorsal=" + dorsal + ", calle=" + calle
				+ "]";
	}

	public static Atleta nuevoAtleta() {
		Atleta ret = new Atleta();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca la altura:");
		ret.setAltura(sc.nextFloat());
		System.out.println("Introduca el peso:");
		ret.setPeso(sc.nextFloat());

		sc.close();
		return ret;

	}

	public void setCategoria(String nextLine) {

	}
}
