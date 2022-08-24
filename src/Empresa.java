import javax.swing.*;

public class Empresa {

    private String nombreEmpresa;
    private String direccionEmpresa;
    private int numeroTelefonico;
    private int nitEmpresa;

    public Empresa() {
    }

//    Definición del constructor


    public Empresa(String nombreEmpresa, String direccionEmpresa, int numeroTelefonico, int nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.numeroTelefonico = numeroTelefonico;
        this.nitEmpresa = nitEmpresa;
    }

    //    Definir los Getter

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    //Definir los Setter

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    //    Definición de los métodos
    public void Leerdatos(){

        nombreEmpresa = JOptionPane.showInputDialog("Digite el nombre de la empresa: ");
        direccionEmpresa = JOptionPane.showInputDialog("Digite la dirección de la empresa: ");
        numeroTelefonico = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico de la empresa: "));
        nitEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Digite el NIT de la Empresa: "));

    }

    //  Convertir a string los datos

    public String toString(){

        return "Empresa{"+"Nombre de la empresa= "+nombreEmpresa+" , Dirección de la empresa ="+direccionEmpresa+" , Teléfono de la empresa= "+numeroTelefonico+" , Nit de la empresa= "+nitEmpresa+'}';
    }
}

