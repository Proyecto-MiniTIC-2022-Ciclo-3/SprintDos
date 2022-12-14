import javax.swing.*;

public class Empresa {

    private String nombreEmpresa;
    private String direccionEmpresa;
    private int numeroEmpresa;
    private int nitEmpresa;

    public Empresa(String nombreEmpresa, String direccionEmpresa, int numeroEmpresa, int nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.numeroEmpresa = numeroEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public Empresa() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getNumeroEmpresa() {
        return numeroEmpresa;
    }

    public void setNumeroEmpresa(int numeroEmpresa) {
        this.numeroEmpresa = numeroEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    @Override
    public String toString() {
        return "Los datos ingresados de la Empresa son: " + "\n" + "Nombre de la empresa: " + nombreEmpresa + "\n" + "Direccion de la empresa: " + direccionEmpresa + "\n"
                + "Numero de la empresa: " + numeroEmpresa + "\n" + "NIT de la empresa: " + nitEmpresa + "\n";
    }
}

