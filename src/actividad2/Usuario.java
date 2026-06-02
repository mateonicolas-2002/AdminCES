package actividad2;

public class Usuario {
    String nombre;
    String apellido;
    String paisdenacimiento;
    String email;
    String contraseña;
    String perfil;

    public Usuario(String nombre, String apellido, String paisdenacimiento, String email, String contraseña, String perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisdenacimiento = paisdenacimiento;
        this.email = email;
        this.contraseña = contraseña;
        this.perfil = perfil;
    }
}