import javax.swing.*;

public class Empresa {

    private String nombre;
    private String direccion;
    private int numero;
    private int nit;

    public Empresa() {
    }

    public Empresa(String nombre, String direccion, int numero, int nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
        this.nit = nit;
    }

    public void Leerdatos(){

        nombre = JOptionPane.showInputDialog("Digite el nombre de la empresa: ");
        direccion = JOptionPane.showInputDialog("Digite la dirección de la empresa: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico de la empresa: "));
        nit = Integer.parseInt(JOptionPane.showInputDialog("Digite el NIT de la empresa: "));

        JOptionPane.showMessageDialog(null,"Los datos se ingresaron correctamente");

    }
    public void modificar(){

        String x = "";

        x = JOptionPane.showInputDialog("Desea modificar los datos ingresados S/N:" );

        if(x.equalsIgnoreCase("s")){

            setNombre(JOptionPane.showInputDialog("Digite el nombre de la empresa: "));
            setDireccion(JOptionPane.showInputDialog("Digite la direccion de la empresa: "));
            setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico de la empresa: ")));
            setNit(Integer.parseInt(JOptionPane.showInputDialog("Digite el NIT de la empresa: ")));

            JOptionPane.showMessageDialog(null,"Los datos se modificaron correctamente");
        }
        else {

            JOptionPane.showMessageDialog(null,"Los datos no se modificaron");
        }



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
        return "Los datos ingresados de la Empresa son: " + "Nombre de la empresa:" + nombre + ", Direccion de la empresa:" + direccion +
                ", Numero de la empresa:" + numero + ", NIT de la empresa=" + nit;
    }
}

