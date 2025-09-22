package tp23232323232323232;

public class revista extends material {
	private String editorial;

	public revista(String titulo, int año, String autor, String editorial) {
		super(titulo, año, autor);
		this.editorial = editorial;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public void mostrarInfo() {
        System.out.println("titulo:  " + getTitulo() + "  del año:  " + getAño() + "  autor: " + getAutor() + "editorial"+ editorial);
		
	} 

}
