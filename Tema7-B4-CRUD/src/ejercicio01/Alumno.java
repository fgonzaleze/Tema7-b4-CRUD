package ejercicio01;

public class Alumno {
	
	/**
	 * Atributo donde irá el nombre del alumno
	 */
	private String nombre;
	/**
	 * Nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Obtiene el nombre del alumno
	 * 
	 * @return devuelve el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del alumno
	 * 
	 * @param nombre nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la nota media del alumno
	 * 
	 * @return devuleve la nota media
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Para la nota media del alumno
	 * 
	 * @param media media del alumno
	 */
	public void setNotaMedia(double media) {
		this.notaMedia = media;
	}

	/**
	 * Constructor sin parametros
	 */
	public Alumno() {

	}

	/**
	 * Constructor con parametros para el alumno
	 * 
	 * @param nombre nom del alumno
	 * @param notaMedia nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno:" + nombre + " Nota:" + notaMedia;
	}
}
