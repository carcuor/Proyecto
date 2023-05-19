package YesSir;

import java.util.HashSet;

public class Modelo {
	
	//private int nAlumnos;
	//private Alumno[] tAlumnos = new Alumno[10];
	
	HashSet <Alumno> cAlumnos = new HashSet<>();
	
	public Modelo() {
		super();
	}

	public void addAlumno(String nombre, int edad) {
		Alumno a1 = new Alumno(nombre, edad);
		cAlumnos.add(a1);
		
	}

	public String getListaCompleto() {
		String res = "";
		for(int i = 0; i<n.Alumnos)
		
		return res;
	}

}
