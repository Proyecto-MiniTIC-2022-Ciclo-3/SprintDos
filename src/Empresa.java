import javax.swing.*;

public class Empresa {

    private String nombre;
    private String direccion;
    private int numero;
    private int nit;

    public Empresa(String nombre, String direccion, int numero, int nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {

        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Los datos ingresados de la Empresa son: " + "\n" + "Nombre de la empresa: " + nombre + "\n" + "Direccion de la empresa: " + direccion + "\n"
                + "Numero de la empresa: " + numero + "\n" + "NIT de la empresa: " + nit + "\n";
    }
}

