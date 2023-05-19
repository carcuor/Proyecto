package YesSir;

public class Vista {
	
	private Principal controlador;
	private VentanaPpal ventanaPpal;
	private DialogoAltaAlumno dialogoAltaAlumno;
	
	
	public Vista(Principal controlador) {
		super();
		this.controlador = controlador;
		this.ventanaPpal = ventanaPpal;
		this.dialogoAltaAlumno = new DialogoAltaAlumno(this);
		this.mostrarVentanaPrincipal();
	}

	public void mostrarVentanaPrincipal() {
		this.ventanaPpal.setVisible(true);
	}
	
	public void menuAltaPulsado() {
		this.dialogoAltaAlumno.setVisible(true);
	}
	
	public void altaAlumno(String nombre, int edad) {
		this.controlador.altaAlumno(nombre, edad);
	}

	public String getListaCompleto() {
		return this.controlador.getListaCompleto();
	}
}
