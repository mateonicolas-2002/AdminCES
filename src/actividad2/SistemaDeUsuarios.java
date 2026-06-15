package actividad2;

import java.util.Scanner;

public class SistemaDeUsuarios {

    static Usuario[] usuarios = new Usuario[10];
    static int cantidadUsuarios = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        usuarios[cantidadUsuarios] = new Usuario("Camila", "Chiarelli", "Argentina", "cami@gmail.com", "1234", "Usuario");
        cantidadUsuarios++;

        usuarios[cantidadUsuarios] = new Admin("Agustina", "Perez", "Uruguay", "agus@gmail.com", "abcd", "Total", "Si");
        cantidadUsuarios++;

        usuarios[cantidadUsuarios] = new Tester("Mateo", "Sosa", "Chile", "mate@gmail.com", "aeiou", "Backend");
        cantidadUsuarios++;

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

        Usuario nuevo = new Usuario(nombre, apellido, paisdenacimiento, email, contraseña, "Usuario");
        usuarios[cantidadUsuarios] = nuevo;
        cantidadUsuarios++;
        System.out.println("Usuario registrado con exito.");
    }

    static void login(Scanner scan) {
        System.out.println("Ingrese email: ");
        String emailingresado = scan.nextLine();
        System.out.println("Ingrese contraseña: ");
        String contraseñaingresada = scan.nextLine();

        Usuario encontrado = buscarUsuario(emailingresado);

        if (encontrado == null) {
            System.out.println("Usuario no encontrado.");
        } else if (!encontrado.getContraseña().equals(contraseñaingresada)) {
            System.out.println("Contraseña incorrecta.");
        } else {
            System.out.println("Login exitoso, bienvenido " + encontrado.getNombre() + "!");
        }
    }
    static Usuario buscarUsuario(String email) {
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (usuarios[i].getEmail().equals(email)) {
                return usuarios[i];
            }
        }
        return null;
    }
}