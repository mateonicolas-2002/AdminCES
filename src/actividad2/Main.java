package actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 3) {
            mostrarMenu();
            opcion = Integer.parseInt(scan.nextLine());

            if (opcion == 1) {
                login(scan);
            } else if (opcion == 2) {
                registroUsuario(scan);
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no valida, intente de nuevo.");
            }
        }
    }

    static void mostrarMenu() {
        System.out.println("*** MENU ***");
        System.out.println("1. Login");
        System.out.println("2. Registro");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opcion: ");
    }

    static void registroUsuario(Scanner scan) {
        System.out.println("Ingrese nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese apellido: ");
        String apellido = scan.nextLine();
        System.out.println("Ingrese pais de nacimiento: ");
        String paisdenacimiento = scan.nextLine();
        System.out.println("Ingrese email: ");
        String email = scan.nextLine();
        System.out.println("Ingrese contraseña: ");
        String contraseña = scan.nextLine();

        if (buscarUsuario(email) != null) {
            System.out.println("Ya existe un usuario con ese email.");
            return;
        }

        Usuario nuevo = new Usuario(nombre, apellido, paisdenacimiento, email, contraseña, "Administrador");
        usuarios.add(nuevo);
        System.out.println("Usuario registrado con exito.");
    }

    static void login(Scanner scan) {
        System.out.println("Ingrese email: ");
        String emailingresado = scan.nextLine();
        System.out.println("Ingrese contraseña: ");
        String contrasenaingresada = scan.nextLine();

        Usuario encontrado = buscarUsuario(emailingresado);

        if (encontrado == null) {
            System.out.println("Usuario no encontrado.");
        } else if (!encontrado.contraseña.equals(contrasenaingresada)) {
            System.out.println("Contraseña incorrecta.");
        } else {
            System.out.println("Login exitoso, bienvenido " + encontrado.nombre + "!");
        }
    }

    static Usuario buscarUsuario(String email) {
        for (Usuario u : usuarios) {
            if (u.email.equals(email)) {
                return u;
            }
        }
        return null;
    }
}