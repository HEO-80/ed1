package BIBLIOTECA;

import java.util.Calendar;

/**
 * @version 1
 * @author Hector Eduardo Oviedo
 */
public class Libro {
	private String _nombre;
	private String _editorial;
	private Calendar _anio;
	private String _autor;
	private boolean _prestamo;
	public Trabajador _unnamed_Trabajador_;
	public Socio _unnamed_Socio_;

	
	public Libro() {
	}

	/**
	 * 
	 * @param _nombre
	 * @param _editorial
	 * @param _anio
	 * @param _autor
	 * @param _prestamo 
	 */
	public Libro(String _nombre, String _editorial, Calendar _anio, String _autor, boolean _prestamo) {
		this._nombre = _nombre;
		this._editorial = _editorial;
		this._anio = _anio;
		this._autor = _autor;
		this._prestamo = _prestamo;
	}

	/**
	 * 
	 * @return  devuelve el nombre del libro
	 */
	public String getNombre() {
		return _nombre;
	}

	/**
	 * 
	 * @param _nombre se modifica el nombre del libro
	 */
	public void setNombre(String _nombre) {
		this._nombre = _nombre;
	}

	/**
	 * 
	 * @return devuelve la editorial
	 */
	public String getEditorial() {
		return _editorial;
	}

	/**
	 * 
	 * @param _editorial se modifica la editorial
	 */
	public void setEditorial(String _editorial) {
		this._editorial = _editorial;
	}

	/**
	 * 
	 * @return devuelve el año de creación
	 */
	public Calendar getAnio() {
		return _anio;
	}

	/**
	 * 
	 * @param _anio se modifica el año de  creacion
	 */
	public void setAnio(Calendar _anio) {
		this._anio = _anio;
	}

	public String getAutor() {
		return _autor;
	}

	/**
	 * 
	 * @param _autor se modifica el autor
	 */
	public void setAutor(String _autor) {
		this._autor = _autor;
	}

	/**
	 * 
	 * @return  devuelve el estado del prestamo
	 */
	public boolean isPrestamo() {
		return _prestamo;
	}

	/**
	 * 
	 * @param _prestamo se modifica el estado del prestamo
	 */
	public void setPrestamo(boolean _prestamo) {
		this._prestamo = _prestamo;
	}

	
	public void prestamo() {
		throw new UnsupportedOperationException();
	}

	
	public void devolucion() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return toString modificado para mostrar los datos
	 */
	public String mostrarDatos() {
		return "nombre del libro" + _nombre + ", editorial del libro=" + _editorial + ", año de creacion=" + _anio + ", autor del libro" + _autor + ", prestamo =" + _prestamo ;
	}
	
}