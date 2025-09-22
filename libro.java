package tp23232323232323232;

public class libro extends material {
	private String edicion;

	public libro(String titulo, int año, String autor, String edicion) {
		super(titulo, año, autor);
		this.edicion = edicion;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public void mostrarInfo() {
        System.out.println("titulo:  " + getTitulo() + "  del año:  " + getAño() + "  autor: " +  getAutor() + "edicion" + edicion);
		
	} 
}
