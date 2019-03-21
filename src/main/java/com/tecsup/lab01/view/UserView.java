package com.tecsup.lab01.view;

import javax.swing.JOptionPane;

import com.tecsup.lab01.controller.UserController;

public class UserView {

	public static void main(String[] args) {
		UserController x = new UserController();
		String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre: ");
		String paterno = JOptionPane.showInputDialog(null, "Ingrese paterno: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad: "));
		JOptionPane.showMessageDialog(null, x.obtenerDatos(nombre, paterno, edad));
	}

}
