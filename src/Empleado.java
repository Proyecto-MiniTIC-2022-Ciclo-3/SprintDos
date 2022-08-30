public class Empleado  {

    private String nombreEmpleado;
    private String correoEmpleado;
    private Empresa empresaEmpleado;
    private String rolEmpleado;

    public Empleado(String nombreEmpleado, String correoEmpleado, Empresa empresaEmpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public Empleado() {
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    @Override
    public String toString() {
        return "Los datos ingresados del Empleado son:" + "\n" + "Nombre empleado: " + nombreEmpleado + "\n" +
                "Correo empleado: " + correoEmpleado + "\n" + "Empresa empleado:" + empresaEmpleado.getNombreEmpresa() +
                "\n" + "Rol: " + rolEmpleado + "\n";
    }
}
