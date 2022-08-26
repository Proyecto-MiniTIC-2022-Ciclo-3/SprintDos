public class Empleado  {

    private String nombreempleado;
    private String correoempleado;
    private String empresaempleado;
    private String rol;

    public Empleado( String nombreempleado, String correoempleado, String empresaempleado, String rol) {

        this.nombreempleado = nombreempleado;
        this.correoempleado = correoempleado;
        this.empresaempleado = empresaempleado;
        this.rol = rol;
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

    public String getEmpresaempleado() {
        return empresaempleado;
    }

    public void setEmpresaempleado(String empresaempleado) {
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
                "Empresa empleado:" + empresaempleado + "\n" + "Rol: " + rol + "\n";
    }
}
