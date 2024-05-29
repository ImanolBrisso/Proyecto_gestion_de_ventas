package com.ingresarsesion;
import usuarios.Usuarios;
import java.util.Scanner;

public class IngresarSesion {
    private static final String USUARIO_CORRECTO = "usuario";
    private static final String CONTRASENA_CORRECTA = "contrasena";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contrasena = scanner.nextLine();

        if (validarUsuario(usuario, contrasena)) {
            System.out.println("Bienvenido, " + usuario + ". Has logrado iniciar correctamente.");
        } else {
            System.out.println("Usuario incorrecto. Por favor, intente nuevamente");
        }

        scanner.close();
    }

    private static boolean validarUsuario(String usuario, String contrasena) {
        return usuario.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA);
    }
}
