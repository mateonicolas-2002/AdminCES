package actividad2;

public class Admin extends Usuario {
    private String nivelAcceso;
    private String puedeEliminarUsuarios;

    public String getPuedeEliminarUsuarios() {
        return puedeEliminarUsuarios;
    }

    public void setPuedeEliminarUsuarios(String puedeEliminarUsuarios) {
        this.puedeEliminarUsuarios = puedeEliminarUsuarios;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public Admin(String nombre, String apellido, String paisdenacimiento, String email, String contraseña, String nivelAcceso, String puedeEliminarUsuarios) {
        super(nombre, apellido, paisdenacimiento, email, contraseña, "Admin");
        this.nivelAcceso = nivelAcceso;
        this.puedeEliminarUsuarios = puedeEliminarUsuarios;
    }

}