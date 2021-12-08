package entidades;

import java.util.Scanner;

public class Manager {

	private long id;
	private String telefono;
	private String direccion;

	public Manager() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
	public static Manager nuevoManager() {
		Manager ret = new Manager();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca su id:");
		ret.setId(sc.nextLong());
		System.out.println("Introduca su telefono:");
		ret.setTelefono(sc.nextLine());
		System.out.println("Introduca su direccion:");
		ret.setDireccion(sc.nextLine());
		
		sc.close();
		return ret;
	}
}
