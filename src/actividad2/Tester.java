package actividad2;

public class Tester extends Usuario {
    private String nivelAcceso;

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public Tester(String nombre, String apellido, String paisdenacimiento, String email, String contraseña, String nivelAcceso) {
        super(nombre, apellido, paisdenacimiento, email, contraseña,"Tester");
        this.nivelAcceso = nivelAcceso;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("TESTER - " + getNombre() + " - Area: " + getNivelAcceso());
    }




}