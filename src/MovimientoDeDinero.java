public class MovimientoDeDinero {

    private float montomovimiento;
    private String tipomovimiento;
    private String conceptomovimiento;
    private Empleado encargadomovimiento;

    public MovimientoDeDinero(float montomovimiento, String tipomovimiento, String conceptomovimiento, Empleado encargadomovimiento) {
        this.montomovimiento = montomovimiento;
        this.tipomovimiento = tipomovimiento;
        this.conceptomovimiento = conceptomovimiento;
        this.encargadomovimiento = encargadomovimiento;
    }

    public MovimientoDeDinero() {
    }

    public float getMontomovimiento() {
        return montomovimiento;
    }

    public void setMontomovimiento(float montomovimiento) {
        this.montomovimiento = montomovimiento;
    }

    public String getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(String tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public String getConceptomovimiento() {
        return conceptomovimiento;
    }

    public void setConceptomovimiento(String conceptomovimiento) {
        this.conceptomovimiento = conceptomovimiento;
    }

    public Empleado getEncargadomovimiento() {
        return encargadomovimiento;
    }

    public void setEncargadomovimiento(Empleado encargadomovimiento) {
        this.encargadomovimiento = encargadomovimiento;
    }

    @Override
    public String toString() {
        return "Movimientos de dinero" + "\n" + "Monto del movimiento: " + montomovimiento + "\n"+ "tipomovimiento: " + tipomovimiento + "\n" +
                "Concepto del movimiento: " + conceptomovimiento + "\n" + "Encargado del movimiento: " + encargadomovimiento + "\n";
    }
}
