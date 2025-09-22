package tp23232323232323232;

public abstract class material {
	private String titulo;
	private String autor;
	private int año;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public material(String titulo, int año,String autor) {
        this.titulo = titulo;
        this.año = año;
        this.autor= autor;
    }
	public void mostrarInfo() {
        System.out.println("titulo:  " + titulo + "  del año:  " + año + "  autor: " + autor);
		
	} 
	

}
