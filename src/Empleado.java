public class Empleado  {

    private String nombreempleado;
    private String correoempleado;
    private Empresa empresaempleado;
    private String rol;

    public Empleado(String nombreempleado, String correoempleado, Empresa empresaempleado, String rol) {
        this.nombreempleado = nombreempleado;
        this.correoempleado = correoempleado;
        this.empresaempleado = empresaempleado;
        this.rol = rol;
    }

    public Empleado() {
    }

    public String getNombreempleado() {
        return nombreempleado;
    }

    public void setNombreempleado(String nombreempleado) {
        this.nombreempleado = nombreempleado;
    }

    public String getCorreoempleado() {
        return correoempleado;
    }

    public void setCorreoempleado(String correoempleado) {
        this.correoempleado = correoempleado;
    }

    public Empresa getEmpresaempleado() {
        return empresaempleado;
    }

    public void setEmpresaempleado(Empresa empresaempleado) {
        this.empresaempleado = empresaempleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Los datos ingresados del Empleado son:" + "\n" + "Nombre empleado: " + nombreempleado + "\n" + "Correo empleado: " + correoempleado + "\n" +
                "Empresa empleado:" + "\n" + empresaempleado + "Rol: " + rol + "\n";
    }
}
