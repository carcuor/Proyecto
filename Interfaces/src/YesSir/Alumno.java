package YesSir;

import java.util.Objects;

public class Alumno {
	
	private String nombre;
	private int edad;
	
	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	

}
