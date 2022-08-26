public class MovimientoDeDinero {

    private double montomovimiento;
    private String tipomovimiento;
    private String conceptomovimiento;
    private String encargadomovimiento;

    public MovimientoDeDinero(double montomovimiento, String tipomovimiento, String conceptomovimiento, String encargadomovimiento) {
        this.montomovimiento = montomovimiento;
        this.tipomovimiento = tipomovimiento;
        this.conceptomovimiento = conceptomovimiento;
        this.encargadomovimiento = encargadomovimiento;
    }

    public double getMontomovimiento() {
        return montomovimiento;
    }

    public void setMontomovimiento(double montomovimiento) {
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

    public String getEncargadomovimiento() {
        return encargadomovimiento;
    }

    public void setEncargadomovimiento(String encargadomovimiento) {
        this.encargadomovimiento = encargadomovimiento;
    }

    @Override
    public String toString() {
        return "Movimientos de dinero" + "\n" + "Monto del movimiento: " + montomovimiento + "\n"+ "tipomovimiento: " + tipomovimiento + "\n" +
                "Concepto del movimiento: " + conceptomovimiento + "\n" + "Encargado del movimiento: " + encargadomovimiento + "\n";
    }
}
