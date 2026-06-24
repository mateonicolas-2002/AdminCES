package actividad2;

public class Usuario implements Mostrable {
    private String nombre;
    private String apellido;
    private String paisdenacimiento;
    private String email;
    private String contraseña;
    private String perfil;

    public Usuario(String nombre, String apellido, String paisdenacimiento, String email, String contraseña, String perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisdenacimiento = paisdenacimiento;
        this.email = email;
        this.contraseña = contraseña;
        this.perfil = perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPaisdenacimiento() {
        return paisdenacimiento;
    }

    public void setPaisdenacimiento(String paisdenacimiento) {
        this.paisdenacimiento = paisdenacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    public void mostrarInfo() {
        System.out.println("Usuario - " + getNombre() + " - " + getEmail());
    }
}