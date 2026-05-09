package principal;

public class Usuario {
    public static void main(String[] args) {
        boolean loginExitoso = true;
        int cantidadDeErrores = 0;
        String nombre = "Leonardo";
        String apellido = "Perez";
        String email = "leonardoperez@gmail.com";
        String contraseña = "12345";
        String pais = "Uruguay";
        String perfil = "Administrador";

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Contraseña: " + contraseña);
        System.out.println("País: " + pais);
        System.out.println("Perfil: " + perfil);

    }
}
