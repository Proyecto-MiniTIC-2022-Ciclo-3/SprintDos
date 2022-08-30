public class MovimientoDeDinero {

    private float montoMovimiento;
    private String tipoMovimiento;
    private String conceptoMovimiento;
    private Empleado encargadoMovimiento;

    public MovimientoDeDinero(float montomovimiento, String tipomovimiento, String conceptomovimiento, Empleado encargadomovimiento) {
        this.montoMovimiento = montomovimiento;
        this.tipoMovimiento = tipomovimiento;
        this.conceptoMovimiento = conceptomovimiento;
        this.encargadoMovimiento = encargadomovimiento;
    }

    public MovimientoDeDinero() {
    }

    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getEncargadoMovimiento() {
        return encargadoMovimiento;
    }

    public void setEncargadoMovimiento(Empleado encargadoMovimiento) {
        this.encargadoMovimiento = encargadoMovimiento;
    }

    @Override
    public String toString() {
        return "Movimientos de dinero" + "\n" + "Monto del movimiento: " + montoMovimiento + "\n"+ "tipomovimiento: " + tipoMovimiento + "\n" +
                "Concepto del movimiento: " + conceptoMovimiento + "\n" + "Encargado del movimiento: " + encargadoMovimiento.getNombreEmpleado() + "\n";
    }
}
