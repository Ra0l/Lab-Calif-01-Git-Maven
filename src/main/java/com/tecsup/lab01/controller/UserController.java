package com.tecsup.lab01.controller;
import com.tecsup.lab01.model.User;

public class UserController {
	
	public String obtenerDatos (String nombre, String paterno, int edad) {
		return "Nombre completo: " + nombre + " " + paterno + "\nEdad: " + edad;
	}
}
