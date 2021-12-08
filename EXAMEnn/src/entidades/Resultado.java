package entidades;

import java.util.Scanner;

import java.time.LocalDateTime;

public class Resultado {

	private long id;
	private boolean definitivo = false;
	private LocalDateTime fechaHora;

	public Resultado() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isDefinitivo() {
		return definitivo;
	}

	public void setDefinitivo(boolean definitivo) {
		this.definitivo = definitivo;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	@Override
	public String toString() {
		return "Resultado [id=" + id + ", definitivo=" + definitivo + ", fechaHora=" + fechaHora + "]";
	}
	public static Resultado nuevoResultado() {
		Resultado ret = new Resultado();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca el id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca la fecha y la hora:");
		ret.setFechaHora(sc.nextLine());
		
		sc.close();
		return ret;
	}

	private void setFechaHora(String nextLine) {
		
		
	}

}
