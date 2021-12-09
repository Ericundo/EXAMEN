package entidades;

import java.util.Scanner;

public class Participante {

	protected long id;
	protected int dorsal;
	protected char calle;

	public Participante() {
	}

	public Participante(long id, int dorsal, char calle) {
		this.id = id;
		this.dorsal = dorsal;
		this.calle = calle;
	}
	
	public Participante (Participante p) {
		this.id = p.id;
		this.dorsal = p.dorsal;
		this.calle = p.calle;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public char getCalle() {
		return calle;
	}

	public void setCalle(char calle) {
		this.calle = calle;
	}

	@Override
	public String toString() {
		return "Participante [id=" + id + ", dorsal=" + dorsal + ", calle=" + calle + "]";
	}
	public static Participante nuevoParticipante() {
		Participante ret = new Participante();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca su dorsal:");
		ret.setDorsal(sc.nextInt());
		System.out.println("Introduca su calle:");
		ret.setCalle(sc.nextInt());
		
		sc.close();
		return ret;
	}

	private void setCalle(int nextInt) {
		
		
	}
}
