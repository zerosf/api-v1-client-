package com.client.restful.model;

public class Cliente {

	private String nombre;
	private String correo;
	private String direccion;
	private String telefono;

	public Cliente() {
	}

	public Cliente(String nombre, String correo, String direccion, String telefono) {
		this.nombre = nombre;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
