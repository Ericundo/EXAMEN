package entidades;

import java.util.Scanner;

public class Equipo extends Participante {

	private long id;
	private int anioInscripcion;

	public Equipo() {
		super();
	}

	public Equipo(long id, int dorsal, char calle, int anioInscripcion) {
		this.id = id;
		this.dorsal = dorsal;
		this.calle = calle;
		this.anioInscripcion = anioInscripcion;
	}

	public Equipo(Participante p, long id, int anioInscripcion) {
		super(p);
		this.id = id;
		this.anioInscripcion = anioInscripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAnioInscripcion() {
		return anioInscripcion;
	}

	public void setAnioInscripcion(int anioInscripcion) {
		this.anioInscripcion = anioInscripcion;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", anioInscripcion=" + anioInscripcion + ", dorsal=" + dorsal + ", calle=" + calle
				+ "]";
	}

	public static Competicion nuevaCompeticion() {
		Competicion ret = new Competicion();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca el año de la inscripcion:");
		ret.setAnioinscripcion(sc.nextInt());

		sc.close();
		return ret;
	}

	public void setNombre(String nextLine) {

	}

	public void setAnio(int nextInt) {

	}
}
